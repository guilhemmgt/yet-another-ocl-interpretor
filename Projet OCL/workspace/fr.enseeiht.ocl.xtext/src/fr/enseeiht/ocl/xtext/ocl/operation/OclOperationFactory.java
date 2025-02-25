package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclAsSet;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclAsType;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclIsUndefined;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclSize;

public class OclOperationFactory {

	public static List<IOclOperation> getOperations(String name) {
		return switch (name) {
		// OclAny,Void,Invalid
		case "oclAsSet" -> Arrays.asList(new OclOclAsSet());
		case "oclIsUndefined" -> Arrays.asList(new OclOclIsUndefined());
		case "oclAsType" -> Arrays.asList(new OclOclAsType());
		case "oclIsTypeOf" -> null;// TODO
		case "oclIsKindOf" -> null;// TODO
		case "oclType" -> null;// TODO
		
		// ToString
		case "toString" -> null; //TODO : Reals, Integer, Boolean, UnlimitedNatural
		
		// Max Min
		case "max" -> null; //TODO : Reals, Integer, UnlimitedNatural, Collection
		case "min" -> null; //TODO : Reals, Integer, UnlimitedNatural, Collection

		// Reals
		case "abs" -> null; // TODO : + Number
		case "floor" -> null; //TODO
		case "round" -> null; //TODO
		
		// String
		case "concat" -> null; //TODO
		case "substring" -> null; //TODO
		case "toInteger" -> null; //TODO + UnlimitedNatural
		case "toReal" -> null; //TODO
		case "toBoolean" -> null; //TODO
		case "toUpperCase" -> null; //TODO
		case "toLowerCase" -> null; //TODO
		case "indexOf" -> null; //TODO + OrderedSet
		case "at" -> null; //TODO + OrderedSet
		case "equalsIsIgnoreCase" -> null; //TODO
		case "characters" -> null; //TODO 
		
		// Collection
		case "size" -> Arrays.asList(new OclSize()); //TODO 
		case "includes" -> null; //TODO 
		case "exludes" -> null; //TODO 
		case "includesAll" -> null; //TODO 
		case "exludesAll" -> null; //TODO 
		case "count" -> null; //TODO 
		case "isEmpty" -> null; //TODO 
		case "notEmpty" -> null; //TODO 
		case "sum" -> null; //TODO 
		case "product" -> null; //TODO 
		case "selectByKind" -> null; //TODO 
		case "selectByType" -> null; //TODO 
		case "asSet" -> null; //TODO 
		case "asOrderedSet" -> null; //TODO 
		case "asSequence" -> null; //TODO 
		case "asBag" -> null; //TODO 
		case "flatten" -> null; //TODO 
		
		// Set + Bag
		case "union" -> null; //TODO 
		case "intersection" -> null; //TODO 
		case "including" -> null; //TODO 
		case "excluding" -> null; //TODO 
		case "symmetricDifference" -> null; //TODO 
		 
		// OrderedSet
		case "append" -> null; //TODO 
		case "prepend" -> null; //TODO 
		case "insertAt" -> null; //TODO 
		case "subOrderedSet" -> null; //TODO 
		case "first" -> null; //TODO 
		case "last" -> null; //TODO 
		case "reverse" -> null; //TODO 
		

		// Default
		default ->	null;
		};
//		switch (name) {
//		// OclAny
//		case "oclAsSet":
//			ret
//		case "size":
//			return new OclSize();
//		default:
//			return null;
//		}
	}
}
