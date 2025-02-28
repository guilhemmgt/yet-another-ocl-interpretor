package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.types.OclCollection;

public abstract class OclIterator {

	public Object getReturnValue(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget) {
		return getReturnValue(source, body, iterators, contextTarget, (b, i) -> b);
	}
	
	public abstract Object getReturnValue(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget, IOclIteratorBody op);
	
	public abstract OclType getReturnType(OclType collectedType);
	
	public abstract OclCollection getSourceType();
	
	public abstract OclType getBodyType();
	
	public abstract int getMinIteratorAmount();
	
	public abstract int getMaxIteratorAmount();
	
	public abstract String getName();
}
