package fr.enseeiht.ocl.xtext.ocl.adapter.impl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIteratorFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.ocl.operation.OclOperationFactory;
import fr.enseeiht.ocl.xtext.ocl.operation.OperationResolutionUtils;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.PropertyCallExp;
import fr.enseeiht.ocl.xtext.OclType;

/**
 * OCLAdapter for IteratorExp
 * @generated
 */
public final class IteratorExpValidationAdapter implements OCLAdapter {

  private IteratorExp target;

  /**
   * @generated
   */
  public IteratorExpValidationAdapter(IteratorExp object) {
    this.target = object;
  }

  /**
   * Returns the value of the element given its context
   * @param Target
   * @return value of the element
   * @generated
   */
  public Object getValue(EObject contextTarget) {
	  PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
		int pos = container.getCalls().indexOf(this.target);
		OCLAdapter source;
		// Get value from the rest of the navigation
		if (pos == 0) {
			// root call
			source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getSource());
		} else {
			source = (OCLAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(container.getCalls().get(pos-1));
		}
		Object sourceValue = source.getValue(contextTarget);
		if (sourceValue != null) {

			// Récupération des itérateurs 
			List<OclIterator> iterators = OclIteratorFactory.getOperations(this.target.getName());
			
			// TODO : copier OperationCall pour vérifier des trucs de nerds genre les types et tout
			
			OclIterator iterator = iterators.get(0);
			
			return iterator.getReturnValue(((Collection<Object>)sourceValue), this.target.getBody(), this.target.getIterators(), contextTarget);			
		}
		return null;
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
		String res = "->" + this.target.getName() + "(";
		EList<Iterator> iters = this.target.getIterators();
		for (int i = 0; i < iters.size(); i++) {
			res += OCLValidationAdapterFactory.INSTANCE.createAdapter(iters.get(i)) + (i==iters.size()-1 ? "" : ",");
		}
		res += "|" + OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()) + ")";
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