package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.util.OclAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccesException;
import fr.enseeiht.ocl.xtext.ocl.AddOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for AddOpCallExp
 * @generated
 */
public final class AddOpCallExpValidationAdapter implements OCLAdapter {

  private AddOpCallExp target;

  /**
   * @generated
   */
  public AddOpCallExpValidationAdapter(AddOpCallExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  if (this.target.getOperationName() == null) {
		  // Passage au rang suivant
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  }
	  
	  Object left = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentDroite()).getValue(contextTarget);
	  
	  if (left == null || right == null) {
		  // Levée d'erreur et envoi de l'argument fautif
		  throw new UndefinedAccesException(left == null ? this.target.getArgumentGauche() : this.target.getArgumentDroite());
	  }
	  
	  // Traitement des opérations
	  switch (this.target.getOperationName()) {
		  case "+":
			  if (left instanceof Number && right instanceof Number) {
				  return (left instanceof Integer ? (Integer)left : (Double)left) + (right instanceof Integer ? (Integer)right : (Double)right);
			  } else if (left instanceof String && right instanceof String) {
				  return ((String)left).concat((String)right);
			  } else {
				  throw new UnsupportedFeatureTypeException(this.target.getOperationName(), new Class<?>[] { left.getClass(), right.getClass() });
			  }
		  case "-":
			  if (left instanceof Number && right instanceof Number) {
				  return (left instanceof Integer ? (Integer)left : (Double)left) - (right instanceof Integer ? (Integer)right : (Double)right);
			  } else {
				  throw new UnsupportedFeatureTypeException(this.target.getOperationName(), new Class<?>[] { left.getClass(), right.getClass() });
			  }
		  default:
			  throw new UnsupportedFeatureException(this.target.getOperationName());
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