package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.types.OclString;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.EqOpCallExp;
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
	  if (this.target.getOperationName() == null) {
		  // Passage au rang suivant
		  return OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  }
	  
	  Object left = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentGauche()).getValue(contextTarget);
	  Object right = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getArgumentDroite()).getValue(contextTarget);
	  Boolean equal;
	  if (left != null) {
		  equal = left.equals(right) || (left instanceof Number && right instanceof Number && ((Number)left).doubleValue() == ((Number)right).doubleValue());
	  } else {
		  equal = right == null;
	  }

	  // Traitement des opérations  '='|'<>'
	  switch(this.target.getOperationName()) {
	  	case "=": 
	  		return equal;
	  	case "<>":
	  		return !equal;
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