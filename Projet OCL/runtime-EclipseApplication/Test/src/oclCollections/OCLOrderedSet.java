

package oclCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;

public class OCLOrderedSet<E> extends LinkedHashSet<E> implements OCLOrderedCollection<E>, OCLUniqueCollection<E>, OCLOrderedSetInterface<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<E> noInfiniteLoop;
	
	public OCLOrderedSet() {
		super();
	}
	
	public OCLOrderedSet(Collection<? extends E> collection) {
		super(collection);
	}

	@Override
	public OCLOrderedSet<E> closure(OneArgExp<E, EList<E>> exp) {
		OCLOrderedSet<E> oclSet = new OCLOrderedSet<E>();
		this.noInfiniteLoop = new ArrayList<E>();
		return closureRec(oclSet, exp);
	}
	
	public <T extends EList<E>> OCLOrderedSet<E> closureRec(OCLOrderedSet<E> oclSet, OneArgExp<E, T> exp) {
		this.forEach(e -> {
			if (!this.noInfiniteLoop.contains(e)) {
				this.noInfiniteLoop.add(e);
				oclSet.add(e);
				if (exp.apply(e).size() > 0) {
					oclSet.addAll(new OCLOrderedSet<E>(exp.apply(e)));
					closureRec(oclSet, exp);
				}
			}
		});
		return oclSet;
	}
	
	@Override
	public E any(OneArgExp<E, Boolean> exp) {
		for (E i : this) {
			if (exp.apply(i)) {
				return i;
			}
		}
		return null;
	}

	@Override
	public <T> OCLSequence<T> collect(OneArgExp<E, T> exp) {
		OCLSequence<T> resultCollect = new OCLSequence<>();
		OCLSequence<T> resultCollectFlatten = new OCLSequence<>();
		this.forEach(e  -> resultCollect.add(exp.apply(e)));
		flattenCollectRec(resultCollect, resultCollectFlatten);
		return resultCollectFlatten;
	}

	@SuppressWarnings("unchecked")
	private <T> void flattenCollectRec(Collection<?> resultCollect, Collection<T> resultCollectFlatten) {
		resultCollect.forEach(e -> {
			if (e instanceof Collection<?>) {
				flattenCollectRec((OCLSequence<?>) e, resultCollectFlatten);
			} else {
				try {
					resultCollectFlatten.add((T) e);
				} catch (ClassCastException er) {
					System.out.println("element "+ e + "doesn't have the right type");
				}
			}
		});
	}

	@Override
	public <T> OCLSequence<T> collectNested(OneArgExp<E, T> exp) {
		OCLSequence<T> result = new OCLSequence<>();
		this.forEach(e -> result.add(exp.apply(e)));
		return result;
	}

	@Override
	public boolean exists(OneArgExp<E, Boolean> exp) {
		for (E i : this) {
			if (exp.apply(i)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean exists(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		for (E i : this) {
			if (exp1.apply(i) && exp2.apply(i)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp) {
		boolean res = true;
		for (E i : this) {
			if (!exp.apply(i)) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		boolean res = true;
		for (E i : this) {
			if (!exp1.apply(i)) {
				res = false;
			} else if (!exp2.apply(i)) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public <T> boolean isUnique(OneArgExp<E, T> exp) {
		return true;
	}

	@Override
	public <T> T iterate(T init, TwoArgExp<E, T, T> exp) {
		T acc = init;
		for (E i : this) {
			acc = exp.apply(i, acc);
		}
		return acc;
	}

	@Override
	public boolean one(OneArgExp<E, Boolean> exp) {
		
		Stream<E> st = this.stream();
		st = st.filter(a -> exp.apply(a));
		
		return st.count() > 0;
	}

	@Override
	public OCLOrderedSet<E> reject(OneArgExp<E, Boolean> exp) {
		OCLOrderedSet<E> result = new OCLOrderedSet<>();
		this.forEach(e -> {
			if (!exp.apply(e)) {
				result.add(e);
			}
		});
		return result;
	}

	@Override
	public OCLCollection<E> select(OneArgExp<E, Boolean> exp) {
		OCLOrderedSet<E> result = new OCLOrderedSet<>();
		this.forEach(e -> {
			if (exp.apply(e)) {
				result.add(e);
			}
		});
		return result;
	}

	@Override
	public <T extends Comparable<T>> OCLOrderedSet<E> sortedBy(OneArgExp<E, T> exp) {
	    List<E> sortedList = this.stream()
	                             .sorted((e1, e2) -> exp.apply(e1).compareTo(exp.apply(e2)))
	                             .collect(Collectors.toList());
	    return new OCLOrderedSet<>(new LinkedHashSet<>(sortedList));
	}


	
}





