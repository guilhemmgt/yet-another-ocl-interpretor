package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;
import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.ParameterInvalid;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBag;

public abstract class OclUnion implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args) {
		if (source instanceof Collection collectionSource) {
			Object other = args.get(0);
			if (other instanceof Bag collectionOther) {
				Bag result = new HashBag(collectionOther);
				result.addAll(collectionSource);
				return result;
			} else if (other instanceof Set otherSet) {
				Set result = new HashSet<Object>(otherSet);
				result.add(collectionSource);
			}
		}
		return new ParameterInvalid(args, getName(), source);
	}

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
