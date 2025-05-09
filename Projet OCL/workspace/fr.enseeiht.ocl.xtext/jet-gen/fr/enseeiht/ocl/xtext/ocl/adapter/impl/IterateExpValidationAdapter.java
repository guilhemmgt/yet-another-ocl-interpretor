package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.scoping.Scoper;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.CartesianProduct;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
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
		if (sourceValue instanceof Invalid) {
			return sourceValue;
		}
		
		Collection<Object> source = (Collection<Object>) sourceValue;
		
		// Initialisation de 'result'
		Object resultValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getResult().getInitExpression()).getValue(contextTarget);
		Scoper.add(this.target.getResult(), resultValue);
		// Génération des iterators
		List<List<Object>> iteratorsCombinations = CartesianProduct.generateCombinations(source, this.target.getIterators().size());
		// Pour chaque combinaison d'itérateurs...
		for (List<Object> comb : iteratorsCombinations) {
			// Enregistrement des variables au scope
			for (int i = 0; i < this.target.getIterators().size(); i++) {
				Scoper.add(this.target.getIterators().get(i), comb.get(i));
			}
			// Actualisation de 'result'
			resultValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()).getValue(contextTarget);;
			Scoper.update(this.target.getResult(), resultValue);
			// Désenregistrement des variables du scope
			for (Iterator i : this.target.getIterators()) {
				Scoper.remove(i);
			}
		}
		// Désenregistrer 'result' et renvoyer sa valeur
		Scoper.remove(this.target.getResult());
		return resultValue;
	}

	/**
	 * Get the type of the element
	 * 
	 * @return type of the element
	 * @generated NOT
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

		// Vérifier le type de la cible
		OclType sourceType = OCLValidationAdapterFactory.INSTANCE.createAdapter(sourceObject).getType();
		if (sourceType instanceof OclInvalid) {
			return sourceType;
		}

		if (sourceType.conformsTo(new OclCollection(new OclAny()))) {
			OclCollection collectType = (OclCollection) sourceType;
			List<OclInvalid> errors = new ArrayList<OclInvalid>();
			for (Iterator i : this.target.getIterators()) {
				// Checks type of each iterator
				OclType iteratorType = OCLValidationAdapterFactory.INSTANCE.createAdapter(i).getType();
				if (iteratorType instanceof OclInvalid error) {
					errors.add(error);
				} else if (!iteratorType.conformsTo(collectType.getSubtype())) {
					errors.add(new OclInvalid(new TypeMismatchError(i, collectType.getSubtype(), iteratorType)));
				}
			}

			OclType resultType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getResult()).getType();
			if (resultType instanceof OclInvalid error) {
				errors.add(error);
			} else if (resultType instanceof OclClassifier resultClassifier) {
				OclType resultVarType = resultClassifier.getRepresentedType();
				OclType bodyType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()).getType();
				if (bodyType instanceof OclInvalid error) {
					errors.add(error);
				}

				if (!bodyType.conformsTo(resultVarType)) {
					errors.add(new OclInvalid(new TypeMismatchError(this.target, resultType, bodyType)));
				}
				// Get effective type for later use
				resultType = resultVarType;
			}

			// If anything failed return combination of all
			if (!errors.isEmpty()) {
				OclInvalid[] errorsArray = new OclInvalid[errors.size()];
				for (int i = 0; i < errors.size(); i++)
					errorsArray[i] = errors.get(i);
				return new OclInvalid(errorsArray);
			}
			return resultType;
		} else {
			return new OclInvalid(new TypeMismatchError(this.target, new OclCollection(null), sourceType));
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