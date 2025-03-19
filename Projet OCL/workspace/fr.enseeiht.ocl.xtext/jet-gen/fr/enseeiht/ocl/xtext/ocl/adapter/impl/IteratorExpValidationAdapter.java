package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIteratorEnum;
import fr.enseeiht.ocl.xtext.scoping.Scoper;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.CartesianProduct;
import fr.enseeiht.ocl.xtext.utils.Pair;
import fr.enseeiht.ocl.xtext.validation.IncorrectNumberOfIteratorsError;
import fr.enseeiht.ocl.xtext.validation.IteratorNotFoundError;
import fr.enseeiht.ocl.xtext.validation.TypeMismatchError;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.UndefinedAccessInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnsupportedFeatureException;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
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
			sourceObject = container.getSource();
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
		Collection<Object> sourceCollection = (Collection<Object>) sourceValue;
		
		// Récupération de l'itérateur
		OclIterator iterator = OclIteratorEnum.getIterator(this.target.getName());
		if (iterator == null)
			return new UnsupportedFeatureException(this.target.getName());

		// Génération des combinaisons d'itérateurs
		List<List<Object>> iteratorsCombinations = CartesianProduct.generateCombinations(sourceCollection, this.target.getIterators().size());
		
		// On construira une liste reliant chaque N-combinaison de valeurs d'itérateurs à leur valeur de 'body'
		List<Pair<List<Object>, Object>> iteratorBodyValues = new ArrayList<>();
		
		// Pour chaque combinaison d'itérateurs...
		for (List<Object> comb : iteratorsCombinations) {
			// Enregistrement des variables au scope
			for (int i = 0; i < this.target.getIterators().size(); i++) {
				Scoper.add(this.target.getIterators().get(i), comb.get(i));
			}
			
			// Calcul de 'body'
			Object bodyValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()).getValue(contextTarget);
			iteratorBodyValues.add(new Pair<>(comb, bodyValue));
			
			// Désenregistrement des variables du scope
			for (int i = 0; i < this.target.getIterators().size(); i++) {
				Scoper.remove(this.target.getIterators().get(i));
			}
		}
		
		return iterator.getReturnValue(iteratorBodyValues, this.target, sourceValue.getClass());
  }

  /**
   * Get the type of the element
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

		// Vérification du type de la cible
		OclType sourceType = OCLValidationAdapterFactory.INSTANCE.createAdapter(sourceObject).getType();
		if (sourceType instanceof OclInvalid) {
			return sourceType;
		}
		if (!sourceType.conformsTo(new OclCollection(new OclAny()))) {
			return new OclInvalid(new TypeMismatchError(this.target, new OclCollection(null), sourceType));
		}

		OclIterator iterator = OclIteratorEnum.getIterator(this.target.getName());
		if (iterator == null) {
			return new OclInvalid(new IteratorNotFoundError(sourceObject, this.target.getName()));
		}
		
		List<OclInvalid> errors = new ArrayList<OclInvalid>();
		
		// nb d'iterators
		if (!(this.target.getIterators().size() >= iterator.getMinIteratorAmount() && this.target.getIterators().size() <= iterator.getMaxIteratorAmount())) {
			errors.add(new OclInvalid(new IncorrectNumberOfIteratorsError(this.target, iterator, this.target.getIterators().size())));
		}
		
		// type des iterators
		for (Iterator i : this.target.getIterators()) {
			// Checks type of each iterator
			OclType iteratorType = OCLValidationAdapterFactory.INSTANCE.createAdapter(i).getType();
			if (iteratorType instanceof OclInvalid error) {
				errors.add(error);
			}
		}
		// type du résultat
		OclType resultType = iterator.getExpectedBodyType();
		if (resultType instanceof OclInvalid error) {
			errors.add(error);
		}
		// type du body
		OclType bodyType = OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()).getType();
		if (bodyType instanceof OclInvalid error) {
			errors.add(error);
		}
		if (!bodyType.conformsTo(resultType)) {
			errors.add(new OclInvalid(new TypeMismatchError(this.target, resultType, bodyType)));
		}
		
		// If anything failed return combination of all
		if (!errors.isEmpty()) {
			OclInvalid[] errorsArray = new OclInvalid[errors.size()];
			for (int i = 0; i < errors.size(); i++)
				errorsArray[i] = errors.get(i);
			return new OclInvalid(errorsArray);
		}
		
		return iterator.getReturnType(sourceType, bodyType);
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