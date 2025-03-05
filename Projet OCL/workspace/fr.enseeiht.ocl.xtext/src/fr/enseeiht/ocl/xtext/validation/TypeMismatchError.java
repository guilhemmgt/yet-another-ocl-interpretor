package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class TypeMismatchError extends TypeCheckingError {

	
	/**
	 * The error class raised when an unexpected type is given instead of the expected one.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param expected : the expected type.
	 * @param got : the unexpected type that was given instead.
	 */
	public TypeMismatchError(EObject cause, OclType expected, OclType got) {
		this.cause = cause;
		this.message = "Type mismatch : expected " + expected + ", got " + got;
	}

}
