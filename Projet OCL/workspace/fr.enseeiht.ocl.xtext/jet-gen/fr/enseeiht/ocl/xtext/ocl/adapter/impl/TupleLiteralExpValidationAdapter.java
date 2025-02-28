package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclTuple;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.TupleLiteralExp;
import fr.enseeiht.ocl.xtext.ocl.TuplePart;
import fr.enseeiht.ocl.xtext.ocl.TupleTypeAttribute;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for TupleLiteralExp
 * @generated
 */
public final class TupleLiteralExpValidationAdapter implements OCLAdapter {

  private TupleLiteralExp target;

  /**
   * @generated
   */
  public TupleLiteralExpValidationAdapter(TupleLiteralExp object) {
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
	  for (TuplePart part : target.getTuplePart()) {
		  TuplePartValidationAdapter pt = (TuplePartValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(part);
		  if (pt.getType() instanceof OclInvalid) {
			  return new OclInvalid(pt.getType());
		  }
		  map.put(pt.getName(), pt.getType());
	  }
	  return new OclTuple(map);
  }

  /**
   * @generated NOT
   */
   @Override
	public String toString() {
		String res = "Tuple{";
		EList<TuplePart> parts = this.target.getTuplePart();
		for (int i = 0; i < parts.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(parts.get(i)) + (i==parts.size()-1 ? "" : ",");
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