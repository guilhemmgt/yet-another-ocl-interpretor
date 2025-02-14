package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclModuleElement;
import fr.enseeiht.ocl.xtext.OclAny;

/**
 * OCLAdapter for OclModuleElement
 * @generated
 */
public final class OclModuleElementValidationAdapter implements OCLAdapter {

  private OclModuleElement target;

  /**
   * @generated
   */
  public OclModuleElementValidationAdapter(OclModuleElement object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de OclModuleElementAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OclAny getType() {
    throw new UnimplementedException("La methode getType de OclModuleElementAdapter n'as pas encore été implémentée");
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