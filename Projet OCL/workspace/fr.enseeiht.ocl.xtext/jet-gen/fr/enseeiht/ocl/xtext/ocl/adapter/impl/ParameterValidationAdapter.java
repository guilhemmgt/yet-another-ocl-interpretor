package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Parameter;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Parameter
 * @generated
 */
public final class ParameterValidationAdapter implements OCLAdapter {

  private Parameter target;

  /**
   * @generated
   */
  public ParameterValidationAdapter(Parameter object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException(this.getClass(),"getValue");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
    return OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getType()).getType();
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return this.target.getName() + ":" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType());
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