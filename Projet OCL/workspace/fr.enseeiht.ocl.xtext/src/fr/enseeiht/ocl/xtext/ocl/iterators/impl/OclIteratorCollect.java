package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.CollectionFlattener;
import fr.enseeiht.ocl.xtext.utils.OclTypeUtils;

public class OclIteratorCollect implements OclIterator {

	@Override
	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->collect (iterator | body) =
		// 		source->collectNested (iterator | body)->flatten()
		
		// ->collectNested (iterator | body)
		Object collectNestedValue = new OclIteratorCollectNested().getReturnValue(source, iteratorExp, contextTarget, op);
		if (collectNestedValue instanceof Invalid)
			return collectNestedValue;
		Collection<?> collectNestedCollection = (Collection<?>) collectNestedValue;
		
		// ->flatten()
		Object value = null;
		try {
			value = CollectionFlattener.flatten(collectNestedCollection);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		if (sourceType instanceof OclCollection collectType) {
			try {			
				return collectType.getClass().getConstructor(OclType.class).newInstance(OclTypeUtils.getFlattenedType(bodyType));
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
				return new OclInvalid();
			}
		} else {
			return new OclInvalid();
		}
	}

	@Override
	public OclCollection getSourceType() {
		return new OclCollection(new OclAny());
	}

	@Override
	public OclType getBodyType() {
		return new OclAny();
	}

	@Override
	public int getMinIteratorAmount() {
		return 0;
	}

	@Override
	public int getMaxIteratorAmount() {
		return 1;
	}

	@Override
	public String getName() {
		return "collect";
	}
}
