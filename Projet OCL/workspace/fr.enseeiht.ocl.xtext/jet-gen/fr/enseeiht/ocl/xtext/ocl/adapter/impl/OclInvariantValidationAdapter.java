package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OclInvariant
 * @generated
 */
public final class OclInvariantValidationAdapter implements OCLAdapter {

  private OclInvariant target;

  /**
   * @generated
   */
  public OclInvariantValidationAdapter(OclInvariant object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
    return OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getBody()).getValue(contextTarget);
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {OCLAdapter exp = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getBody());
	OclType type = exp.getType();
	// L'expression dans l'invariant doit nécessairement avoir un type Boolean
	boolean isCorrect = type.conformsTo(new OclBoolean());
	boolean isInvalid = type.conformsTo(new OclInvalid());
	if (!isCorrect && !isInvalid) {
		String message = "Invariant type mismatch : expected Boolean, got " + type;
		return new OclInvalid(target, message);
	}
	else if (isInvalid) {
		return new OclInvalid(type);
	}
	else {
		return new OclBoolean();
	}
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