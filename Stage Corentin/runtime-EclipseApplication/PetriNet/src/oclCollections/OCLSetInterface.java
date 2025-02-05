package oclCollections;

import org.eclipse.emf.common.util.EList;

public interface OCLSetInterface<E> {
	
	public OCLSet<E> closure(OneArgExp<E, EList<E>> exp);

}
