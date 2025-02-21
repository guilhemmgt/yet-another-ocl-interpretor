package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclBoolean extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à OclAny et lui-même
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean boolType = oclType.getClass().equals(OclBoolean.class);
		return anyType || boolType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclBoolean s'unifie en OclBoolean avec lui-même, en OclAny avec tous les autres types.
		if (oclType instanceof OclBoolean) {
			return new OclBoolean();
		}
		else {
			return new OclAny();
		}
		
	}


}
