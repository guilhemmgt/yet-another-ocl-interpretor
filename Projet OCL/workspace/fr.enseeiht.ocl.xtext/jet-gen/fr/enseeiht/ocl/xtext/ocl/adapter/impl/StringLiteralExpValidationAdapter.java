package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.StringLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for StringLiteralExp
 * @generated
 */
public final class StringLiteralExpValidationAdapter implements OCLAdapter {

  private StringLiteralExp target;

  /**
   * @generated
   */
  public StringLiteralExpValidationAdapter(StringLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return this.target.getStringSymbol();
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
    return new OclString();
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "\"" + this.target.getStringSymbol() + "\"";
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