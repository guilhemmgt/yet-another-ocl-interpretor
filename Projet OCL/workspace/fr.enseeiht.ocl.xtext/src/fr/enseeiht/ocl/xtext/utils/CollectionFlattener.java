package fr.enseeiht.ocl.xtext.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class CollectionFlattener {
	
	@SuppressWarnings("unchecked")
	public static <T, C extends Collection<T>> C flatten(Collection<?> collection) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		C output = null;
		output = (C) ConstructorInstanciator.instantiateParameterlessConstructor(collection.getClass());
		for (Object o : collection) {
			if (o instanceof Collection<?>) {
				output.addAll((Collection<? extends T>) flatten((Collection<?>) o)); // Appel récursif
			} else {
				output.add((T) o); // Ajout direct des éléments
			}
		}
		return output;
	}
}
