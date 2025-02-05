
package oclCollections;

import org.eclipse.emf.common.util.EList;

public interface OCLBagInterface<E> {
	
	public OCLSet<E> closure(OneArgExp<E, EList<E>> exp);

}

