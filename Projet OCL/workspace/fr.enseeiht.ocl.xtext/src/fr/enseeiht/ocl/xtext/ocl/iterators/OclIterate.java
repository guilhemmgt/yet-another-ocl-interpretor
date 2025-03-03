package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.LocalVariable;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.scope.Scoper;
import fr.enseeiht.ocl.xtext.utils.CartesianProduct;

public class OclIterate {
	private Collection<Object> source;
	private OclExpression body;			// Corps (généralement dépendant d'itérator.s) sur lequel on appliquera 'op' après avoir calculé sa valeur
	private EList<Iterator> iterators;
	private EObject contextTarget;
	private LocalVariable result;		// = null si utilisé dans le traitement d'un IteratorExp
	private Object resultInitValue;
	private IOclIterateBody op;			// Fonction de (result, body, iterator)->body

	// A utiliser lors du traitement d'un IterateExp (donc, via IterateExpValidationAdapter)
	public OclIterate(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget, LocalVariable result) {
		this.source = source;
		this.body = body;
		this.iterators = iterators;
		this.contextTarget = contextTarget;
		this.result = result;
		this.resultInitValue = OCLValidationAdapterFactory.INSTANCE.createAdapter(result.getInitExpression()).getValue(this.contextTarget);
		this.op = (r,b,i) -> b;
	}
	
	// A utiliser lors du traitement d'un IteratorExp (donc, via OclIteratorX)
	public OclIterate(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget, Object resultInitValue, IOclIterateBody op) {
		this.source = source;
		this.body = body;
		this.iterators = iterators;
		this.contextTarget = contextTarget;
		this.result = null;
		this.resultInitValue = resultInitValue;
		this.op = op;
	}
	
	public Object getReturnValue() {
		// Initialisation de 'result'
		Object resultValue = this.resultInitValue;
		if (this.result != null)
			Scoper.add(result, resultValue);
		// Génération des iterators
		List<List<Object>> iteratorsCombinations = CartesianProduct.generateCombinations(source, this.iterators.size());
		// Pour chaque combinaison d'itérateurs...
		for (List<Object> comb : iteratorsCombinations) {
			// Enregistrement des variables au scope
			for (int i = 0; i < comb.size(); i++) {
				Scoper.add(iterators.get(i), comb.get(i));
			}
			// Calcul de 'body' et actualisation de 'result'
			resultValue = this.op.apply(resultValue, OCLValidationAdapterFactory.INSTANCE.createAdapter(this.body).getValue(contextTarget), comb);
			if (this.result != null)
				Scoper.update(result, resultValue);
			// Désenregistrement des variables du scope
			for (Iterator i : iterators) {
				Scoper.remove(i);
			}
		}
		// Désenregistrer 'result' et renvoyer sa valeur
		if (this.result != null)
			Scoper.remove(result);
		return resultValue;
	}
}
