package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("serial")
public class UndefinedAccesException extends RuntimeException {
	private String message;
	private EObject nullExpression;
	
	public UndefinedAccesException(EObject nullExpression) {
		this.nullExpression = nullExpression;
		this.message = "The acces to " + nullExpression + " failed because the value is null";
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * Return the expression that caused the error
	 * @return
	 */
	public EObject getNullExpression() {
		return nullExpression;
	}
}
