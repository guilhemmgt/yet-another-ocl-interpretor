package fr.enseeiht.ocl.xtext.validation;

import fr.enseeiht.ocl.xtext.ocl.PropertyCall;

public class WrongNavigationOperatorError extends TypeCheckingError {

	public WrongNavigationOperatorError(PropertyCall target,  String navigationOp) {
		this.cause = target;
		this.message = "Type mismatch error : the navigation operator\" " + navigationOp +" does not support navigation on " + (navigationOp.equals("->") ?  "non-" : "")
				+ "collection, use \""+ (navigationOp.equals("->") ?  "." : "->") + "\" instead.";
	}

}
