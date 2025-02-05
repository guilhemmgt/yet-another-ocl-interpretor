
package oclCollections;

import org.eclipse.emf.common.util.EList;

public interface OCLOrderedSetInterface<E> {
	
	public OCLOrderedSet<E> closure(OneArgExp<E, EList<E>> exp);

}

