package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
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
	  if (this.target.getOperationName() == null) {
		  // Passage au rang suivant
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  }
	  
	  // Cohérence de types
	  Object left = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentDroite()).getValue(contextTarget);
	  if (!(left instanceof Number && right instanceof Number)) {
		  return false;
	  }
	  Double leftNum = ((Number)left).doubleValue();
	  Double rightNum = ((Number)right).doubleValue();
	  
	  // Traitement des opérations
	  switch (this.target.getOperationName()) {
		  case ">":
			  return leftNum > rightNum;
		  case "<":
			  return leftNum < rightNum;
		  case ">=":
			  return leftNum >= rightNum;
		  case "<=":
			  return leftNum <= rightNum;
		  default:
			  throw new UnimplementedException("La methode getValue de RelOpCallExpAdapter n'as pas encore été implémentée pour cette opération");
	  }
  }
  /**
   * Get the type of the element
   * @return type of the element
   * @generated
   */
  public OclType getType() {
    throw new UnimplementedException("La methode getType de RelOpCallExpAdapter n'as pas encore été implémentée");
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