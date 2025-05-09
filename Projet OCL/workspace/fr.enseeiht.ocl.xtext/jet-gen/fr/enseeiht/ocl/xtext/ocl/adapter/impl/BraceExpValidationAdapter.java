package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.BraceExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for BraceExp
 * @generated
 */
public final class BraceExpValidationAdapter implements OCLAdapter {

  private BraceExp target;

  /**
   * @generated
   */
  public BraceExpValidationAdapter(BraceExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
    return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getExp()).getValue(contextTarget);
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // L'expression dans les parenthèses
	  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getExp()).getType();	  
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "(" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getExp()) + ")";
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
   * @generated NOT
   */
   @Override
  public String getOutlineString() {
    return "()";
  }
 }