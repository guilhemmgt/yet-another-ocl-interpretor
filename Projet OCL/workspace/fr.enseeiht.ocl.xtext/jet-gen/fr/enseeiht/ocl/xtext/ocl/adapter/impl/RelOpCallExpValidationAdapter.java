package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.RelOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for RelOpCallExp
 * @generated
 */
public final class RelOpCallExpValidationAdapter implements OCLAdapter {

  private RelOpCallExp target;

  /**
   * @generated
   */
  public RelOpCallExpValidationAdapter(RelOpCallExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  Object result = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getValue(contextTarget);
	  if (this.target.getOperationNames().size() == 0) {
		  // Passage au rang suivant
		  return result;
	  }
	  
	  Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(1)).getValue(contextTarget);
	  
	  if (result == null || right == null) {
			// Levée d'erreur et envoi de l'argument fautif
			result = new UndefinedAccessInvalid(result == null ? this.target.getArgs().get(0) : this.target.getArgs().get(1));
	  }
	  if (result instanceof Invalid || right instanceof Invalid) {
		  result =  result instanceof Invalid ? result : right;
	  }
	  
	  if (!(result instanceof Number && right instanceof Number)) {
		  return false;
	  }
	  Double leftDouble = ((Number)result).doubleValue();
	  Double rightDouble = ((Number)right).doubleValue();
	  
	  // Traitement des opérations
	  switch (this.target.getOperationNames().get(0)) {
		  case ">":
		  return leftDouble > rightDouble;
	  case "<":
		  return leftDouble < rightDouble;
	  case ">=":
		  return leftDouble >= rightDouble;
	  case "<=":
		  return leftDouble <= rightDouble;
	  default:
		  throw new UnsupportedFeatureException(this.target.getOperationNames().get(0));
		  
	  }
  }
  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  
	  // Attention : arg2 peut être vide si l'opération n'est pas une vraie opération (ce sera toujours le cas dans le membre de droite)
	  OCLAdapter arg1 =  OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0));
	  if (this.target.getOperationNames().size() == 0) {
		  // Il n'y a pas de membre à droite, on renvoie le type de arg1
		  return arg1.getType();
	  } 
	  else {
		  OCLAdapter arg2 =  OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(1));
		  OclType type1 = arg1.getType();
		  OclType type2 = arg2.getType();
		  // Real > Real : Bool
		  boolean isReal = type1.conformsTo(new OclReal()) && type2.conformsTo(new OclReal());
		  // Invalid > ... : Invalid
		  boolean anyInvalid = type1.conformsTo(new OclInvalid()) || type2.conformsTo(new OclInvalid());
		  // Void > ... : Void
		  boolean anyVoid = type1.conformsTo(new OclVoid()) || type2.conformsTo(new OclVoid());
		  
		  if (isReal){
			  return new OclBoolean();
		  }
		  else if (anyVoid && !anyInvalid) {
			  return new OclVoid();
		  }
		  else {
			  // Opération invalide
			  String message = "Invalid operation between types " + type1 + " and " + type2 + " (operation : '" + target.getOperationNames().get(0) + "')";
			  return new OclInvalid(target, message, type1, type2);
		  }
	  }
	  
	  
  }

  /**
   * @generated
   */
   @Override
  public String toString() {
    return super.toString();
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