package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;

public class OclOclIsUndefined implements IOclOperation {

	@Override
	public Object getValue(Object source, List<Object> args) {
		// TODO : Completer avec le ocl invalid
		return source == null /*|| source == OclInvalid.instance*/;
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {  
		return new OclBoolean();
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
		return new OclAny();
	}

	@Override
	public String getName() {
		return "oclIsUndefined";
	}

}
