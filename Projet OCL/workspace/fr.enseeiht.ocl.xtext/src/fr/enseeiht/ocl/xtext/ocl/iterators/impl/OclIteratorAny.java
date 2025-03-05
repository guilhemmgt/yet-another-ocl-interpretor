package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.adapter.AnyInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;

public class OclIteratorAny implements OclIterator {

	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->any(iterator | body) =
		// 		source->select(iterator | body)->asSequence()->first()
		
		Object selectValue = new OclIteratorSelect().getReturnValue(source, iteratorExp, contextTarget, op);
		if (selectValue instanceof Invalid)
			return selectValue;
		@SuppressWarnings("unchecked")
		Collection<Object> selectCollectionValue = (Collection<Object>) selectValue;
		if (selectCollectionValue.isEmpty())
			return new AnyInvalid(iteratorExp);
		return selectCollectionValue.iterator().next();
	}

	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		throw new UnimplementedException(this.getClass(), "getReturnType");
	}

	public OclCollection getSourceType() {
		return new OclCollection(new OclAny());
	}

	public OclType getBodyType() {
		return new OclBoolean();
	}

	public int getMinIteratorAmount() {
		return 0;
	}

	public int getMaxIteratorAmount() {
		return 1;
	}

	public String getName() {
		return "any";
	}
}
