package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.TupleLiteralExp;
import fr.enseeiht.ocl.xtext.ocl.TuplePart;
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
 }