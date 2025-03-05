package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

public class CouldNotResolveInvalid extends Invalid {
	public CouldNotResolveInvalid(EObject expression) {
		this.message = "Could not resolve the following variable: " + expression;
	}
}
