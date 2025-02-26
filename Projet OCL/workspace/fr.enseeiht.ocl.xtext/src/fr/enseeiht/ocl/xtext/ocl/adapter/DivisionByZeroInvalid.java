package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

public class DivisionByZeroInvalid extends Invalid {
	public DivisionByZeroInvalid(EObject zeroExpression) {
		this.message = "Cannot divide by 0: " + zeroExpression;
	}
}
