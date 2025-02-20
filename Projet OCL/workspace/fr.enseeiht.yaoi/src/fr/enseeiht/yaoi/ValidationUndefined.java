package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

public class ValidationUndefined implements ValidationError {
	private OclInvariant failedInvariant;
	private EObject testedObject;
	private EObject nullExpr;
	
	/**
	 * Create an ValidationFailed that indicate the failure of an invariant by an EObject 
	 * @param failedInvariant
	 * @param testedObject
	 * @param message
	 */
	public ValidationUndefined(OclInvariant failedInvariant, EObject testedObject, EObject nullExpr) {
		this.failedInvariant = failedInvariant;
		this.testedObject = testedObject;
		this.nullExpr = nullExpr;
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
	
	public EObject getNullExpression() {
		return this.nullExpr;
	}
	
	@Override
	public String toString() {
		return this.failedInvariant.getName() + " is undefined for object " + this.testedObject + " because " + this.nullExpr + " is null";
	}
}
