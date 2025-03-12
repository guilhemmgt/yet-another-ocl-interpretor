package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.AddOpCallExp;
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
		  return new UndefinedAccessInvalid(result == null ? this.target.getArgs().get(0) : this.target.getArgs().get(1));
	  }
	  if (result instanceof Invalid || right instanceof Invalid) {
		  return result instanceof Invalid ? result : right;
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
		// Calcul du type du premier argument
		OclType type0 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getType();
		
		// Si il n'y a pas de second argument, on renvoie le type du premier
		if (this.target.getOperationNames().size() == 0)
			return type0;
		
		// Calcul du type du second argument
		OclType type1 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(1)).getType();
		
		String opName = this.target.getOperationNames().get(0); // unique opération
		
		// Real & Real : Bool
		boolean ruleReal = type0.conformsTo(new OclReal()) && type1.conformsTo(new OclReal());
		// Invalid & Any : Invalid
		// Any & Invalid : Invalid
		boolean ruleNoInvalid = !type0.conformsTo(new OclInvalid()) && !type1.conformsTo(new OclInvalid());
		
		if (ruleReal && ruleNoInvalid) // Si les types correspondent à une règle...
			return new OclBoolean();
		else
			return new OclInvalid(new InvalidTypeOperation(this.target, opName, type0, type1), type0, type1);
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "";
		EList<AddOpCallExp> args = this.target.getArgs();
		EList<String> ops = this.target.getOperationNames();
		for (int i = 0; i < ops.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(args.get(i)) + ops.get(i);
		}
		res += OCLValidationAdapterFactory.INSTANCE.createAdapter(args.get(args.size()-1));
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
   * @generated NOT
   */
   @Override
  public String getOutlineString() {
	if (this.target.getOperationNames().size() == 0)
		return null;
	return this.target.getOperationNames().get(0);
  }
 }