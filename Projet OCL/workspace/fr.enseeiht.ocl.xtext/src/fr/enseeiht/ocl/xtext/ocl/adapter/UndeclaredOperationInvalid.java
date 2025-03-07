package fr.enseeiht.ocl.xtext.ocl.adapter;

import java.util.Collection;
import java.util.Iterator;

import fr.enseeiht.ocl.xtext.OclType;

public class UndeclaredOperationInvalid extends Invalid {

	public UndeclaredOperationInvalid(String operationName, Collection<OclType> params) {
		String paramString = "(";
		Iterator<OclType> itr = params.iterator();
		while (itr.hasNext()) {
			paramString += itr.next().toString();
			if (itr.hasNext()) 
				paramString += ",";
			
		}
		paramString += ")";
		this.message = "The method " + operationName + paramString + " is not declared in this scope";
	}

}
