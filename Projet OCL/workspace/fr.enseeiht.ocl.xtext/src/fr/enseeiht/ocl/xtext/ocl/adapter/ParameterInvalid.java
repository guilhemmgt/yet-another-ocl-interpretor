package fr.enseeiht.ocl.xtext.ocl.adapter;

import java.util.Iterator;
import java.util.List;


public class ParameterInvalid extends Invalid {
	/**
	 * Invalid object returned when the parameter of a operation does not respect the precondition
	 * @param args
	 */
	public ParameterInvalid(List<Object> args,String operationName, Object sourceValue) {
		String argsString = "(";
		Iterator<Object> itr = args.iterator();
		while (itr.hasNext()) {
			argsString += itr.next();
			if (itr.hasNext()) {
				argsString+=",";
			}
		}
		argsString+=")";
		this.message = "The parameters " + argsString + " are not valid for operation " + operationName + " on " + sourceValue;
	}
}
