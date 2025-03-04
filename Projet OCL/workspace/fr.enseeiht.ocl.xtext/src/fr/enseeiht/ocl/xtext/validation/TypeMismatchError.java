package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class TypeMismatchError extends TypeCheckingError {

	
	public TypeMismatchError(EObject cause, OclType expected, OclType got) {
		this.cause = cause;
		this.message = "Type mismatch : expected " + expected + ", got " + got;
	}

}
