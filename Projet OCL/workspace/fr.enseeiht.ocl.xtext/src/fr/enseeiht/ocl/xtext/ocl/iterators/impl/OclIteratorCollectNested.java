package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIterateBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterate;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.utils.ConstructorInstanciator;

public class OclIteratorCollectNested implements OclIterator {

	@Override
	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->collectNested(iterator | body) =
		// 		source->iterate(iterator; result : <src_type>(T) = <src_type>{} |
		//			result->append(body) )
		// où <src_type> = Sequence | Bag | Set | OrderedSet selon le type de 'source'
		
		// body de 'iterate':
		// 		result->append(body)
		@SuppressWarnings("unchecked")
		IOclIterateBody newOp = (r, b, i) -> {
			((Collection<Object>)r).add(op.apply(b, i));
			return r;
		};

		// init du result de 'iterate':
		//		result : <src_type>(T) = <src_type>{}
		// On construit une nouvelle collection (vide) du même type que la source
		Object resultInitValue = null;
		try {
			resultInitValue = ConstructorInstanciator.instantiateParameterlessConstructor(source.getClass());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		// ->iterate
		Object value = new OclIterate(source, iteratorExp.getBody(), iteratorExp.getIterators(), contextTarget, resultInitValue, newOp).getReturnValue();

		return value;
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
		return "collectNested";
	}
}
