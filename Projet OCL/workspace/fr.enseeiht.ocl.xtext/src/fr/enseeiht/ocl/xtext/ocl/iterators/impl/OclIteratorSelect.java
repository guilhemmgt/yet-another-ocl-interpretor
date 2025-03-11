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
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.utils.ConstructorInstanciator;

public class OclIteratorSelect implements OclIterator {

	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->select(iterator | body) =
		// 		source->iterate(iterator; result : <src_type>(T) = <src_type>{} |
		//			if body then result->including(iterator)
		//			else result
		//			endif)
		// où <src_type> = Sequence | Bag | Set | OrderedSet selon le type de 'source'
		
		// body de 'iterate':
		//		if body then result->including(iterator) else result endif
		@SuppressWarnings("unchecked")
		IOclIterateBody newOp = (r, b, i) -> {
			if ((Boolean)op.apply(b, i)) {
				((Collection<Object>)r).add(i.get(0));
				return r;
			} else {
				return r;
			}
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

	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		return sourceType;
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
		return "select";
	}
}
