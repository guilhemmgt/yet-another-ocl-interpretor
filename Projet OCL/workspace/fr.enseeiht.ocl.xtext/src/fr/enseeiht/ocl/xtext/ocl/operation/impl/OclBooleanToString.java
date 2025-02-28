package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclBooleanToString implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args) {
		return source.toString();
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return new OclString();
	}

	@Override
	public List<OclType> getArgsType() {
		return new ArrayList<OclType>();
	}

	@Override
	public int getArgsAmount() {
		return 0;
	}

	@Override
	public OclType getSourceType() {
		return new OclBoolean();
	}

	@Override
	public String getName() {
		return "toString";
	}


}
