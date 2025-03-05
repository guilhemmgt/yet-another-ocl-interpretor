package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInteger;

public class OclSize implements IOclOperation {

	@SuppressWarnings("unchecked")
	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		return ((Collection<Object>)source).size();
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
		return new OclCollection(new OclAny());
	}

	@Override
	public String getName() {
		return "size";
	}

}
