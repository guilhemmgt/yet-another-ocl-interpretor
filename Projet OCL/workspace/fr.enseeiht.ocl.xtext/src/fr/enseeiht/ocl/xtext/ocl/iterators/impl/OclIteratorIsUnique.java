package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorIsUnique implements OclIterator {

	@Override
	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget,
			IOclIteratorBody op) {
		// source->isUnique (iterator | body) =
		// 		source->collect (iterator | Tuple{iter = Tuple{iterator}, value = body})
		//			  ->forAll (x, y | (x.iter <> y.iter) implies (x.value <> y.value))
		
		// body de 'collect':
		// 		Tuple{iter = Tuple{iterator}, value = body}
		IOclIteratorBody collectOp = (b, i) -> {
			return new Pair<Object, Object>(i.get(0), op.apply(b, i));
		};
		
		// ->collect
		Object collectValue = new OclIteratorCollect().getReturnValue(source, iteratorExp, contextTarget, collectOp);
		if (collectValue instanceof Invalid)
			return collectValue;
		@SuppressWarnings("unchecked")
		Collection<Object> collectCollection = (Collection<Object>) collectValue;
		
		// body de 'forAll':
		// 		(x.iter <> y.iter) implies (x.value <> y.value)
		IOclIteratorBody forAllOp = (b, i) -> {
			return null;
			// TODO i am cooked
		};
		Object forAllValue = new OclIteratorForAll().getReturnValue(collectCollection, iteratorExp, contextTarget, forAllOp);
		if (forAllValue instanceof Invalid)
			return forAllValue;
		boolean forAllBoolean = (boolean) forAllValue;

		return forAllBoolean;
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
