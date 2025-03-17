package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.collections.bag.HashBag;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorCollectNested implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "The Bag of elements which results from applying body to every member of the source collection. The collection specific
		// details are described as part of the corresponding collection type"
		// from https://www.omg.org/spec/OCL/2.4/PDF
		
		HashBag bodies = new HashBag();
		
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			bodies.add(pair.getValue());
		}
		
		return bodies;
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		if (sourceType instanceof OclCollection collectType) {
			try {
				return collectType.getClass().getConstructor(OclType.class).newInstance(bodyType);
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
		return "collectNested";
	}
}
