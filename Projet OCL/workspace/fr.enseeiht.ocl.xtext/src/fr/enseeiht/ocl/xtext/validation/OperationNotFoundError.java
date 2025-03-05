package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;


public class OperationNotFoundError extends TypeCheckingError {

	/**
	 * The error class raised when trying to access an unknown operator.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the unknown operation.
	 */
	public OperationNotFoundError(EObject cause, String operation) {
		this.cause = cause;
		this.message = "No such operation '" + operation + "' exists..";
	}
	
}
