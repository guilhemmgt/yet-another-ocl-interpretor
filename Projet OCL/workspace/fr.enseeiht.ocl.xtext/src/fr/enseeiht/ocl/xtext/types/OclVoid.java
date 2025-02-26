package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclVoid extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à tout sauf OclInvalid
		boolean invalidType = oclType.getClass().equals(OclInvalid.class);
		return !invalidType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclVoid s'unifie en OclInvalid avec OclInvalid, en OclVoid sinon.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid){
			return new OclVoid();
		}
		else {
			return new OclAny();
		}
	}


	
	@Override
	public String toString() {
		return "OclVoid";
	}
}
