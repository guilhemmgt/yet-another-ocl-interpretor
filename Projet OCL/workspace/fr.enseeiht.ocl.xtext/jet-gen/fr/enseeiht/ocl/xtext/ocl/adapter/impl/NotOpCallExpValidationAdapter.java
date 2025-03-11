package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
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
	  

	  if (arg instanceof Invalid) {
		  return arg;
	  }
	  
	  // Traitement des opérations
	  switch (this.target.getOperationName()) {
		  case "not":
			  if (arg == null)
				  return null;
			  
			  if (arg instanceof Boolean) {
				  return !(Boolean)arg;
			  } else {
				  throw new UnsupportedFeatureTypeException(this.target.getOperationName(), arg.getClass());
			  }
		  case "-":
			  if (arg == null)
				  return new UndefinedAccessInvalid(this.target.getSource());

			  if (arg instanceof Number) {
				  if (arg instanceof Integer integ) {
					  return (Integer) (-integ);
				  } else {
					  return -((Double)arg);
				  }
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
	  	// Calcul du type de l'argument
		OclType type = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource()).getType();
		
		String opName = this.target.getOperationName(); // opération
		
		// & Real : Real (seulement pour "-")
		boolean ruleReal = type.conformsTo(new OclReal()) && opName.equals("-");
		// & Boolean : Boolean (seulement pour "not")
		boolean ruleBoolean = type.conformsTo(new OclBoolean()) && opName.equals("not");;
		
		if (ruleReal || ruleBoolean) // Si les types correspondent à une règle...
			return type;
		else
			return new OclInvalid(new InvalidTypeOperation(this.target, opName, type), type);
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String opName = this.target.getOperationName();
		return opName + (opName.equals("-") ? "" : " ") + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource());
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
   * @generated NOT
   */
   @Override
  public String getOutlineString() {
    return String.join(".", this.target.getOperationName());
  }
 }