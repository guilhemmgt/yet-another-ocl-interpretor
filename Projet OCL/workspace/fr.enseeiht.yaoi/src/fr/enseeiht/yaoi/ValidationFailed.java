package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

/**
 * Object containig information about the violation of an invariant
 */
public class ValidationFailed implements ValidationError{
	private OclInvariant failedInvariant;
	private EObject testedObject;
	
	/**
	 * Create an ValidationFailed that indicate the failure of an invariant by an EObject 
	 * @param failedInvariant
	 * @param testedObject
	 * @param message
	 */
	public ValidationFailed(OclInvariant failedInvariant, EObject testedObject) {
		this.failedInvariant = failedInvariant;
		this.testedObject = testedObject;
	}
	
	/**
	 * Get the invariant that was violated
	 * @return
	 */
	@Override
	public OclInvariant getFailedInvariant() {
		return failedInvariant;
	}
	
	/**
	 * Get the object that violated the invariant
	 * @return
	 */
	@Override
	public EObject getTestedObject() {
		return testedObject;
	}
	
	@Override
	public String toString() {
		String testedObjectString = this.testedObject.toString();
		for(EStructuralFeature feat : this.testedObject.eClass().getEAllStructuralFeatures()) {
			if (feat.getName().toLowerCase().strip().equals("name")) {
				testedObjectString = (String) this.testedObject.eGet(feat);
			}
		}
		return this.failedInvariant.getName() + " failed for object " + testedObjectString + ".";
	}
}
