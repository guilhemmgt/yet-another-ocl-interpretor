package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

public class ValidationUndefined implements ValidationError {
	private OclInvariant failedInvariant;
	private EObject testedObject;
	private String message;
	
	/**
	 * Create an ValidationFailed that indicate the failure of an invariant by an EObject 
	 * @param failedInvariant
	 * @param testedObject
	 * @param message
	 */
	public ValidationUndefined(OclInvariant failedInvariant, EObject testedObject, String message) {
		this.failedInvariant = failedInvariant;
		this.testedObject = testedObject;
		this.message = message;
	}
	
	/**
	 * Get the invariant that was violated
	 * @return
	 */
	@Override
	public OclInvariant getFailedInvariant() {
		return this.failedInvariant;
	}
	
	/**
	 * Get the object that violated the invariant
	 * @return
	 */
	@Override
	public EObject getTestedObject() {
		return this.testedObject;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		String testedObjectString = this.testedObject.toString();
		for(EStructuralFeature feat : this.testedObject.eClass().getEAllStructuralFeatures()) {
			if (feat.getName().toLowerCase().strip().equals("name")) {
				testedObjectString = (String) this.testedObject.eGet(feat);
			}
		}
		return this.failedInvariant.getName() + " is undefined for object " + testedObjectString + ": " + this.message;
	}
}
