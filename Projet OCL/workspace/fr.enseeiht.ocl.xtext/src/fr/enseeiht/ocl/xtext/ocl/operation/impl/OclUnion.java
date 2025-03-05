package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.List;
import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBag;

public abstract class OclUnion implements IOclOperation {

	
	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		if (argsType.get(0).conformsTo(new OclBag(new OclAny()))) {
			return argsType.get(0);
		}
		return sourceType;
	}

	@Override
	public int getArgsAmount() {
		return 1;
	}

	@Override
	public String getName() {
		return "union";
	}

}
