package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

public class UndefinedAccessInvalid extends Invalid {
	public UndefinedAccessInvalid(EObject nullExpression) {
		this.message = "Cannot access null value: " + nullExpression;
	}
}
