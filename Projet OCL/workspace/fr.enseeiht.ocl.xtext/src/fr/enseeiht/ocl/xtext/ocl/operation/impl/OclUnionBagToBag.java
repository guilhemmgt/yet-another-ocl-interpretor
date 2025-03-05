package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBag;

public class OclUnionBagToBag extends OclUnion {

	@Override
	public List<OclType> getArgsType() {
		return Arrays.asList(new OclBag(new OclAny()));
	}

	@Override
	public OclType getSourceType() {
		// TODO Auto-generated method stub
		return new OclBag(new OclAny());
	}

}
