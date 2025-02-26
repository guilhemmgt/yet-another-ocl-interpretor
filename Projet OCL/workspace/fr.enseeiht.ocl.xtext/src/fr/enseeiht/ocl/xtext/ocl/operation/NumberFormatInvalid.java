package fr.enseeiht.ocl.xtext.ocl.operation;

import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;

public class NumberFormatInvalid extends Invalid {

	public NumberFormatInvalid(Object source, String operationName) {
		this.message = "The value " + source + " is not in a correct format for " + operationName; 
	}

}
