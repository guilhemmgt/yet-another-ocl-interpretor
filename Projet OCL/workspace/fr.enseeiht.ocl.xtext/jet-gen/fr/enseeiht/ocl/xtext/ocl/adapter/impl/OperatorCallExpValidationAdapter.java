package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccesException;
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
	
	if (left == null || right == null) {
		// Levée d'erreur et envoi de l'argument fautif
		throw new UndefinedAccesException(left == null ? this.target.getArgumentGauche() : this.target.getArgumentDroite());
	}
	
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
    throw new UnimplementedException(this.getClass(),"getType");
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