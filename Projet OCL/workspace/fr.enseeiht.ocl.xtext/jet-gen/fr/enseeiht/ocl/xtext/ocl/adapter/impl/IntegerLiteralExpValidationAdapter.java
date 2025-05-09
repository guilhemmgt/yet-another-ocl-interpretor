package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
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
	  return (Integer)this.target.getIntegerSymbol();
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
   * @generated NOT
   */
   @Override
	public String toString() {
		return Integer.toString(target.getIntegerSymbol());
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
   * @generated NOT
   */
   @Override
  public String getOutlineString() {
    return String.valueOf(target.getIntegerSymbol());
  }
 }