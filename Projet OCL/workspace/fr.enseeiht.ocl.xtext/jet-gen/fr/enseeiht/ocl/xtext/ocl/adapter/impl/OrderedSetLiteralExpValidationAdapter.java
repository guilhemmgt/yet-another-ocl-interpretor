package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.OrderedSetLiteralExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for OrderedSetLiteralExp
 * @generated
 */
public final class OrderedSetLiteralExpValidationAdapter implements OCLAdapter {

  private OrderedSetLiteralExp target;

  /**
   * @generated
   */
  public OrderedSetLiteralExpValidationAdapter(OrderedSetLiteralExp object) {
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
		String res = "OrderedSet{";
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
 }