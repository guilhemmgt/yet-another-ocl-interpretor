package fr.enseeiht.ocl.xtext.ocl.iterators.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.IteratorExp;
import fr.enseeiht.ocl.xtext.ocl.adapter.SortedByInvalid;
import fr.enseeiht.ocl.xtext.ocl.iterators.OclIterator;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclInvalid;
import fr.enseeiht.ocl.xtext.types.OclReal;
import fr.enseeiht.ocl.xtext.utils.Pair;

public class OclIteratorSortedBy implements OclIterator {

	@Override
	public Object getReturnValue(List<Pair<List<Object>, Object>> iteratorBodyValues, IteratorExp iteratorExp, Class<?> sourceCollectionClass) {
		// "Results in the [ordered collection] containing all elements of the source collection.
		// The element for which body has the lowest value comes first, and so on."
		// from https://www.omg.org/spec/OCL/2.4/PDF

		List<Pair<Object, Comparable<Object>>> values = new ArrayList<>();
		
		// vérification que tous les objets sont comparables. normalement déjà vérifié par le typage.
		for (Pair<List<Object>, Object> pair : iteratorBodyValues) {
			Object body = pair.getValue();
			if (body instanceof Comparable<?>) {
				@SuppressWarnings("unchecked")
				Comparable<Object> comparableBody = (Comparable<Object>) body;
				values.add(new Pair<Object, Comparable<Object>>(pair.getKey().get(0), (Comparable<Object>) comparableBody));
			} else {
				return new SortedByInvalid(iteratorExp, body.getClass()); 
			}
		}

		Collections.sort(values, new Comparator<Pair<Object, Comparable<Object>>>() {
			@Override
			public int compare(Pair<Object, Comparable<Object>> o1, Pair<Object, Comparable<Object>> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		return values.stream().map(Pair::getKey).collect(Collectors.toList());
	}

	@Override
	public OclType getReturnType(OclType sourceType, OclType bodyType) {
		if (sourceType instanceof OclCollection collectType) {
			return collectType;
		} else {
			return new OclInvalid();
		}
	}

	@Override
	public OclType getExpectedBodyType() {
		// "The type of the body expression must have the < operation defined. The < operation must return a
		// Boolean value and must be transitive (i.e., if a < b and b < c then a < c)."
		// from https://www.omg.org/spec/OCL/2.4/PDF
		return new OclReal();
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
		return "sortedBy";
	}
}
