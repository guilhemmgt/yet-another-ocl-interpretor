package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.NumberFormatInvalid;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclToReal implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args) {
		String sourceStr = (String)source;
		if (!sourceStr.matches("([-]?[\\d]*\\.[\\d]*)|(-?\\d+)")) {
			return new NumberFormatInvalid(source,getName());
		}
		try {
			 Double doubleValue = Double.parseDouble(sourceStr);
			return doubleValue;
		} catch (NumberFormatException nfe) {
			return new NumberFormatInvalid(source,getName());
		}
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return new OclReal();
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
		return new OclString();
	}

	@Override
	public String getName() {
		return "toReal";
	}


}
