package fr.enseeiht.yaoi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

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
	public List<ValidationError> getInvariantError(OclInvariant inv) {
		return this.errors.stream().filter(v -> v.getFailedInvariant().equals(inv)).toList();
	}
	
	/**
	 * Check for the presence of errors in the ValidationResult
	 * @return <code>true</code> if there is no errors <code>false</code> otherwise
	 */
	public boolean hasNoError() {
		return this.errors.isEmpty();
	}
	
	
}
