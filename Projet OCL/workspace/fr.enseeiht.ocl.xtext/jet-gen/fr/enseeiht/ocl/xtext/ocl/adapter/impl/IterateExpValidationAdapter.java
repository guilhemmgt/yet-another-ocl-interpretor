package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterate;
import fr.enseeiht.ocl.xtext.scope.Scoper;
import fr.enseeiht.ocl.xtext.utils.CartesianProduct;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.IterateExp;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for IterateExp
 * @generated
 */
public final class IterateExpValidationAdapter implements OCLAdapter {

  private IterateExp target;

  /**
   * @generated
   */
  public IterateExpValidationAdapter(IterateExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated NOT
   */
	public Object getValue(EObject contextTarget) {
		// Récupération de la source
		PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
		int pos = container.getCalls().indexOf(this.target);
		EObject sourceObject = null;
		if (pos == 0) {
			// root call
			sourceObject =container.getSource();
		} else {
			sourceObject = container.getCalls().get(pos - 1);
		}
		Object sourceValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(sourceObject).getValue(contextTarget);
		Collection<Object> source = null;
		if (sourceValue == null) {
			return new UndefinedAccessInvalid(sourceObject);
		} else if (sourceValue instanceof Collection sourceCollec) {
			source = sourceCollec;
		} 
		
		return new OclIterate(source, this.target.getBody(), this.target.getIterators(), contextTarget, this.target.getResult()).getReturnValue();
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
		String res = "->iterate(";
		EList<Iterator> iters = this.target.getIterators();
		for (int i = 0; i < iters.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(iters.get(i)) + (i==iters.size()-1 ? "" : ",");
		}
		res += ";" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getResult()) + "|" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()) + ")";
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