package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

public class AnyInvalid extends Invalid {

	public AnyInvalid(EObject anyIterator) {
		this.message = "There are no elements matching this Any iterator: " + anyIterator;
	}
}
