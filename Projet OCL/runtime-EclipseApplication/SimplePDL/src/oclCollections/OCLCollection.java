
package oclCollections;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

public interface OCLCollection<E> extends Collection<E>{

	public E any(OneArgExp<E, Boolean> exp);

	public <T> OCLCollection<T> collect(OneArgExp<E, T> exp);

	public <T> OCLCollection<T> collectNested(OneArgExp<E, T> exp);

	public boolean exists(OneArgExp<E, Boolean> exp);

	public boolean exists(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2);

	public boolean forAll(OneArgExp<E, Boolean> exp);

	public boolean forAll(OneArgExp<E, Boolean> exp1, OneArgExp<E, Boolean> exp2);

	public <T> boolean isUnique(OneArgExp<E, T> exp);

	public <T> T iterate(T init, TwoArgExp<E, T, T> exp);

	public boolean one(OneArgExp<E, Boolean> exp);

	public OCLCollection<E> reject(OneArgExp<E, Boolean> exp);

	public OCLCollection<E> select(OneArgExp<E, Boolean> exp);

	public <T extends Comparable<T>> OCLOrderedCollection<E> sortedBy(OneArgExp<E, T> exp);

}


