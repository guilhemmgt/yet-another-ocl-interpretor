package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.NullLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;
/**
 * OCLAdapter for NullLiteralExp
 * @generated
 */
public final class NullLiteralExpValidationAdapter implements OCLAdapter {

  private NullLiteralExp target;

  /**
   * @generated
   */
  public NullLiteralExpValidationAdapter(NullLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return null;
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
    return new OclVoid();
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