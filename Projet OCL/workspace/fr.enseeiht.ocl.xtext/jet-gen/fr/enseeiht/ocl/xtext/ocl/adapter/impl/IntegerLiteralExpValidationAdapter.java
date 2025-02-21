package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.IntegerLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for IntegerLiteralExp
 * @generated
 */
public final class IntegerLiteralExpValidationAdapter implements OCLAdapter {

  private IntegerLiteralExp target;

  /**
   * @generated
   */
  public IntegerLiteralExpValidationAdapter(IntegerLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return (Number)this.target.getIntegerSymbol();
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
    return new OclInteger();
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