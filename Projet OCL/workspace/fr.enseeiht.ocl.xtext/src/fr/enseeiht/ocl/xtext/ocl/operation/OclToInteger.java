package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.ArrayList;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.types.OclString;

public class OclToInteger implements IOclOperation {

	@Override
	public Object getValue(Object source, List<Object> args) {
		String sourceStr = (String)source;
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
		return "toInteger";
	}

}
