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
	 */
	public static Object instantiateParameterlessConstructor (Class<?> source) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Récupère un constructeur sans paramètres
		Constructor<?> parameterlessConstructor = null;
		for (Constructor<?> c : source.getConstructors()) {
			if (c.getParameterCount() == 0) {
				parameterlessConstructor = c;
				break;
			}
		}
		// Instancie
		Object instance = null;
		if (parameterlessConstructor != null)
			instance = parameterlessConstructor.newInstance();
		return instance;
	}
}
