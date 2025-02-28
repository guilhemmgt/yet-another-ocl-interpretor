package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
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
		Object result = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0))
				.getValue(contextTarget);
		if (this.target.getOperationNames().size() == 0) {
			// Passage au rang suivant
			return result;
		}
		for (int i = 0; i < this.target.getOperationNames().size(); i++) {
			Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(i + 1))
					.getValue(contextTarget);

			if (result == null || right == null) {
				// Levée d'erreur et envoi de l'argument fautif
				result = new UndefinedAccessInvalid(
						result == null ? this.target.getArgs().get(0) : this.target.getArgs().get(i + 1));
			}
			if (result instanceof Invalid || right instanceof Invalid) {
				return result instanceof Invalid ? result : right;
			}

			// Traitement des opérations
			switch (this.target.getOperationNames().get(i)) {
			case "+":
				if (result instanceof Number && right instanceof Number) {
					result = (result instanceof Integer ? (Integer) result : (Double) result)
							+ (right instanceof Integer ? (Integer) right : (Double) right);
					break;
				} else if (result instanceof String && right instanceof String) {
					result = ((String) result).concat((String) right);
					break;
				} else {
					throw new UnsupportedFeatureTypeException(this.target.getOperationNames().get(i),
							new Class<?>[] { result.getClass(), right.getClass() });
				}
			case "-":
				if (result instanceof Number && right instanceof Number) {
					result = (result instanceof Integer ? (Integer) result : (Double) result)
							- (right instanceof Integer ? (Integer) right : (Double) right);
					break;
				} else {
					throw new UnsupportedFeatureTypeException(this.target.getOperationNames().get(i),
							new Class<?>[] { result.getClass(), right.getClass() });
				}
			default:
				throw new UnsupportedFeatureException(this.target.getOperationNames().get(i));
			}
		}
		return result;
	  
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
		  // String, supportant "+"
		  boolean isString = t0.conformsTo(new OclString());
		  // Real / Integer, supportant "+-"
		  boolean isReal = t0.conformsTo(new OclReal());
		  // operator = '+' | '-'. Utile pour string
		  boolean operatorIsAddition = true;
		  // Le résultat de l'unification des types
		  OclType unifyResult = t0;
		  // Pour le report des erreurs: stocke les types uniques
		  List<OclType> uniqueTypes = new LinkedList<OclType>();
		  
		  for (int itr = 1; itr < target.getArgs().size(); itr++) {
			  OclType titr = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(itr)).getType();
			  
			  isString = isString && titr.conformsTo(new OclString());
			  isReal = isReal && titr.conformsTo(new OclReal());
			  operatorIsAddition = operatorIsAddition && this.target.getOperationNames().get(itr-1).equals("+");
			  
			  if (isString || isReal) {
				  unifyResult = unifyResult.unifyWith(titr);
			  }
			  
			  boolean isUnique = true;
			  for (OclType typ : uniqueTypes) {
				  isUnique = isUnique && typ.getClass().equals(titr.getClass());
			  }
			  if (!isUnique) uniqueTypes.add(titr);
		  }
		  
		  if (isString && operatorIsAddition || isReal){
			  // Rappel : Puisque Integer s'unifie avec Real, on a : Real + Integer : Real
			  return unifyResult;
		  } else {
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
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "";
		EList<IntOpCallExp> args = this.target.getArgs();
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
    return String.join(".", this.target.getOperationNames());
  }
 }