package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;

public interface IOclOperation {

	/**
	 * Get return value of the operation
	 * @param source object on which the operation is called
	 * @param args Argument of the operator
	 * @return return value
	 */
	public Object getValue(Object source, List<Object> args);
	
	/**
	 * Get type returned by the operation, the type may depend on the arguments.
	 * @param sourceType Type of the object on which the operation is called
	 * @param argsType Type of arguments
	 * @return type returned by the operation
	 */
	public OclType getReturnType(OclType sourceType, List<OclType> argsType);
	
	/**
	 * Get the expected Type of each parameter
	 */
	public List<OclType> getArgsType();
	
	/**
	 * Get the number of argument expected by the operator
	 * @return
	 */
	public int getArgsAmount();
	
	/**
	 * Get the type of object on which the operation can be called
	 * @return
	 */
	public OclType getSourceType();
	
	/**
	 * Name of the method
	 * @return
	 */
	public String getName();
}
