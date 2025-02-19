package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
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
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException("La methode getValue de NotOpCallExpAdapter n'as pas encore été implémentée");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  // Attention : arg2 peut être vide si l'opération n'est pas une vraie opération (ce sera toujours le cas dans le membre de droite)
	  OperatorCallExpValidationAdapter arg = (OperatorCallExpValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getSource());
	  
	  OclType type = arg.getType();
	  // not Boolean : boolean
	  boolean isBoolean = type.conformsTo(new OclBoolean());
	  // - Real : Real
	  boolean isReal = type.conformsTo(new OclReal());
	  // operator = 'not' | '-'
	  boolean operationIsNot = this.target.getOperationName() == "not";
	  if (isBoolean && operationIsNot) {
		  return new OclBoolean();
	  }
	  else if (isReal && !operationIsNot) {
		  return new OclReal();
	  }
	  else {
		  // Opération invalide
		  String message = "Invalid operation for type " + type + "(operation : '" + target.getOperationName() + "')";
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