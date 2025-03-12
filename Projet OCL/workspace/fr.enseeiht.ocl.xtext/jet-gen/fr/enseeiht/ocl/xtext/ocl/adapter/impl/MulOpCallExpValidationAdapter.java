package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.ocl.adapter.DivisionByZeroInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.MulOpCallExp;
import fr.enseeiht.ocl.xtext.ocl.NotOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for MulOpCallExp
 * @generated
 */
public final class MulOpCallExpValidationAdapter implements OCLAdapter {

  private MulOpCallExp target;

  /**
   * @generated
   */
  public MulOpCallExpValidationAdapter(MulOpCallExp object) {
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
			// Cohérence de types
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
			if (!(result instanceof Number && right instanceof Number)) {
				throw new UnsupportedFeatureTypeException(this.target.getOperationNames().get(i),
						new Class<?>[] { result.getClass(), right.getClass() });
			}

			// Traitement des opérations
			switch (this.target.getOperationNames().get(i)) {
			case "*":
				if ((Number)result instanceof Integer && (Number)right instanceof Integer)
					result = ((Number)result).intValue() * ((Number)right).intValue();
				else
					result = ((Number)result).doubleValue() * ((Number)right).doubleValue();
				break;
			case "/":
				if ((right instanceof Integer && (Integer)right == 0) || (right instanceof Double && (Double)right == 0.0)) // Pas de division par zéro
					return new DivisionByZeroInvalid(this.target.getArgs().get(i + 1));
				if ((Number)result instanceof Integer && (Number)right instanceof Integer)
					result = ((Number)result).intValue() / ((Number)right).intValue();
				else
					result = ((Number)result).doubleValue() / ((Number)right).doubleValue();
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
		// Calcul du type du premier argument
		OclType resultType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getType();

		// Calcul du type des arguments suivants
		for (int i = 1; i < this.target.getArgs().size(); i++) {
			NotOpCallExp arg = this.target.getArgs().get(i); // ième argument
			String opName = this.target.getOperationNames().get(i - 1); // (i-1)ème opération (il y a 1 opération de - qu'il y a d'arguments)

			// Calcul du type du ième argument
			OclType argType = OCLValidationAdapterFactory.INSTANCE.createAdapter(arg).getType();

			// Real & Real : Real
			boolean ruleReal = resultType.conformsTo(new OclReal()) && argType.conformsTo(new OclReal());

			if (ruleReal) // Si les types correspondent à une règle...
				resultType = resultType.unifyWith(argType);
			else
				resultType = new OclInvalid(new InvalidTypeOperation(this.target, opName, resultType, argType), resultType, argType);
		}

		return resultType;
	}

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "";
		EList<NotOpCallExp> args = this.target.getArgs();
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