package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclInvalid extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à OclAny et lui-même
		boolean anyType = oclType.getClass().equals(OclAny.class); 
		boolean invalidType = oclType.getClass().equals(OclInvalid.class);
		return anyType || invalidType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclInvalid s'unifie en OclInvalid avec lui-même, en OclAny avec tous les autres types.
		if (oclType instanceof OclInvalid) {
			return new OclInvalid();
		}
		else {
			return new OclAny();
		}
	}
	


}
