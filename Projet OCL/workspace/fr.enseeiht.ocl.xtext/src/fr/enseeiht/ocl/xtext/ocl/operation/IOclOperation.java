package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;

public interface IOclOperation {

	public Object getValue(Object source, List<Object> args);
	
	public OclType getReturnType(OclType sourceType, List<OclType> argsType);
	
	public List<OclType> getArgsType();
	
	public int getArgsAmount();
	
	public OclType getSourceType();
	
	public String getName();
}
