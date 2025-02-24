package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.BooleanLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for BooleanLiteralExp
 * @generated
 */
public final class BooleanLiteralExpValidationAdapter implements OCLAdapter {

  private BooleanLiteralExp target;

  /**
   * @generated
   */
  public BooleanLiteralExpValidationAdapter(BooleanLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	switch (this.target.getBooleanSymbol()) {
		case "true":
			return Boolean.TRUE;
		case "false":
			return Boolean.FALSE;
		default:
			throw new UnsupportedFeatureException(this.target.getBooleanSymbol());
	}
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OclType getType() {
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