package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorOne implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "Results in invalid if there is any element in the source collection for which body is invalid,
		// otherwise true if there is exactly one element in the source collection for which body is true,
		// otherwise result is false."
		// from https://www.omg.org/spec/OCL/2.4/PDF

		boolean any = false;
		boolean many = false;
		
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			Object body = pair.getValue();
			if (body instanceof Invalid) {
				return body;
			} else if (body instanceof Boolean bodyBool && bodyBool) {
				if (any && !many)
					many = true;
				any = true;
			}
		}

		return any && !many;
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		return new OclBoolean();
	}

	@Override
	public OclType getExpectedBodyType() {
		return new OclBoolean();
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
		return "one";
	}
}
