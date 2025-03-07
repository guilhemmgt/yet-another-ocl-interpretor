package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.NumberFormatInvalid;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclToInteger implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		String sourceStr = (String)source;
		System.out.println(sourceStr);
		if (!sourceStr.matches("-?\\d+")) {
			return new NumberFormatInvalid(source,getName());
		}
		try {
			Integer intValue = Integer.parseInt(sourceStr);
			return intValue;
		} catch (NumberFormatException nfe) {
			return new NumberFormatInvalid(source,getName());
		}
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return new OclInteger();
	}

	@Override
	public List<OclType> getArgsType(OclType sourceType, List<OclType> argsType) {
		return new ArrayList<OclType>();
	}

	@Override
	public int getArgsAmount() {
		return 0;
	}

	@Override
	public OclType getSourceType() {
		return new OclString();
	}

	@Override
	public String getName() {
		return "toInteger";
	}

}
