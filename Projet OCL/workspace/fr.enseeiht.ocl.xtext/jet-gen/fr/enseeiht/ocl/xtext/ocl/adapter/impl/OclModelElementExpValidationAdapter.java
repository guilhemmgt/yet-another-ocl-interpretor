package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclModelElementExp;
import fr.enseeiht.ocl.xtext.OCLType;

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
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de OclModelElementExpAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OCLType getType() {
    throw new UnimplementedException("La methode getType de OclModelElementExpAdapter n'as pas encore été implémentée");
  }

  /**
   * Get adapted element
   * @return adapted element
   * @generated
   */
  public EObject getElement() {
    return this.target;
  }
 }