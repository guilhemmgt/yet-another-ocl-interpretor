package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.EqOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.RelOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for EqOpCallExp
 * @generated
 */
public final class EqOpCallExpValidationAdapter implements OCLAdapter {

  private EqOpCallExp target;

  /**
   * @generated
   */
  public EqOpCallExpValidationAdapter(EqOpCallExp object) {
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

		Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(1))
				.getValue(contextTarget);

		Boolean equal = (result instanceof Number && right instanceof Number
				&& ((Number) result).doubleValue() == ((Number) right).doubleValue())
				|| (result != null && result.equals(right)) || (result == right);

		if (result instanceof Invalid || right instanceof Invalid) {
			return result instanceof Invalid ? result : right;
		}

		// Traitement des opérations
		switch (this.target.getOperationNames().get(0)) {
		case "=":
			return equal;
		case "<>":
			return !equal;
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
	  OCLAdapter arg1 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0));
	  if (this.target.getOperationNames().size() == 0) {
		  // Il n'y a pas de membre à droite, on renvoie le type de arg1
		  return arg1.getType();
	  } 
	  OCLAdapter arg2 = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(1));
	  OclType type1 = arg1.getType();
	  OclType type2 = arg2.getType();
	  // On peut comparer tout avec tout à condition qu'aucun argument ne soit invalide ou vide.
	  // C'est la spé.
	  boolean anyInvalid = type1.conformsTo(new OclInvalid()) || type2.conformsTo(new OclInvalid());
	  
	  if (anyInvalid){
		  // Opération invalide
		  return new OclInvalid(new InvalidTypeOperation(target, target.getOperationNames().get(0), type1, type2));
	  }
	  else {
		  return new OclBoolean();
	  }
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "";
		EList<RelOpCallExp> args = this.target.getArgs();
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