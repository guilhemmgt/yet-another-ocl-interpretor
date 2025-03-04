package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;

public class UndefinedAccessInvalid extends Invalid {
	public UndefinedAccessInvalid(EObject nullExpression) {
		this.message = "Cannot access to : " + OCLValidationAdapterFactory.INSTANCE.createAdapter(nullExpression) + " because  it is null";
	}
}
