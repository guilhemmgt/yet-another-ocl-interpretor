package fr.enseeiht.ocl.xtext.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorInstanciator {

	/**
	 * Renvoie une instance obtenue par l'appel d'un constructeur sans paramètre d'une classe donnée
	 * @param source classe à instancier
	 * @return instance, ou null si il n'existe pas de constructeur sans paramètre
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static Object instantiateParameterlessConstructor(Class<?> source) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// Récupère un constructeur sans paramètres
		Constructor<?> parameterlessConstructor = source.getConstructor();
		// Instancie
		Object instance = null;
		if (parameterlessConstructor != null)
			instance = parameterlessConstructor.newInstance();
		return instance;
	}
}
