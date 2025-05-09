package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.CollectionTypeLiteral;
import fr.enseeiht.ocl.xtext.OclType;
/**
 * OCLAdapter for CollectionTypeLiteral
 * @generated
 */
public final class CollectionTypeLiteralValidationAdapter implements OCLAdapter {

  private CollectionTypeLiteral target;

  /**
   * @generated
   */
  public CollectionTypeLiteralValidationAdapter(CollectionTypeLiteral object) {
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
   * @generated
   */
  public OclType getType() {
    throw new UnimplementedException(this.getClass(),"getType");
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