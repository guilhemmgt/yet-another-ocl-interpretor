package fr.enseeiht.ocl.xtext.ocl.adapter.impl;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.scope.Scoper;
import fr.enseeiht.ocl.xtext.utils.CartesianProduct;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.IterateExp;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
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
		List<Object> source = null; // TODO comment obtenir la source ? même problème que pour la navigation ...
		
		// Enregistrement de 'result'
		// TODO (?) Erreur si ce même Auxiliary est déjà enregistré dans le scope, mais ça ne devrait jamais arriver. Pareil pour les iterators. L'erreur peut aussi être faite côté Scoper
		Scoper.add(this.target.getResult(), OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getResult().getInitExpression()));
		
		// Génération des iterators
		EList<Iterator> iterators = this.target.getIterators();
		List<List<Object>> iteratorsCombinations = CartesianProduct.generateCombinations(source, iterators.size());
		
		// Pour chaque combinaison d'itérateurs...
		for (List<Object> comb : iteratorsCombinations) {
			// Enregistrement des variables au scope
			for (int i = 0; i < comb.size(); i++) {
				Scoper.add(iterators.get(i), comb.get(i));
			}
			
			// Calcul de 'body' et actualisation de 'result'
			Scoper.update(this.target.getResult(), OCLValidationAdapterFactory.INSTANCE.createAdapter(this.target.getBody()));
			
			// Désenregistrement des variables du scope
			for (Iterator i : iterators) {
				Scoper.remove(i);
			}
		}
		
		// Désenregistrer 'result' et renvoyer sa valeur
		return Scoper.remove(this.target.getResult());
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