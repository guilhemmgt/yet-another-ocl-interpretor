package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclReal extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean realType = oclType.getClass().equals(OclReal.class);
		return anyType || realType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}

}
