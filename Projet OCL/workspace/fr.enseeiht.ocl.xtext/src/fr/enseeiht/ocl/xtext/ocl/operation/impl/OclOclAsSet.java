package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclSet;

public class OclOclAsSet implements IOclOperation {

	@Override
	public Object getValue(Object source, List<Object> args) {
		return new HashSet<Object>(Arrays.asList(source));
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		// TODO : Remove cast
		return new OclSet((OclAny)sourceType);
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
		return "oclAsSet";
	}

}
