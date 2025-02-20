package fr.enseeiht.yaoi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;

/**
 * Result of the validation of a model by an OCL file
 */
public class ValidationResult {
	private Set<ValidationError> errors;
	
	/**
	 * Create an empty validationResult
	 */
	public ValidationResult() {
		this.errors = new HashSet<ValidationError>();
	}
	
	/**
	 * Returns all errors registred by the ValidationResult
	 * @return
	 */
	public Set<ValidationError> getErrors() {
		return this.errors;
	}
	
	/**
	 * Register a new error to the ValidationResult
	 * @param newError
	 */
	public void addError(ValidationError newError) {
		this.errors.add(newError);
	}
	
	/**
	 * Get all errors registred for an invariant
	 * @param inv
	 * @return A list of all the ValidationError
	 */
	public List<ValidationError> getInvariantErrors(OclInvariant inv) {
		List<ValidationError> result = new ArrayList<ValidationError>();
		for (ValidationError err : this.errors) {
			boolean classesMatch = ((OclContextBlock) err.getFailedInvariant().eContainer()).getClass_().getClassifierID() == ((OclContextBlock) inv.eContainer()).getClass_().getClassifierID();
			boolean objectsMatch = ((OclContextBlock) err.getFailedInvariant().eContainer()).getEcoreTypes().getName().equals(((OclContextBlock) inv.eContainer()).getEcoreTypes().getName());
			boolean namesMatch = err.getFailedInvariant().getName().equals(inv.getName());
			if (classesMatch && objectsMatch && namesMatch) {
				result.add(err);
			}
		}
		return result;
	}
	
	
	/**
	 * Get all errors registred for an invariant
	 * @param inv
	 * @return A list of all the ValidationError
	 */
	public List<ValidationError> getElementErrors(EObject inv) {
		throw new UnimplementedException(this.getClass(),"getElementErrors");
	}
	
	/**
	 * Check for the presence of errors in the ValidationResult
	 * @return <code>true</code> if there is no errors <code>false</code> otherwise
	 */
	public boolean hasNoError() {
		return this.errors.isEmpty();
	}
	
	
}
