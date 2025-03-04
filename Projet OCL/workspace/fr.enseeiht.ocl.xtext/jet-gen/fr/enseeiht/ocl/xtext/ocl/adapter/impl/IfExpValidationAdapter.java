package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.IfExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for IfExp
 * @generated
 */
public final class IfExpValidationAdapter implements OCLAdapter {

  private IfExp target;

  /**
   * @generated
   */
  public IfExpValidationAdapter(IfExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
    if ((Boolean) OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getCondition()).getValue(contextTarget)) {
    	return OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getThenExpression()).getValue(contextTarget);
    } else {
    	return OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getElseExpression()).getValue(contextTarget);
    }
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	 // La condition est booléenne, le corps a pour type quelque chose qui n'est pas OclInvalid, de même pour le Else.
	 // On obtient les trois types
	 OclType condition = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getCondition()).getType();
	 OclType thenelm = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getThenExpression()).getType();
	 OclType elseelm = OCLValidationAdapterFactory.INSTANCE.createAdapter(target.getElseExpression()).getType();
	 
	 if (!condition.conformsTo(new OclInvalid()) && condition.conformsTo(new OclBoolean())) {
		 return thenelm.unifyWith(elseelm);
	 }  else if (!condition.conformsTo(new OclInvalid())) {
		 // condition n'est pas un booléens
		 return new OclInvalid(new TypeMismatchError(target, new OclBoolean(), condition));
	 } else {
		 // condition est Invalid
		 return new OclInvalid(condition);
	 }

  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		return "if " + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getCondition()) +
			   " then " + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getThenExpression()) +
			   " else " + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getThenExpression()) +
			   " endif";
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