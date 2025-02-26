package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.NotOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for NotOpCallExp
 * @generated
 */
public final class NotOpCallExpValidationAdapter implements OCLAdapter {

  private NotOpCallExp target;

  /**
   * @generated
   */
  public NotOpCallExpValidationAdapter(NotOpCallExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  Object arg = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource()).getValue(contextTarget);
	  
	  if (arg == null) {
		  return new UndefinedAccessInvalid(this.target.getSource());
	  }
	  if (arg instanceof Invalid) {
		  return arg;
	  }
	  
	  // Traitement des opérations
	  switch (this.target.getOperationName()) {
		  case "not":
			  if (arg instanceof Boolean) {
				  return !(Boolean)arg;
			  } else {
				  throw new UnsupportedFeatureTypeException(this.target.getOperationName(), arg.getClass());
			  }
		  case "-":
			  if (arg instanceof Number) {
				  return -(arg instanceof Integer ? (Integer)arg : (Double)arg);
			  } else {
				  throw new UnsupportedFeatureTypeException(this.target.getOperationName(), arg.getClass());
			  }
		  default:
			  throw new UnsupportedFeatureException(this.target.getOperationName());}
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  OCLAdapter arg = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource());
	  
	  OclType type = arg.getType();
	  // not Boolean : boolean
	  boolean isBoolean = type.conformsTo(new OclBoolean());
	  // - Real : Real
	  boolean isReal = type.conformsTo(new OclReal());
	  // operator = 'not' | '-'
	  boolean operationIsNot = this.target.getOperationName().equals("not");
	  // Invalid + ... : Invalid
	  boolean isInvalid = type.conformsTo(new OclInvalid());
	  
	  if (isBoolean && operationIsNot && !isInvalid) {
		  return type;
	  }
	  else if (isReal && !operationIsNot && !isInvalid) {
		  return type;
	  }
	  else {
		  // Opération invalide
		  String message = "Invalid operation for type " + type + " (operation : '" + target.getOperationName() + "')";
		  return new OclInvalid(target, message, type);
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