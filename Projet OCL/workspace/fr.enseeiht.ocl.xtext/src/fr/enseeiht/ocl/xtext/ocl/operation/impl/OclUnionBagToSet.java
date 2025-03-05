package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclSet;

public class OclUnionBagToSet extends OclUnionBagToBag {

	@Override
	public List<OclType> getArgsType() {
		return Arrays.asList(new OclSet(new OclAny()));
	}
}
