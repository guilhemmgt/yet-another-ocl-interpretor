package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclAny implements OclType {

	@Override
	public boolean conformsTo(OclType oclType) {
		// OclAny ne se conforme qu'à lui-même
		return oclType.getClass().equals(OclAny.class);
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// Tout type unifié avec OclAny est un OclAny (OclAny est le type le plus grand) sauf oclVoid et OclInvalid.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		return new OclAny();
	}
	
	@Override
	public String toString() {
		return "OclAny";
	}


}
