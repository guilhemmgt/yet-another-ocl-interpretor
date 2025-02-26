package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclInteger extends OclReal {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à OclAny, au Real et à lui-même
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean realType = oclType instanceof OclReal;
		return anyType || realType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclInteger s'unifie en Real avec Real,
		// en OclInteger avec lui-même,
		// en OclAny avec tous les autres types.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclReal) {
			return oclType;
		}
		else {
			return new OclAny();
		}
	}

	
	@Override
	public String toString() {
		return "Integer";
	}
	

}
