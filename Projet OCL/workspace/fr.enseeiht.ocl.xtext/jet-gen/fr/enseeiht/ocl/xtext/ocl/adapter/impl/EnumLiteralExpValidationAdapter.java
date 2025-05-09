package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.types.OclEnum;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.EnumLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for EnumLiteralExp
 * @generated
 */
public final class EnumLiteralExpValidationAdapter implements OCLAdapter {

  private EnumLiteralExp target;

  /**
   * @generated
   */
  public EnumLiteralExpValidationAdapter(EnumLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return this.target.getEnum_().getEEnumLiteral(this.target.getName());
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  return new OclEnum(this.target.getEnum_());
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "#" + this.target.getName();
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