package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

public abstract class TypeCheckingError {
	
	protected EObject cause;
	protected String message;
	
	public EObject getCause() {
		return cause;
	}
	public void setCause(EObject cause) {
		this.cause = cause;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
