package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorForAll implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "Results in false if body evaluates to false for any element in the source collection;
		// otherwise invalid if body evaluates to invalid for any element in the source collection;
		// otherwise null if body evaluates to null for any element in the source collection;
		// otherwise result is true."
		// from https://www.omg.org/spec/OCL/2.4/PDF
		
		Invalid invalid = null;
		boolean isNull = false;
		
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			Object body = pair.getValue();
			if (body instanceof Invalid bodyInvalid) {
				if (invalid == null) {
					invalid = bodyInvalid;
				}
			} else if (body == null) {
				isNull = true;
			} else if (!(boolean)body) {
				return false;
			}
		}
		
		if (invalid != null)
			return invalid;
		if (isNull)
			return null;
		
		return true;
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		return new OclBoolean();
	}

	@Override
	public OclCollection getSourceType() {
		return new OclCollection(new OclAny());
	}

	@Override
	public OclType getBodyType() {
		return new OclBoolean();
	}

	@Override
	public int getMinIteratorAmount() {
		return 0;
	}

	@Override
	public int getMaxIteratorAmount() {
		return Integer.MAX_VALUE;
	}

	@Override
	public String getName() {
		return "forAll";
	}

}
