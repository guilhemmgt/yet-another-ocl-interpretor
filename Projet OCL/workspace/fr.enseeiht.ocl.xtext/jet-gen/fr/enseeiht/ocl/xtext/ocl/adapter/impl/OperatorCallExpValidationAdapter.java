package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OperatorCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OperatorCallExp
 * @generated
 */
public final class OperatorCallExpValidationAdapter implements OCLAdapter {

  private OperatorCallExp target;

  /**
   * @generated
   */
  public OperatorCallExpValidationAdapter(OperatorCallExp object) {
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
	if (!(left instanceof Boolean && right instanceof Boolean)) {
		return false;
	}
	Boolean leftBool = ((Boolean)left);
	Boolean rightBool = ((Boolean)right);
	
	// Traitement des opérations  'and'|'or'|'xor'|'implies'|'equivalent'
	switch(this.target.getOperationName()) {
		case "and":
			return leftBool && rightBool;
		case "or": 
			return leftBool || rightBool;
		case "xor":
			return leftBool ^ rightBool;
		case "implies":
			return !leftBool || (leftBool && rightBool);
		case "equivalent":
			return (!leftBool && !rightBool) || (leftBool && rightBool);
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
	  // Attention : arg2 peut être vide si l'opération n'est pas une vraie opération (ce sera toujours le cas dans le membre de droite)
	  OperatorCallExpValidationAdapter arg1 = (OperatorCallExpValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche());
	  OperatorCallExpValidationAdapter arg2 = (OperatorCallExpValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentDroite());
	  if (arg2 == null) {
		  // Il n'y a pas de membre à droite, on renvoie le type de arg1
		  return arg1.getType();
	  }
	  else {
		  OclType type1 = arg1.getType();
		  OclType type2 = arg2.getType();
		  // Boolean + Boolean : Boolean
		  boolean isBoolean = type1.conformsTo(new OclBoolean()) && type2.conformsTo(new OclBoolean());
		  // Invalid + ... : Invalid
		  boolean anyInvalid = type1.conformsTo(new OclInvalid()) || type2.conformsTo(new OclInvalid());
		  // Void + ... : Void
		  boolean anyVoid = type1.conformsTo(new OclVoid()) || type2.conformsTo(new OclVoid());
		  if (isBoolean) {
			  return new OclBoolean();
		  }
		  else if (anyVoid && !anyInvalid) {
			  return new OclVoid();
		  }
		  else {
			  // Opération invalide
			  String message = "Invalid operation between types " + type1 + " and " + type2 + " (operation : '" + target.getOperationName() + "')";
			  return new OclInvalid(target, message, type1, type2);
		  }
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