package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureTypeException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.DivisionByZeroInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclInteger;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.IntOpCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for IntOpCallExp
 * @generated
 */
public final class IntOpCallExpValidationAdapter implements OCLAdapter {

  private IntOpCallExp target;

  /**
   * @generated
   */
  public IntOpCallExpValidationAdapter(IntOpCallExp object) {
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
		  // Cohérence de types
		  Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(i+1)).getValue(contextTarget);
	
		  if (result == null || right == null) {
			  // Levée d'erreur et envoi de l'argument fautif
			  result = new UndefinedAccessInvalid(result == null ? this.target.getArgs().get(0) : this.target.getArgs().get(i+1));
		  }
	  if (result instanceof Invalid || right instanceof Invalid) {
		  result = result instanceof Invalid ? result : right;
	  }
			  if (!(result instanceof Integer && right instanceof Integer)) {
			  throw new UnsupportedFeatureTypeException(this.target.getOperationNames().get(i), new Class<?>[] { result.getClass(), right.getClass() });
		  }
		  Integer leftNum = ((Integer)result);
		  Integer rightNum = ((Integer)right);
		  
		  // Traitement des opérations
		  switch (this.target.getOperationNames().get(i)) {
			  case "div":
				  if (rightNum == 0)
					  return new DivisionByZeroInvalid(this.target.getArgs().get(i+1));
				  result = leftNum / rightNum;
				  break;
			  case "mod":
				  if (rightNum == 0)
					  return new DivisionByZeroInvalid(this.target.getArgs().get(i+1));
				  result = leftNum % rightNum;
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
	  boolean isInteger = resultType.conformsTo(new OclInteger());
	  for(int i=0; i < this.target.getOperationNames().size(); i++) {
		  OCLAdapter arg = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgs().get(i+1));
		  OclType argType = arg.getType();
		  // Integer mod Integer : Integer
		  isInteger = isInteger && argType.conformsTo(new OclInteger());
		  
		  if (isInteger) {
			  resultType =  resultType.unifyWith(argType);
		  } else {
			  // Opération invalide
			  String message = "Invalid operation between types " + resultType + " and " + argType + " (operation : '" + target.getOperationNames() + "')";
			  resultType =  new OclInvalid(target, message, resultType, argType);
		  }
	  }
	  return resultType;
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