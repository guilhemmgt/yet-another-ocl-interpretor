package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBag;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclSet;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.SetType;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for SetType
 * @generated
 */
public final class SetTypeValidationAdapter implements OCLAdapter {

  private SetType target;

  /**
   * @generated
   */
  public SetTypeValidationAdapter(SetType object) {
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
	  OclClassifier elementClassifier  = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getElementType()).getType();
	  return new OclClassifier(new OclSet(elementClassifier.getRepresentedType()));
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