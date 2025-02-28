package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclString extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à OclAny et lui-même
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean StringType = oclType.getClass().equals(OclString.class);
		return anyType || StringType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclString s'unifie en OclString avec lui-même, en OclAny avec tous les autres types.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclString) {
			return new OclString();
		}
		else {
			return new OclAny();
		}
	}

	
	@Override
	public String toString() {
		return "String";
	}

}
