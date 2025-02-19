package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

public class TypeCheckingError {
	
	private EObject cause;
	private String message;
	
	public TypeCheckingError(EObject cause, String message) {
		this.cause = cause;
		this.message = message;
	}
	
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
