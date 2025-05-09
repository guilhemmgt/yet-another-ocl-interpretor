package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclAbs;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclAllInstances;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclAsSequence;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclBooleanToString;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclConcat;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclFirstSequence;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclFloor;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclIncludes;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclMatches;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclNumberToString;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclAsSet;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclAsType;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclIsKindOf;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclIsTypeOf;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclOclIsUndefined;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclRound;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclSize;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclSubString;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclToInteger;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclToReal;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclUnionBagToBag;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclUnionBagToSet;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclUnionSetToBag;
import fr.enseeiht.ocl.xtext.ocl.operation.impl.OclUnionSetToSet;

public enum OclOperationEnum {
	// EClass
	allInstances(Arrays.asList(new OclAllInstances())),
	
	// OclAny,Void,Invalid
	oclAsSet(Arrays.asList(new OclOclAsSet())),
	oclIsUndefined(Arrays.asList(new OclOclIsUndefined())),
	oclAsType(Arrays.asList(new OclOclAsType())),
	oclIsTypeOf(Arrays.asList(new OclOclIsTypeOf())),
	oclIsKindOf(Arrays.asList(new OclOclIsKindOf())),
	oclType(null),
	
	// ToString
	toString(Arrays.asList(new OclNumberToString(), new OclBooleanToString())),
	
	// Max Min
	max(null), //TODO : Reals, Integer, UnlimitedNatural, Collection
	min(null), //TODO : Reals, Integer, UnlimitedNatural, Collection
	
	// Reals
	abs(Arrays.asList(new OclAbs())),
	floor(Arrays.asList(new OclFloor())),
	round(Arrays.asList(new OclRound())),
			
	// String
	concat(Arrays.asList(new OclConcat())),
	substring(Arrays.asList(new OclSubString())),
	toInteger(Arrays.asList(new OclToInteger())), //TODO + UnlimitedNatural
	toReal(Arrays.asList(new OclToReal())), //TODO
	toBoolean(null), //TODO
	toUpperCase(null), //TODO
	toLowerCase(null), //TODO
	indexOf(null), //TODO + OrderedSet
	at(null), //TODO + OrderedSet
	equalsIsIgnoreCase(null), //TODO
	characters(null), //TODO 
	matches(Arrays.asList(new OclMatches())),
	
	// Collection
	size(Arrays.asList(new OclSize())),
	includes(Arrays.asList(new OclIncludes())),
	exludes(null), //TODO 
	includesAll(null), //TODO 
	exludesAll(null), //TODO 
	count(null), //TODO 
	isEmpty(null), //TODO 
	notEmpty(null), //TODO 
	sum(null), //TODO 
	product(null), //TODO 
	selectByKind(null), //TODO 
	selectByType(null), //TODO 
	asSet(null), //TODO 
	asOrderedSet(null), //TODO 
	asSequence(Arrays.asList(new OclAsSequence())),
	asBag(null), //TODO 
	flatten(null), //TODO 
			
	// Set + Bag
	union(Arrays.asList(new OclUnionBagToBag(), new OclUnionBagToSet(), new OclUnionSetToSet(), new OclUnionSetToBag())), //TODO 
	intersection(null), //TODO 
	including(null), //TODO 
	excluding(null), //TODO 
	symmetricDifference(null), //TODO 
			 
	// OrderedSet & Sequence
	append(null), //TODO 
	prepend(null), //TODO 
	insertAt(null), //TODO 
	subOrderedSet(null), //TODO 
	first(Arrays.asList(new OclFirstSequence())), //TODO OrderedSet
	last(null), //TODO 
	reverse(null); //TODO 

	private List<IOclOperation> opList;

	private OclOperationEnum(List<IOclOperation> opList) {
		this.opList = opList;
	}
	
	public List<IOclOperation> getOperations(){
		return this.opList;
	}
	
	public static List<IOclOperation> getOperations(String name) {
		return OclOperationEnum.valueOf(name).getOperations();
	}
	
}
