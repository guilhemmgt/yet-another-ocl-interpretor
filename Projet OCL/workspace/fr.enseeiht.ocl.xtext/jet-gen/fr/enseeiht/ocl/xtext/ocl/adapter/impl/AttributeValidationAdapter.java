package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.Attribute;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for Attribute
 * @generated
 */
public final class AttributeValidationAdapter implements OCLAdapter {

  private Attribute target;

  /**
   * @generated
   */
  public AttributeValidationAdapter(Attribute object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getInitExpression()).getValue(contextTarget);
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // name : returnType = expressionType
	  OclClassifier returnClassifier = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getType()).getType();
	  OclType expressionType = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getInitExpression()).getType();
	  OclType returnType = returnClassifier.getRepresentedType();
	  if (expressionType instanceof OclInvalid) {
		  return expressionType;
	  }
	  else if (expressionType.conformsTo(returnType)) {
		  return returnClassifier;
	  }
	  else {
		  return new OclInvalid(new TypeMismatchError(target, returnType, expressionType));
	  }
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return ":" + this.target.getName() + "=" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getInitExpression());
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