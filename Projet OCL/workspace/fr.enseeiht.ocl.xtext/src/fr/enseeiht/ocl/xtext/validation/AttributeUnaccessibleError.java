package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

public class AttributeUnaccessibleError extends TypeCheckingError {
	
	public AttributeUnaccessibleError(EObject cause, String name, String classname) {
		this.cause = cause;
		this.message = "Cannot access attribute '" + name + "' in Class '" + classname + "'.";
	}

}
