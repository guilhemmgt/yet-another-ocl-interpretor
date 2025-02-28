package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclTypePair;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.TuplePart;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for TuplePart
 * @generated
 */
public final class TuplePartValidationAdapter implements OCLAdapter {

  private TuplePart target;

  /**
   * @generated
   */
  public TuplePartValidationAdapter(TuplePart object) {
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
    OclType expType = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getInitExpression()).getType();
    if (target.getType() == null) {
    	return expType;
    }
    OclClassifier returnType = (OclClassifier) OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getType()).getType();
    if (expType instanceof OclInvalid) {
    	return new OclInvalid(expType);
    }
    else if (expType.conformsTo(returnType.getRepresentedType())) {
    	return expType.unifyWith(returnType.getRepresentedType());
    }
    else {
    	String message = "type mismatch : expected " + returnType.getRepresentedType() + ", got " + expType;
    	return new OclInvalid(target, message);
    }
  }
  
  public String getName() {
	  return target.getVarName();
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = this.target.getVarName();
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