package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBag;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.BagType;
import fr.enseeiht.ocl.xtext.OclType;

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
    throw new UnimplementedException(this.getClass(),"getValue");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  OclClassifier elementClassifier  = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getElementType()).getType();
	  return new OclClassifier(new OclBag(elementClassifier.getRepresentedType()));
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "Bag(" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getElementType()) + ")";
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