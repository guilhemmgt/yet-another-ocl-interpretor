package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;


public class IteratorNotFoundError extends TypeCheckingError {

	/**
	 * The error class raised when trying to access an unknown iterator.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the unknown iterator.
	 */
	public IteratorNotFoundError(EObject cause, String iterator) {
		this.cause = cause;
		this.message = "No such iterator '" + iterator + "' exists.";
	}
	
}
