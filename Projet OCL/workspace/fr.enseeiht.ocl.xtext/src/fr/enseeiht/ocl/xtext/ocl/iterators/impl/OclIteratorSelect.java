package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.lang.reflect.Constructor;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Iterator;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIterateBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.IOclIteratorBody;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterate;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclSet;

public class OclIteratorSelect implements OclIterator {

	public Object getReturnValue(Collection<Object> source, OclExpression body, EList<Iterator> iterators, EObject contextTarget, IOclIteratorBody op) {
		// source->select(iterator | body) =
		// 		source->iterate(iterator; result : Set(T) = Set{} |
		//			if body then result->including(iterator)
		//			else result
		//			endif)
		
		// 'body' de 'iterate'
		@SuppressWarnings("unchecked")
		IOclIterateBody newOp = (r, b, i) -> {
			if ((Boolean)op.apply(b, i)) {
				((Collection<Object>)r).add(i.get(0));
				return r;
			} else {
				return r;
			}
		};

		// Récupère la valeur initiale du 'result' du 'iterate': une collection vide du type de 'source'
		Constructor<?> parameterlessConstructor = null;
		for (Constructor<?> c : source.getClass().getConstructors()) {
			if (c.getParameterCount() == 0) {
				parameterlessConstructor = c;
				break;
			}
		}
		Object resultInitValue = null;
		try {
			resultInitValue = parameterlessConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Calcule la valeur
		Object value = new OclIterate(source, body, iterators, contextTarget, resultInitValue, newOp).getReturnValue();
		return value;
	}

	public OclType getReturnType(OclType sourceType) {
		return new OclSet(sourceType);
	}

	public OclCollection getSourceType() {
		return new OclSet(new OclAny());
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
