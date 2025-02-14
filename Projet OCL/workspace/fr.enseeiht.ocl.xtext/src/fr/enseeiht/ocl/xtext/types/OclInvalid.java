package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclInvalid extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean invalidType = oclType.getClass().equals(OclInvalid.class);
		return anyType || invalidType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
