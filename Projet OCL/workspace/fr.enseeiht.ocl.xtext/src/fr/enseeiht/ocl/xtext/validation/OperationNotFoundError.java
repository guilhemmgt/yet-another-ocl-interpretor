package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class OperationNotFoundError extends TypeCheckingError {

	public OperationNotFoundError(EObject cause, String operation) {
		this.cause = cause;
		this.message = "No such operation '" + operation + "' exists..";
	}
	
}
