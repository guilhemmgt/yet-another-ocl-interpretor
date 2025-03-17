package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.ArrayList;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorIsUnique implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "Results in invalid if if body evaluates to invalid for any element in the source collection,
		// otherwise true if body evaluates to a different, possibly null, value for each element in the source collection;
		// otherwise result is false."
		// from https://www.omg.org/spec/OCL/2.4/PDF
		
		List<Object> bodiesValues = new ArrayList<>();
		boolean isUnique = true;
		
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			Object body = pair.getValue();
			if (body instanceof Invalid) {
				return body;
			} else if (bodiesValues.contains(body)) {
				isUnique = false;
			}
			bodiesValues.add(body);
		}

		return isUnique;
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		return new OclBoolean();
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
		return "isUnique";
	}

}
