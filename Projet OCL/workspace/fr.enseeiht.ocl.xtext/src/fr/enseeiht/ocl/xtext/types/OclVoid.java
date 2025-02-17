package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclVoid extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean voidType = oclType.getClass().equals(OclVoid.class);
		return anyType || voidType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}

}
