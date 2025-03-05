package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclReal;

public class OclAbs implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		if (source instanceof Integer src) {
			return src >= 0 ? src : -src;
		} else if (source instanceof Double src) {
			return src >= 0 ? src : -src;
		} else {
			return null;
		}
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return sourceType;
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
		return new OclReal();
	}

	@Override
	public String getName() {
		return "abs";
	}

}
