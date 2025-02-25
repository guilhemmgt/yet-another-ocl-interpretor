package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.RealLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for RealLiteralExp
 * @generated
 */
public final class RealLiteralExpValidationAdapter implements OCLAdapter {

  private RealLiteralExp target;

  /**
   * @generated
   */
  public RealLiteralExpValidationAdapter(RealLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return (Double)this.target.getRealSymbol();
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  return new OclReal();
  }

  /**
   * @generated
   */
   @Override
  public String toString() {
    throw new UnimplementedException(this.getClass(),"toString");
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