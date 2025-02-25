package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.types.OclVoid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccesException;
import fr.enseeiht.ocl.xtext.ocl.AddOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.IntOpCallExp;
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
   * @generated NOT
   */
  public OclType getType() {
	  // On s'assure que tous les types sont conformes à l'un des types valides de l'opération
	  this.target.getArgs();
	  OclType t0 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getType();
	  if (this.target.getOperationNames().isEmpty()) {
		  // Il n'y a pas de membre à droite, on renvoie le type du premier
		  return t0;
	  }
	  else {
		  // On boucle sur les opérations
		  int itr = 1;
		  // String, supportant "+"
		  boolean isString = t0.conformsTo(new OclString());
		  // Real / Integer, supportant "+-"
		  boolean isReal = t0.conformsTo(new OclReal());
		  // operator = '+' | '-'. Utile pour string
		  boolean operatorIsAddition = true;
		  OclInvalid fail_collector = null;
		  boolean anyVoid = false;
		  // Le résultat de l'unification des types
		  OclType unifyResult = t0;
		  // Pour le report des erreurs: stocke les types uniques
		  List<OclType> uniqueTypes = new LinkedList<OclType>();
		  
		  while (target.getArgs().get(itr) != null) {
			  OclType titr = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(itr)).getType();
			  
			  isString = isString && titr.conformsTo(new OclString());
			  isReal = isReal && titr.conformsTo(new OclReal());
			  operatorIsAddition = operatorIsAddition && this.target.getOperationNames().get(itr-1).equals("+");
			  
			  if (titr.conformsTo(new OclInvalid())) {
				  if (fail_collector == null) {
					  fail_collector = new OclInvalid(titr);
				  } else {
					  fail_collector = new OclInvalid(fail_collector, titr);
				  }
			  }
			  anyVoid = anyVoid && titr.conformsTo(new OclVoid());
			  
			  if (isString || isReal) {
				  unifyResult = unifyResult.unifyWith(titr);
			  }
			  
			  boolean isUnique = true;
			  for (OclType typ : uniqueTypes) {
				  isUnique = isUnique && typ.getClass().equals(titr.getClass());
			  }
			  if (!isUnique) {
				  uniqueTypes.add(titr);
			  }
		  }
		  
		  if ((isString || isReal) && operatorIsAddition ){
			  // Rappel : Puisque Integer s'unifie avec Real, on a : Real + Integer : Real
			  return unifyResult;
		  }
		  else if (isReal && !operatorIsAddition){
			  return unifyResult;
		  }
		  else if (anyVoid && fail_collector == null) {
			  return new OclVoid();
		  }
		  else {
			  // Opération invalide
			  String message = "Invalid operation '" + (operatorIsAddition ? "+" : "-") + "' with types ";
			  List<String> messageStr = new LinkedList<String>(); 
			  for (OclType typ : uniqueTypes) {
				  messageStr.add(typ.toString());
			  }
			  message += String.join(", ", messageStr) + ".";
			  if (fail_collector != null) return new OclInvalid(target, message, fail_collector);
			  else return new OclInvalid(target, message);
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