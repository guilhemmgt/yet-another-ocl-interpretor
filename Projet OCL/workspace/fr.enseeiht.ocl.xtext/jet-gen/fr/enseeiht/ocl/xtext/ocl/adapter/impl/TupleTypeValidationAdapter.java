package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclTuple;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.TupleType;
import fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for TupleType
 * @generated
 */
public final class TupleTypeValidationAdapter implements OCLAdapter {

  private TupleType target;

  /**
   * @generated
   */
  public TupleTypeValidationAdapter(TupleType object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
    throw new UnimplementedException(this.getClass(),"getValue");
  }

  /**
   * Get the type of the element
   * @return type of the element
   * @generated NOT
   */
  public OclType getType() {
	  Map<String, OclType> map = new HashMap<String, OclType>();
	  for (TupleTypeAttribute attribute : target.getAttributes()) {
		  TupleTypeAttributeValidationAdapter att = (TupleTypeAttributeValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(attribute);
		  OclClassifier classi = (OclClassifier) att.getType();
		  map.put(att.getName(), classi.getRepresentedType());
	  }
	  return new OclClassifier(new OclTuple(map));
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "Tuple(";
		EList<TupleTypeAttribute> attrs = this.target.getAttributes();
		for (int i = 0; i < attrs.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(attrs.get(i)) + (i==attrs.size()-1 ? "" : ",");
		}
		res += ")";
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