package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccesException;
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
		  throw new UndefinedAccesException(this.target.getSource());
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