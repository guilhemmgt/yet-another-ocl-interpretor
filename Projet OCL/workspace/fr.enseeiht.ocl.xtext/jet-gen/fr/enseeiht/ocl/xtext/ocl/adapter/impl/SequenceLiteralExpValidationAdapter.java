package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.SequenceLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for SequenceLiteralExp
 * @generated
 */
public final class SequenceLiteralExpValidationAdapter implements OCLAdapter {

  private SequenceLiteralExp target;

  /**
   * @generated
   */
  public SequenceLiteralExpValidationAdapter(SequenceLiteralExp object) {
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
	  ArrayList<Object> sequence = new ArrayList<>();
	  for(OclExpression e : elts) {
		  sequence.add(OCLValidationAdapterFactory.INSTANCE.createAdapter(e).getValue(contextTarget));
	  }
	  return sequence;
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
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "Sequence{";
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