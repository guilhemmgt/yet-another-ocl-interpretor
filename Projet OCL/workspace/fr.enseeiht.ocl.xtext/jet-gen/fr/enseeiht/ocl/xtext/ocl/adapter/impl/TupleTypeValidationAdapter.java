package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.HashMap;
import java.util.Map;

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
		  map.put(att.getName(), att.getType());
	  }
	  return new OclClassifier(new OclTuple(map));
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