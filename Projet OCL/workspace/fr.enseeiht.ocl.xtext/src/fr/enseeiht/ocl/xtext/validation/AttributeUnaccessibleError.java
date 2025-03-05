package fr.enseeiht.ocl.xtext.validation;

import org.eclipse.emf.ecore.EObject;

public class AttributeUnaccessibleError extends TypeCheckingError {
	
	/** 
	 * Error class for unaccessible attributes in a given EClass. 
	 * Intended to be used in OclInvalid constructor.
	 * @param cause : the EObject that caused the error.
	 * @param name : the name of the unaccessible attribute.
	 * @param classname : the name of the class that tried to access the unknown attribute.
	 */
	public AttributeUnaccessibleError(EObject cause, String name, String classname) {
		this.cause = cause;
		this.message = "Cannot access attribute '" + name + "' in Class '" + classname + "'.";
	}

}
