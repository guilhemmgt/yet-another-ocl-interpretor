package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.List;

/**
 * Utilisée pour passer des lambda expressions en paramètre
 */
public interface IOclIteratorBody {
	public Object apply(Object body, List<Object> iterator);
}
