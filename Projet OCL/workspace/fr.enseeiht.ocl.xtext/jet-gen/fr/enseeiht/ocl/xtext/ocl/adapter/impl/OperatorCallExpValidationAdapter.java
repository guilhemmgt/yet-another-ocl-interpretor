package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
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
	Object result = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getValue(contextTarget);
	if (this.target.getOperationNames().size() == 0) {
		// Passage au rang suivant
		return result;
	}
	for(int i=0; i < this.target.getOperationNames().size();i++) {
		Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(i+1)).getValue(contextTarget);
		
		if (result == null || right == null) {
			// Levée d'erreur et envoi de l'argument fautif
			result = new UndefinedAccessInvalid(result == null ? this.target.getArgs().get(0) : this.target.getArgs().get(i+1));
		}
	if (result instanceof Invalid || right instanceof Invalid) {
		result = result instanceof Invalid ? result : right;
	}
			if (!(result instanceof Boolean && right instanceof Boolean)) {
			return false;
		}
		Boolean leftBool = ((Boolean)result);
		Boolean rightBool = ((Boolean)right);
		
		// Traitement des opérations  'and'|'or'|'xor'|'implies'|'equivalent'
		switch(this.target.getOperationNames().get(i)) {
			case "and":
				result = leftBool && rightBool;
				break;
			case "or": 
				result = leftBool || rightBool;
				break;
			case "xor":
				result = leftBool ^ rightBool;
				break;
			case "implies":
				result = !leftBool || (leftBool && rightBool);
				break;
			case "equivalent":
				result = (!leftBool && !rightBool) || (leftBool && rightBool);
				break;
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
	  // Attention : arg2 peut être vide si l'opération n'est pas une vraie opération (ce sera toujours le cas dans le membre de droite)
	  OCLAdapter arg1 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0));
	  OclType resultType = arg1.getType();
	  if (this.target.getOperationNames().size() == 0) {
		  // Il n'y a pas de membre à droite, on renvoie le type de arg1
		  return resultType;
	  }
	  else {
		  for(int i=0; i < this.target.getOperationNames().size(); i++) {
			  OCLAdapter arg2 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(i+1));
			  OclType type2 = arg2.getType();
			  // Boolean + Boolean : Boolean
			  boolean isBoolean = resultType.conformsTo(new OclBoolean()) && type2.conformsTo(new OclBoolean());
			  if (isBoolean) {
				  resultType = resultType.unifyWith(type2);
			  } else {
				  // Opération invalide
				  String message = "Invalid operation between types " + resultType + " and " + type2 + " (operation : '" + target.getOperationNames().get(i) + "')";
				  resultType = new OclInvalid(target, message, resultType, type2);
			  }
		  }
		  return resultType;
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