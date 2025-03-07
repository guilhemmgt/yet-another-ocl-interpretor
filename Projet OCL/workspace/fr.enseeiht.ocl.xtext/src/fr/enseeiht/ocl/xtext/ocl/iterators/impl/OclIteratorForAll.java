package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIterateBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterate;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;

public class OclIteratorForAll implements OclIterator {

	@Override
	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget,
			IOclIteratorBody op) {
		// source->forAll(iterators | body ) =
		// 		source->iterate(iterators; result : Boolean = true | result and body
		
		IOclIterateBody newOp = (r, b, i) -> {
			Object newB = op.apply(b, i);
			if (newB instanceof Invalid) // Propagation Invalid
				return newB;
			if (newB == null || r == null) // En OCL: null and <bool> = null
				return null;
			return (Boolean)r && (Boolean)newB;
		};
		
		return new OclIterate(source, iteratorExp.getBody(), iteratorExp.getIterators(), contextTarget, true, newOp).getReturnValue();
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
