package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclConcat implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args) {
		return ((String)source) + ((String)args.get(0));
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) { 
		return new OclString();
	}

	@Override
	public List<OclType> getArgsType() {
		return Arrays.asList(new OclString());
	}

	@Override
	public int getArgsAmount() {
		return 1;
	}

	@Override
	public OclType getSourceType() {
		return new OclString();
	}

	@Override
	public String getName() {
		return "concat";
	}

}
