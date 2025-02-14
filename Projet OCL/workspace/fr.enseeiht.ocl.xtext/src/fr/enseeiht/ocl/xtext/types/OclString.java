package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclString extends OclAny {

	@Override
	public boolean conformsTo(OclType oclType) {
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean StringType = oclType.getClass().equals(OclString.class);
		return anyType || StringType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
