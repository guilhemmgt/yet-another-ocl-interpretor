package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.List;

/**
 * Utilisée pour passer des lambda expressions en paramètre
 */
public interface IOclIterateBody {
	public Object apply(Object result, Object body, List<Object> iterator);
}
