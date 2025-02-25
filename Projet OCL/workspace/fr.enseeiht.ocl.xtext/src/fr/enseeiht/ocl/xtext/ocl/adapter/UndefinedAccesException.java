package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("serial")
public class UndefinedAccesException extends YaoiRuntimeException {
	private EObject nullExpression;
	
	public UndefinedAccesException(EObject nullExpression) {
		this.nullExpression = nullExpression;
		this.message = "The acces to " + nullExpression + " failed because the value is null";
	}
	
	/**
	 * Return the expression that caused the error
	 * @return
	 */
	public EObject getNullExpression() {
		return nullExpression;
	}
}
