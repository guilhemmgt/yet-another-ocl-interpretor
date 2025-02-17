package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.BagType;
import fr.enseeiht.ocl.xtext.OclAny;

/**
 * OCLAdapter for BagType
 * @generated
 */
public final class BagTypeValidationAdapter implements OCLAdapter {

  private BagType target;

  /**
   * @generated
   */
  public BagTypeValidationAdapter(BagType object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de BagTypeAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OclAny getType() {
    throw new UnimplementedException("La methode getType de BagTypeAdapter n'as pas encore été implémentée");
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