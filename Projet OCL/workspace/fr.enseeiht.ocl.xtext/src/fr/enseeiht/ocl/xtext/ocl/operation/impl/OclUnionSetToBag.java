package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclSet;

public class OclUnionSetToBag extends OclUnionBagToBag {

	@Override
	public OclType getSourceType() {
		return new OclSet(new OclAny());
	}
}
