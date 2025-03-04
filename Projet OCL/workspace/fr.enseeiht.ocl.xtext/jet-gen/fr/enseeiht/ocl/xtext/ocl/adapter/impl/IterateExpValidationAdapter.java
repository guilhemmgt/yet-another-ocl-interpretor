package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterate;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
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
	@SuppressWarnings("unchecked")
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
		if (sourceValue == null) {
			return new UndefinedAccessInvalid(sourceObject);
		}
		
		Collection<Object> source = (Collection<Object>) sourceValue;
		return new OclIterate(source, this.target.getBody(), this.target.getIterators(), contextTarget, this.target.getResult()).getReturnValue();
	}

	/**
	 * Get the type of the element
	 * 
	 * @return type of the element
	 * @generated
	 */
	public OclType getType() {
		// Récupération de la source
		PropertyCallExp container = (PropertyCallExp) this.target.eContainer();
		int pos = container.getCalls().indexOf(this.target);
		EObject sourceObject = null;
		if (pos == 0) {
			// root call
			sourceObject = container.getSource();
		} else {
			sourceObject = container.getCalls().get(pos - 1);
		}
		
		// Vérification du type de la cible
		OclType sourceType = OCLValidationAdapterFactory.INSTANCE.createAdapter(sourceObject).getType();
		if (sourceType instanceof OclInvalid) {
			return sourceType;
		}
		
		if (sourceType.conformsTo(new OclCollection(new OclAny()))) {
			OclCollection collectType = (OclCollection) sourceType;
			List<OclInvalid> errors = new ArrayList<OclInvalid>();
			for(Iterator i : this.target.getIterators()) {
				// Checks type of each iterator
				OclType iteratorType = OCLValidationAdapterFactory.INSTANCE.createAdapter(i).getType();
				if (iteratorType instanceof OclInvalid error) {
					errors.add(error);
				}
			}
			
			OclType resultType =  OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getResult()).getType(); 
			if (resultType instanceof OclInvalid error) {
				errors.add(error);
			} else if (resultType instanceof OclClassifier resultClassifier) {
				OclType resultVarType = resultClassifier.getRepresentedType();
				OclType bodyType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()).getType();
				if (bodyType instanceof OclInvalid error) {
					errors.add(error);
				}
				
				if (!bodyType.conformsTo(resultVarType)) {
					errors.add(new OclInvalid(this.target, "Type mismatch error : expected expression of type " + resultType + " but got " + bodyType + " instead."));
				}
				// Get effective type for later use
				resultType = resultVarType;
			}
			
			
			// If anything failed return combination of all
			if(!errors.isEmpty()) {
				OclInvalid[] errorsArray = new OclInvalid[errors.size()];
				for (int i = 0; i < errors.size(); i++) errorsArray[i] = errors.get(i); 
				return new OclInvalid(errorsArray);
			}
			return resultType;
		} else  {
			return new OclInvalid(this.target, "Type Mismatch error : expected collection but got " + sourceType + " instead." );
		}
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