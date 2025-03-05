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

	public Object getReturnValue(Collection<Object> source, IteratorExp iteratorExp, EObject contextTarget, IOclIteratorBody op) {
		// source->collectNested(iterator | body) =
		// 		source->iterate(iterator; result : Sequence(body.type) = Sequence{} |
		//			result->append(body ) )
		
		// 'body' de 'iterate'
		@SuppressWarnings("unchecked")
		IOclIterateBody newOp = (r, b, i) -> {
			((Collection<Object>)r).add(b);
			return r;
		};

		// Récupère la valeur initiale du 'result' du 'iterate': une collection vide du type de 'source'
		Object resultInitValue = null;
		try {
			resultInitValue = ConstructorInstanciator.instantiateParameterlessConstructor(source.getClass());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		// Calcule la valeur
		Object value = new OclIterate(source, iteratorExp.getBody(), iteratorExp.getIterators(), contextTarget, resultInitValue, newOp).getReturnValue();
		return value;
	}

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

	public OclCollection getSourceType() {
		return new OclCollection(new OclAny());
	}

	public OclType getBodyType() {
		return new OclAny();
	}

	public int getMinIteratorAmount() {
		return 0;
	}

	public int getMaxIteratorAmount() {
		return 1;
	}

	public String getName() {
		return "collectNested";
	}
}
