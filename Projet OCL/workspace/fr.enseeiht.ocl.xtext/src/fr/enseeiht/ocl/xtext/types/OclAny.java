package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclAny implements OclType {

	@Override
	public boolean conformsTo(OclType oclType) {
		return oclType.getClass().equals(OclAny.class);
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}


}
