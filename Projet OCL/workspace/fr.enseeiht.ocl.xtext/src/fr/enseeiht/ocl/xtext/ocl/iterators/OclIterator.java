package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.utils.Pair;

public interface OclIterator {

	/**
	 * TODO
	 * 
	 * iteratorExp principalement pour la remontée d'errreurs ?
	 * 
	 * Renvoie la valeur de l'itérateur
	 * @param source objet sur lequel est appelé l'itérateur
	 * @param body corps de l'itérateur
	 * @param iterators itérateurs
	 * @param contextTarget contexte
	 * @return valeur
	 */
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass);
	
	/**
	 * Renvoie le type de l'itérateur
	 * @param sourceType type contenu par la collection sur laquelle est appliquée l'itérateur
	 * @param bodyType TODO
	 * @return type
	 */
	public OclType getReturnType(OclType sourceType, OclType bodyType);
	
	/**
	 * Renvoie le type de collection surlequel peut être appliqué l'itérateur
	 * @return type
	 */
	public OclCollection getSourceType();
	
	/**
	 * Renvoie le type de corps que peut contenir l'itérateur
	 * @return type
	 */
	public OclType getBodyType();
	
	/**
	 * Renvoie le nombre minimum d'itérateurs
	 * @return nombre minimum d'itérateurs
	 */
	public int getMinIteratorAmount();
	
	/**
	 * Renvoie le nombre maximum d'itérateurs
	 * @return nombre maximum d'itérateurs
	 */
	public int getMaxIteratorAmount();
	
	/**
	 * Renvoie le nom de l'itérateur
	 * @return nom
	 */
	public String getName();
}
