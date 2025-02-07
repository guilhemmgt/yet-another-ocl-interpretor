package oclCollections;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

public class OCLSequence<E> extends ArrayList<E>
		implements OCLOrderedCollection<E>, OCLUniqueCollection<E>, OCLSequenceInterface<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<E> noInfiniteLoop;

	public OCLSequence() {
		super();
	}
	
	public OCLSequence(Collection<? extends E> collection) {
		super(collection);
	}

	public static <T> OCLSequence<T> fromArrayList(Collection<T> eList) {
		OCLSequence<T> oclList = new OCLSequence<>();
		oclList.addAll(eList);
		return oclList;
	}
	
	public static <T> OCLCollection<T> fromArrayList(OCLCollection<T> eList) {
		return eList;
	}

	@Override
	public OCLOrderedSet<E> closure(OneArgExp<E, EList<E>> exp) {
		OCLOrderedSet<E> oclSet = new OCLOrderedSet<E>();
		this.noInfiniteLoop = new ArrayList<E>();
		return closureRec(oclSet, exp);
	}

	public OCLOrderedSet<E> closureRec(OCLOrderedSet<E> oclSet, OneArgExp<E, EList<E>> exp) {
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

	@SuppressWarnings("unchecked")
	@Override
	public <T> OCLSequence<T> collect(OneArgExp<E, T> exp) {
		OCLSequence<T> result = new OCLSequence<>();
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
	public <T> OCLSequence<T> collectNested(OneArgExp<E, T> exp) {
		OCLSequence<T> result = new OCLSequence<>();
		this.forEach(e -> result.add(exp.apply(e)));
		return result;
	}

	@Override
	public OCLSequence<E> reject(OneArgExp<E, Boolean> exp) {
		OCLSequence<E> result = new OCLSequence<>();
		this.forEach(e -> {
			if (!exp.apply(e)) {
				result.add(e);
			}
		});
		return result;
	}

	@Override
	public OCLSequence<E> select(OneArgExp<E, Boolean> exp) {
		OCLSequence<E> result = new OCLSequence<>();
		this.forEach(e -> {
			if (exp.apply(e)) {
				result.add(e);
			}
		});
		return result;
	}

	@Override
	public <T extends Comparable<T>> OCLSequence<E> sortedBy(OneArgExp<E, T> exp) {
		this.sort((e1, e2) -> exp.apply(e1).compareTo(exp.apply(e2)));
		return this;
	}

	@Override
	public E any(OneArgExp<E, Boolean> exp) {
		for (int i = 0; i < this.size(); i++) {
			if (exp.apply(this.get(i))) {
				return this.get(i);
			}
		}
		return null;
	}

	@Override
	public <T> boolean isUnique(OneArgExp<E, T> exp) {
		boolean result = true;
		for (int i = 0; i < this.size(); i++) {
			T e = exp.apply(this.get(i));
			for (int j = 0; j < this.size(); j++) {
				if (e.equals(exp.apply(this.get(j))) && i != j) {
					result = false;
				}
			}
		}
		return result;
	}
	
	@Override
	public boolean exists(OneArgExp<E, Boolean> exp) {
		for (int i = 0; i < this.size(); i++) {
			if (exp.apply(this.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean exists(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		for (int i = 0; i < this.size(); i++) {
			if (exp1.apply(this.get(i)) && exp2.apply(this.get(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp) {
		boolean res = true;
		for (int i = 0; i < this.size(); i++) {
			if (!exp.apply(this.get(i))) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		boolean res = true;
		for (int i = 0; i < this.size(); i++) {
			if (!exp1.apply(this.get(i)) || !exp2.apply(this.get(i))) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public <T> T iterate(T init, TwoArgExp<E, T, T> exp) {
		T acc = init;
		for (int i = 0; i < this.size(); i++) {
			acc = exp.apply(this.get(i), acc);
		}
		return acc;
	}

	@Override
	public boolean one(OneArgExp<E, Boolean> exp) {
		int j = 0;
		for (int i = 0; i < this.size(); i++) {
			if(exp.apply(this.get(i))) {
				j++;
			}
		}
		return j==1;
	}

}



