package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclEClass;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclModelElementExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OclModelElementExp
 * @generated
 */
public final class OclModelElementExpValidationAdapter implements OCLAdapter {

  private OclModelElementExp target;

  /**
   * @generated
   */
  public OclModelElementExpValidationAdapter(OclModelElementExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
    return this.target.getClass_();
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
    return new OclClassifier(new OclEClass(this.target.getClass_()));
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getModel()) + "!" + this.target.getClass_().getName();
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