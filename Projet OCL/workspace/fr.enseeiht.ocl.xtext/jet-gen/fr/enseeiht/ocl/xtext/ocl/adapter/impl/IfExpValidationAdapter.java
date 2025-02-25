package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
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
	 
	 if (condition.conformsTo(new OclBoolean()) && !thenelm.conformsTo(new OclInvalid()) && !elseelm.conformsTo(new OclInvalid()) && thenelm.conformsTo(elseelm)) {
		 return thenelm.unifyWith(elseelm);
	 }  else if (!condition.conformsTo(new OclBoolean())) {
		 return new OclInvalid(target, "If expression requires that a condition of type 'Boolean', but '" + condition.toString() + "' was found instead.", thenelm, elseelm);
	 } else {
		 return new OclInvalid(target, "If expression requires that 'then' and 'else' branches be conform to each other, which is not the case of '" + thenelm.toString() + "' and '" + elseelm.toString() + "'.", thenelm, elseelm);
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