package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.ParameterInvalid;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclSubString implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args) {
		String strSource = (String) source;
		Integer lower = (Integer) args.get(0);
		Integer upper = (Integer) args.get(1);
		if (lower > upper || lower < 1 || upper > strSource.length()) {
			return new ParameterInvalid(args, getName(), source);
		}
		return strSource.substring(lower-1, upper);
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return new OclString();
	}

	@Override
	public List<OclType> getArgsType() {
		return Arrays.asList(new OclInteger(), new OclInteger());
	}

	@Override
	public int getArgsAmount() {
		return 2;
	}

	@Override
	public OclType getSourceType() {
		return new OclString();
	}

	@Override
	public String getName() {
		return "substring";
	}

}
