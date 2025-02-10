package oclCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;

public class OCLSet<E> extends HashSet<E> implements OCLUniqueCollection<E>, OCLSetInterface<E>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<E> noInfiniteLoop;
	
	public OCLSet() {
		super();
	}
	
	public OCLSet(Collection<? extends E> collection) {
		super(collection);
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

	@SuppressWarnings("unchecked")
	@Override
	public <T> OCLBag<T> collect(OneArgExp<E, T> exp) {
		OCLBag<T> result = new OCLBag<>();
		System.out.println("SET");
		this.forEach(e -> {
			T appliedResult = exp.apply(e);
			if (appliedResult instanceof Collection) {
				result.addAll((Collection<T>) appliedResult);
			} else {
				result.add(appliedResult);
			}
		});
		return result;
	}

	@Override
	public <T> OCLBag<T> collectNested(OneArgExp<E, T> exp) {
		OCLBag<T> result = new OCLBag<>();
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
	public OCLSet<E> reject(OneArgExp<E, Boolean> exp) {
		OCLSet<E> result = new OCLSet<>();
		this.forEach(e -> {
			if (!exp.apply(e)) {
				result.add(e);
			}
		});
		return result;
	}

	@Override
	public OCLSet<E> select(OneArgExp<E, Boolean> exp) {
		OCLSet<E> result = new OCLSet<>();
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

	@Override
	public OCLSet<E> closure(OneArgExp<E, EList<E>> exp) {
		OCLSet<E> oclSet = new OCLSet<E>();
		this.noInfiniteLoop = new ArrayList<E>();
		return closureRec(oclSet, exp);
	}
	
	public <T extends EList<E>> OCLSet<E> closureRec(OCLSet<E> oclSet, OneArgExp<E, T> exp) {
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
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	

}



