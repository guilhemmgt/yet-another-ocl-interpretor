package fr.enseeiht.ocl.xtext.ocl.iterators;

import fr.enseeiht.ocl.xtext.ocl.iterators.impl.OclIteratorAny;
import fr.enseeiht.ocl.xtext.ocl.iterators.impl.OclIteratorCollectNested;
import fr.enseeiht.ocl.xtext.ocl.iterators.impl.OclIteratorSelect;

public class OclIteratorFactory {
	public static OclIterator getIterator(String name) {
		return switch (name) {
		case "any" -> new OclIteratorAny(); 
		case "closure" -> null; // TODO
		case "exists" -> null; // TODO
		case "forAll" -> null; // TODO
		case "isUnique" -> null; // TODO
		case "one" -> null; // TODO
		case "collect" -> null; // TODO

		case "select" -> new OclIteratorSelect();
		case "reject" -> null; // TODO
		case "collectNested" -> new OclIteratorCollectNested(); 
		case "sortedBy" -> null; // TODO

		// Default
		default -> null;
		};
	}
}
