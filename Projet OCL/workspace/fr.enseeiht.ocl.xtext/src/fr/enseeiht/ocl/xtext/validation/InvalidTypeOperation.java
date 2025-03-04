package fr.enseeiht.ocl.xtext.validation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclInvalid;

public class InvalidTypeOperation extends TypeCheckingError {

	
	public InvalidTypeOperation(EObject cause, String operation, List<OclType> uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' with types ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}
	
	public InvalidTypeOperation(EObject cause, EList<String> operation, List<OclType> uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' with types ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}
	
	public InvalidTypeOperation(EObject cause, String operation, OclType... type) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' with types ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : type) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}

	
	public InvalidTypeOperation(EObject cause, EList<String> operation, OclType... uniqueTypes) {
		this.cause = cause;
		this.message = "Invalid operation '" + operation + "' with types ";
		List<String> messageStr = new LinkedList<String>();
		for (OclType typ : uniqueTypes) {
			messageStr.add(typ.toString());
		}
		this.message += String.join(", ", messageStr) + ".";
	}

}
