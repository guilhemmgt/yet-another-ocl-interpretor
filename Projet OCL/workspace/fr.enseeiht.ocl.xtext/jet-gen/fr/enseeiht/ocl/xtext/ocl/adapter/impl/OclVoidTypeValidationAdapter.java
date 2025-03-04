package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclVoidType;
import fr.enseeiht.ocl.xtext.OclType;
/**
 * OCLAdapter for OclVoidType
 * @generated
 */
public final class OclVoidTypeValidationAdapter implements OCLAdapter {

  private OclVoidType target;

  /**
   * @generated
   */
  public OclVoidTypeValidationAdapter(OclVoidType object) {
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
    return new OclClassifier(new OclVoid());
  }

  /**
   * @generated
   */
   @Override
  public String toString() {
    return super.toString();
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