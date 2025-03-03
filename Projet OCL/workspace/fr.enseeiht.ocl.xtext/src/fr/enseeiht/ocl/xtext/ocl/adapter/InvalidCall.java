package fr.enseeiht.ocl.xtext.ocl.adapter;

public class InvalidCall extends Invalid {

	public InvalidCall(String operationName) {
		this.message = "The operation " + operationName + " is not defined in this context";
	}
}
