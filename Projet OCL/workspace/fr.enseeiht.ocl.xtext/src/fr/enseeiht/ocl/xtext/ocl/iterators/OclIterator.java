package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.types.OclCollection;

public abstract class OclIterator {

	/**
	 * Renvoie la valeur de l'itérateur
	 * @param source objet sur lequel est appelé l'itérateur
	 * @param body corps de l'itérateur
	 * @param iterators itérateurs
	 * @param contextTarget contexte
	 * @return valeur
	 */
	public Object getReturnValue(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget) {
		return getReturnValue(source, body, iterators, contextTarget, (b, i) -> b);
	}
	
	/**
	 * Renvoie la valeur de l'itérateur
	 * @param source objet sur lequel est appelé l'itérateur
	 * @param body corps de l'itérateur
	 * @param iterators itérateurs
	 * @param contextTarget contexte
	 * @param op opération à appliquer sur le body une fois sa valeur calculée
	 * @return valeur
	 */
	public abstract Object getReturnValue(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget, IOclIteratorBody op);
	
	/**
	 * Renvoie le type de l'itérateur
	 * @param collectedType type contenu par la collection sur laquelle est appliquée l'itérateur
	 * @return type
	 */
	public abstract OclType getReturnType(OclType collectedType);
	
	/**
	 * Renvoie le type de collection surlequel peut être appliqué l'itérateur
	 * @return type
	 */
	public abstract OclCollection getSourceType();
	
	/**
	 * Renvoie le type de corps que peut contenir l'itérateur
	 * @return type
	 */
	public abstract OclType getBodyType();
	
	/**
	 * Renvoie le nombre minimum d'itérateurs
	 * @return nombre minimum d'itérateurs
	 */
	public abstract int getMinIteratorAmount();
	
	/**
	 * Renvoie le nombre maximum d'itérateurs
	 * @return nombre maximum d'itérateurs
	 */
	public abstract int getMaxIteratorAmount();
	
	/**
	 * Renvoie le nom de l'itérateur
	 * @return nom
	 */
	public abstract String getName();
}
