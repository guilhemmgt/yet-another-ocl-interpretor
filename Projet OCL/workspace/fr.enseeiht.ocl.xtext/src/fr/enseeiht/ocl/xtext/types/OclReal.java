package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclReal extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à OclAny et lui-même
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean realType = oclType.getClass().equals(OclReal.class);
		return anyType || realType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclReal s'unifie en OclReal avec lui-même, en OclAny avec tous les autres types.
		if (oclType instanceof OclReal) {
			return new OclReal();
		}
		else {
			return new OclAny();
		}
		
	}
	

	
	@Override
	public String toString() {
		return "Real";
	}

}
