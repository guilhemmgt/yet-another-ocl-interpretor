package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclEClass implements OclType {
	// An OclEClass types an EClass, and opens access to its components(?)

	public OclEClass() {
		
	}
	
	@Override
	public boolean conformsTo(OclType oclType) {
		// An instance of OclEClass conforms to itself, OclAny, and its parent EClasses
		return true;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}

}
