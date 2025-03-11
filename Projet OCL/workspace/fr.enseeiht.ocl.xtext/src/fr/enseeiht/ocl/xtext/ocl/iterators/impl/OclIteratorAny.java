package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.AnyInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;

public class OclIteratorAny implements OclIterator {

	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->any(iterator | body) =
		// 		source->select(iterator | body)->asSequence()->first()
		
		// ->select(iterator | body)
		Object selectValue = new OclIteratorSelect().getReturnValue(source, iteratorExp, contextTarget, op);
		if (selectValue instanceof Invalid)
			return selectValue;
		@SuppressWarnings("unchecked")
		Collection<Object> selectCollection = (Collection<Object>) selectValue;
		
		// ->asSequence()
		// opération OCL superflue en Java
		
		// ->first()
		if (selectCollection.isEmpty())
			return new AnyInvalid(iteratorExp);
		Object value = selectCollection.iterator().next();
		
		return value;
	}

	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		if (sourceType instanceof OclCollection collectType) {
			return collectType.getSubtype();
		} else {
			return new OclInvalid();
		}
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
