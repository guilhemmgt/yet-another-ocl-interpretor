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
	
	/**
	 * The error class raised when an unexpected type is given instead of a selection of types.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param expected : the list of the expected types.
	 * @param got : the unexpected type that was given instead.
	 */
	public TypeMismatchError(EObject cause, OclType[] expected, OclType got) {
		this.cause = cause;
		this.message = "Type mismatch : expected ";
		for (int i = 0; i < expected.length ; i++) {
			this.message += expected[i];
			if (i < expected.length -1) {
				this.message += " or ";
			}
		}
		this.message += ", got " + got;
	}


}
