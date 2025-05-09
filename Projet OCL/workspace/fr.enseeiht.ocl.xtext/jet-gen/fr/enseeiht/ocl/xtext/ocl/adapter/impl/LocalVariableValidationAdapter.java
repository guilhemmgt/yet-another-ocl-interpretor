package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.LocalVariable;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for LocalVariable
 * @generated
 */
public final class LocalVariableValidationAdapter implements OCLAdapter {

  private LocalVariable target;

  /**
   * @generated
   */
  public LocalVariableValidationAdapter(LocalVariable object) {
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
		OclType bodyType =  OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getInitExpression()).getType();
		// Convert into classifier
		bodyType = new OclClassifier(bodyType);
		if (this.target.getType() != null) {
			// Verify that initExpression is conform as declared Type
			OclType expectedType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType()).getType();
			if (!bodyType.conformsTo(expectedType))
				return new OclInvalid(new TypeMismatchError(this.target, expectedType, bodyType));
			bodyType = expectedType;
		}
		return bodyType;
			
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = this.target.getName();
		if (this.target.getType() != null)
			res += ":" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getType());
		res += "=" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getInitExpression());
		return res;
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