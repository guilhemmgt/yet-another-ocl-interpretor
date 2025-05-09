package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.scoping.Scoper;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.ocl.adapter.CouldNotResolveInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Attribute;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.VariableExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for VariableExp
 * @generated
 */
public final class VariableExpValidationAdapter implements OCLAdapter {

  private VariableExp target;

  /**
   * @generated
   */
  public VariableExpValidationAdapter(VariableExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  if (this.target.getReferredVariable() instanceof Attribute) {
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getReferredVariable()).getValue(contextTarget);
	  }
	  if (!Scoper.contains(this.target.getReferredVariable())) {
		  return new CouldNotResolveInvalid(this.target);
	  }
	  return Scoper.get(this.target.getReferredVariable());
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  if (this.target.getReferredVariable() instanceof Iterator) {
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getReferredVariable()).getType();
	  }
    return ((OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getReferredVariable()).getType()).getRepresentedType();
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return this.target.getReferredVariable().getName();
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