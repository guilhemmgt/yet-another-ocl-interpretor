package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclEClass;
import fr.enseeiht.ocl.xtext.types.OclEnum;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclModelElementClass;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OclModelElementClass
 * @generated
 */
public final class OclModelElementClassValidationAdapter implements OCLAdapter {

  private OclModelElementClass target;

  /**
   * @generated
   */
  public OclModelElementClassValidationAdapter(OclModelElementClass object) {
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
	  if (target.getName() instanceof EClass eClass) {
		  return new OclClassifier(new OclEClass(eClass));
	  }
	  else if (target.getName() instanceof EEnum eEnum) {
		  return new OclClassifier(new OclEnum(eEnum));
	  }
	  else {
		  OclType[] expected =  {new OclEClass(null), new OclEnum(null)};
		  OclType got =  OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getName()).getType();
		  return new OclInvalid(new TypeMismatchError(target.getName(), expected , got));
	  }
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getModel()) + "!" + this.target.getName();
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