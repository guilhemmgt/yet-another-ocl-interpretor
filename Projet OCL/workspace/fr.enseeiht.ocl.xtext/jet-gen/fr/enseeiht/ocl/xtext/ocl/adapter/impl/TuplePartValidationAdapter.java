package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
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
    OclType returnType = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getType()).getType();
    if (expType instanceof OclInvalid) {
    	return new OclInvalid(expType);
    }
    else if (expType instanceof OclVoid) {
    	return new OclVoid();
    }
    else if (expType.conformsTo(returnType)) {
    	return expType.unifyWith(returnType);
    }
    else {
    	String message = "type mismatch : expected " + returnType + ", got " + expType;
    	return new OclInvalid(target, message);
    }
  }
  
  public String getName() {
	  return target.getVarName();
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