package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

public class SortedByInvalid extends Invalid {

	public SortedByInvalid(EObject sortedbyIterator, Class<?> uncomparableType) {
		this.message = "Cannot compare elements of type " + uncomparableType + " in SortedBy iterator " + sortedbyIterator + ".";
	}
}
