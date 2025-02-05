

package oclCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

public class OCLBag<E> extends LinkedList<E> implements OCLCollection<E>, OCLBagInterface<E>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<E> noInfiniteLoop;
	
	public OCLBag() {}
	
	public OCLBag(Collection<? extends E> collection) {
		super(collection);
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
		for (E e : this) {
			T appliedResult = exp.apply(e);
			if (appliedResult instanceof Collection) {
				result.addAll((Collection<T>) appliedResult);
			} else {
				result.add(appliedResult);
			}
		}
		return result;
	}

	@Override
	public <T> OCLBag<T> collectNested(OneArgExp<E, T> exp) {
		OCLBag<T> result = new OCLBag<>();
		for (E e : this) {
			result.add(exp.apply(e));
		}
		return result;
	}

	@Override
	public boolean exists(OneArgExp<E, Boolean> exp) {
		for (E e : this) {
			if (exp.apply(e)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean exists(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		for(E e : this) {
			if (exp1.apply(e) && exp2.apply(e)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp) {
		boolean res = true;
		for (E e : this) {
			if (!exp.apply(e)) {
				res = false;
			}
		}
		return res;
	}

	@Override
	public boolean forAll(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2) {
		boolean res = true;
		for (E e : this) {
			if (!exp1.apply(e) || !exp2.apply(e)) {
				res = false;
			}
		}
		return res;
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
	public <T> T iterate(T init, TwoArgExp<E, T, T> exp) {
		T acc = init;
		for (E e : this) {
			acc = exp.apply(e, acc);
		}
		return acc;
	}

	@Override
	public boolean one(OneArgExp<E, Boolean> exp) {
		int j = 0;
		for (E e : this) {
			if(exp.apply(e)) {
				j++;
			}
		}
		return j==1;
	}

	@Override
	public OCLBag<E> reject(OneArgExp<E, Boolean> exp) {
		OCLBag<E> result = new OCLBag<>();
		for (E e : this) {
			if (!exp.apply(e)) {
				result.add(e);
			}
		}
		return result;
	}

	@Override
	public OCLBag<E> select(OneArgExp<E, Boolean> exp) {
		OCLBag<E> result = new OCLBag<>();
		for (E e : this) {
			if (exp.apply(e)) {
				result.add(e);
			}
		}
		return result;
	}

	@Override
	public <T extends Comparable<T>> OCLSequence<E> sortedBy(OneArgExp<E, T> exp) {
		OCLSequence<E> newOCLSequence = new OCLSequence<E>();
		newOCLSequence.addAll(this);
		newOCLSequence.sort((e1, e2) -> exp.apply(e1).compareTo(exp.apply(e2)));
		return newOCLSequence;
	}	

}


