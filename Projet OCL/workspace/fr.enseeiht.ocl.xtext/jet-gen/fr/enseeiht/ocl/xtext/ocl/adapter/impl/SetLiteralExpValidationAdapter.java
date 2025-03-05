package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclSet;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.SetLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for SetLiteralExp
 * @generated
 */
public final class SetLiteralExpValidationAdapter implements OCLAdapter {

  private SetLiteralExp target;

  /**
   * @generated
   */
  public SetLiteralExpValidationAdapter(SetLiteralExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
  public Object getValue(EObject contextTarget) {
	  EList<OclExpression> elts = this.target.getElements();
	  HashSet<Object> set = new HashSet<>();
	  for(OclExpression e : elts) {
		  Object eValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(e).getValue(contextTarget);
		  if (eValue instanceof Invalid)
			  return eValue;
		  set.add(eValue);
	  }
	  return set;
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  OclType subtype = null;
	  for (OclExpression exp : target.getElements()) {
		  OclType eltType  = OCLValidationAdapterFactory.INSTANCE.createAdapter(exp).getType();
		  if (subtype == null) {
			  // Initialisation
			  subtype = eltType;
		  }
		  else {
			  // Unification des sous-types
			  subtype = subtype.unifyWith(eltType);
		  }
		  
	  }
	  if (subtype instanceof OclInvalid) {
		  return new OclInvalid(subtype);
	  }
	  return new OclSet(subtype);
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "Set{";
		EList<OclExpression> elts = this.target.getElements();
		for (int i = 0; i < elts.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(elts.get(i)) + (i==elts.size()-1 ? "" : ",");
		}
		res += "}";
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