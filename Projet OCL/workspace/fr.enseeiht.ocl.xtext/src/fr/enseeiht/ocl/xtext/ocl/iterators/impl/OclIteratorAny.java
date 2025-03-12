package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.AnyInvalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorAny implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "Returns any element in the source collection for which body evaluates to true. Returns invalid if any body evaluates to
		// invalid for any element, otherwise if there are one or more elements for which body is true, an indeterminate choice of one
		// of them is returned, otherwise the result is invalid."
		// from https://www.omg.org/spec/OCL/2.4/PDF

		Object any = null;
		boolean haveAny = false;
		
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			Object body = pair.getValue();
			if (body instanceof Invalid) {
				return body;
			} else if ((boolean)pair.getValue()) {
				any = pair.getKey().get(0);
				haveAny = true;
			}
		}

		if (haveAny)
			return any;
		else
			return new AnyInvalid(iteratorExp);
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		if (sourceType instanceof OclCollection collectType) {
			return collectType.getSubtype();
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
		return "any";
	}
}
