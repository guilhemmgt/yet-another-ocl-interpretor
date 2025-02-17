package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

/**
 * Object containig information about the violation of an invariant
 */
public class ValidationError {
	private String message;
	private OclInvariant failedInvariant;
	private EObject testedObject;
	
	/**
	 * Create an ValidationError that indicate the failure of an invariant by an EObject 
	 * @param failedInvariant
	 * @param testedObject
	 * @param message
	 */
	public ValidationError(OclInvariant failedInvariant, EObject testedObject, String message) {
		this.failedInvariant = failedInvariant;
		this.testedObject = testedObject;
		this.message = message;
	}
	/**
	 * Get a message explaining the failure of an invariant
	 * @return error message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Get the invariant that was violated
	 * @return
	 */
	public OclInvariant getFailedInvariant() {
		return failedInvariant;
	}
	
	/**
	 * Get the object that violated the invariant
	 * @return
	 */
	public EObject getTestedObject() {
		return testedObject;
	}
	
}
