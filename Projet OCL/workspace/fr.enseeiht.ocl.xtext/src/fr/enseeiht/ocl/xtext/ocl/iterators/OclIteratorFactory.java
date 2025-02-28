package fr.enseeiht.ocl.xtext.ocl.iterators;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.ocl.iterators.impl.OclIteratorSelectSet;


public class OclIteratorFactory {
	public static List<OclIterator> getOperations(String name) {
		return switch (name) {
		// 1 implementation for all collection types
		case "any" -> null; // TODO
		case "closure" -> null; // TODO
		case "exists" -> null; // TODO
		case "forAll" -> null; // TODO
		case "isUnique" -> null; // TODO
		case "one" -> null; // TODO
		case "collect" -> null; // TODO

		// 1 implementation for each collection type
		case "select" -> Arrays.asList(new OclIteratorSelectSet());
		case "reject" -> null; // TODO
		case "collectNested" -> null; // TODO
		case "sortedBy" -> null; // TODO
		
		// Default
		default ->	null;
		};
	}
}
