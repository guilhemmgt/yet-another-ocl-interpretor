package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Auxiliary;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Auxiliary
 * @generated
 */
public final class AuxiliaryValidationAdapter implements OCLAdapter {

  private Auxiliary target;

  /**
   * @generated
   */
  public AuxiliaryValidationAdapter(Auxiliary object) {
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
   * @generated NoT
   */
  public OclType getType() {
	  // Xtext passe au travers, pas d'implémentation nécessaire
    throw new UnimplementedException(this.getClass(),"getType");
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