package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.ParameterInvalid;
import fr.enseeiht.ocl.xtext.types.OclAny;
import fr.enseeiht.ocl.xtext.types.OclBag;

public class OclUnionBagToBag extends OclUnion {

	@SuppressWarnings("unchecked")
	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		if (source instanceof Collection collectionSource) {
			Object other = args.get(0);
			if (other instanceof Collection collectionOther) {
				Bag result = new HashBag(collectionOther);
				result.addAll(collectionSource);
				return result;
			} 
		}
		return new ParameterInvalid(args, getName() + "(" + this.getClass().getSimpleName() + ")", source);
	}
	
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
