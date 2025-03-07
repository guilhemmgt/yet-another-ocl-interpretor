package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public interface IOclOperation {

	/**
	 * Get the return value of the operation
	 * @param source object on which the operation is called
	 * @param args Argument of the operator
	 * @param contextTarget TODO
	 * @return return value
	 */
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget);
	
	/**
	 * Get the type returned by the operation, the type may depend on the arguments.
	 * @param sourceType Type of the object on which the operation is called
	 * @param argsType Type of arguments
	 * @return type returned by the operation
	 */
	public OclType getReturnType(OclType sourceType, List<OclType> argsType);
	
	/**
	 * Get the expected Type of each parameter
	 * @param sourceType TODO
	 * @param argsType TODO
	 */
	public List<OclType> getArgsType(OclType sourceType, List<OclType> argsType);
	
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
