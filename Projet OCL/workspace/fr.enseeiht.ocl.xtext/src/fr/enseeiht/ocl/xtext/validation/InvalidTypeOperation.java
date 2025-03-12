package fr.enseeiht.ocl.xtext.validation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class InvalidTypeOperation extends TypeCheckingError {

	
	/**
	 * The error class raised when an operation is called when an operation is called with the wrong types.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the operation called with the wrong arguments
	 * @param uniqueTypes : the types of the arguments
	 */
	public InvalidTypeOperation(EObject cause, String operation, List<OclType> uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' for type(s) ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}
	
	/**
	 * The error class raised when an operation is called when an operation is called with the wrong types.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the operation called with the wrong arguments
	 * @param uniqueTypes : the types of the arguments
	 */
	public InvalidTypeOperation(EObject cause, EList<String> operation, List<OclType> uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' for type(s) ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}
	
	/**
	 * The error class raised when an operation is called when an operation is called with the wrong types.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the operation called with the wrong arguments
	 * @param uniqueTypes : the types of the arguments
	 */
	public InvalidTypeOperation(EObject cause, String operation, OclType... uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' for type(s) ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}

	/**
	 * The error class raised when an operation is called when an operation is called with the wrong types.
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param operation : the operation called with the wrong arguments
	 * @param uniqueTypes : the types of the arguments
	 */
	public InvalidTypeOperation(EObject cause, EList<String> operation, OclType... uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' for type(s) ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}

}
