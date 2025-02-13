package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.OCLType;

/**
 * OCLAdapter for IteratorExp
 * @generated
 */
public final class IteratorExpValidationAdapter implements OCLAdapter {

  private IteratorExp target;

  /**
   * @generated
   */
  public IteratorExpValidationAdapter(IteratorExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de IteratorExpAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OCLType getType() {
    throw new UnimplementedException("La methode getType de IteratorExpAdapter n'as pas encore été implémentée");
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