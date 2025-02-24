package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("serial")
public class DivisionByZeroException extends YaoiRuntimeException {
	private EObject zeroExpression;
	
	public DivisionByZeroException(EObject zeroExpression) {
		this.zeroExpression = zeroExpression;
		this.message = "Cannot divide by " + zeroExpression + " because it is equal to zero";
	}
	
	/**
	 * Return the expression that caused the error by being equal to zero
	 * @return
	 */
	public EObject getZeroExpression() {
		return zeroExpression;
	}
}
