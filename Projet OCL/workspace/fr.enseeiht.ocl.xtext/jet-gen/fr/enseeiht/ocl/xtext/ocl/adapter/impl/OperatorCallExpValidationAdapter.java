package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.InvalidTypeOperation;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.EqOpCallExp;
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
				return null;
			}
			if (result instanceof Invalid || right instanceof Invalid) {
				return result instanceof Invalid ? result : right;
			}
			if (!(result instanceof Boolean && right instanceof Boolean)) {
				return false;
			}
			
			Boolean leftBool = ((Boolean) result);
			Boolean rightBool = ((Boolean) right);

			// Traitement des opérations 'and'|'or'|'xor'|'implies'|'equivalent'
			switch (this.target.getOperationNames().get(i)) {
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
		// Calcul du type du premier argument
		OclType resultType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(0)).getType();
		
		// Calcul du type des arguments suivants
		for (int i = 1; i < this.target.getArgs().size(); i++) {
			EqOpCallExp arg = this.target.getArgs().get(i); // ième argument
			String opName = this.target.getOperationNames().get(i - 1); // (i-1)ème opération (il y a 1 opération de - qu'il y a d'arguments)
		
			// Calcul du type du ième argument
			OclType argType = OCLValidationAdapterFactory.INSTANCE.createAdapter(arg).getType();
		
			// Boolean & Boolean : Boolean
			boolean ruleInteger = resultType.conformsTo(new OclBoolean()) && argType.conformsTo(new OclBoolean());
			
			if (ruleInteger) // Si les types correspondent à une règle...
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
		EList<EqOpCallExp> args = this.target.getArgs();
		EList<String> ops = this.target.getOperationNames();
		for (int i = 0; i < ops.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(args.get(i)) + " " + ops.get(i) + " ";
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
   * @generated
   */
   @Override
  public String getOutlineString() {
    return null;
  }
 }