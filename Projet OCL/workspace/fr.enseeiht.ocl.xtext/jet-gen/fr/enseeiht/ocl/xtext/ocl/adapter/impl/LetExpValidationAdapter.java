package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.scoping.Scoper;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.LetExp;
import fr.enseeiht.ocl.xtext.ocl.LocalVariable;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for LetExp
 * @generated
 */
public final class LetExpValidationAdapter implements OCLAdapter {

  private LetExp target;

  /**
   * @generated
   */
  public LetExpValidationAdapter(LetExp object) {
    this.target = object;
  }

	/**
	 * Returns the value of the element given its context
	 * 
	 * @param Target
	 * @return value of the element
	 * @generated
	 */
	public Object getValue(EObject contextTarget) {
		// Get value from the declared variable
		Object varValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(((LocalVariable)this.target.getVariable()).getInitExpression()).getValue(contextTarget);
		
		if (varValue instanceof Invalid) {
			return varValue;
		}
		
		// Add value to the scope
		Scoper.add(this.target.getVariable(), varValue);
		
		// Compute body value
		Object returnValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getIn_()).getValue(contextTarget);
		
		// Clear the scope
		Scoper.remove(this.target.getVariable());
		
		return returnValue;
	}

	/**
	 * Get the type of the element
	 * 
	 * @return type of the element
	 * @generated NOT
	 */
	public OclType getType() {
		
		// Check type from variable
		OclType varType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getVariable()).getType();

		OclInvalid checkTypeError = null;
		if (varType.conformsTo(new OclInvalid())) {
			checkTypeError = (OclInvalid) varType;
		}
		
		// Return type from the expression
		OclType bodyType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getIn_()).getType();

		if (bodyType.conformsTo(new OclInvalid())) {
			checkTypeError = checkTypeError == null ? (OclInvalid) bodyType : new OclInvalid(checkTypeError, bodyType);
		}

		if (checkTypeError != null) {
			return checkTypeError;
		}

		return bodyType;
	}

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "let " + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getVariable()) + " in " + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getIn_());
	}

  /**
   * Get adapted element
   * @return adapted element
   * @generated
   */
  public EObject getElement() {
    return this.target;
  }

  /**
   * Return the string visible in the outline
   * @return outline name
   * @generated
   */
   @Override
  public String getOutlineString() {
    return null;
  }
 }