package fr.enseeiht.ocl.xtext.validation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class OperationInvalidArgumentsError extends TypeCheckingError {
	
	public OperationInvalidArgumentsError(EObject cause, String operation, List<OclType> paramTypes) {
		this.cause = cause;
		List<String> messageStr = new LinkedList<String>(); 
		for (OclType typ : paramTypes) {
			messageStr.add(typ.toString());
		}
		this.message = "The operation '" + operation + "' cannot be called with arguments of types: " + String.join(", ", messageStr) + ".";
	}

}
