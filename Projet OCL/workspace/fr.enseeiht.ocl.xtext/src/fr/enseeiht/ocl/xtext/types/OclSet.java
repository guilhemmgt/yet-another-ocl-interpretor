package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclSet extends OclCollection {
	
	public OclSet(OclAny subtype) {
		super(subtype);
	}
	
	@Override
	public boolean conformsTo(OclType oclType) {
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean collectionType = false;
		if (oclType.getClass().equals(OclCollection.class) || oclType.getClass().equals(OclSet.class)) {
			OclCollection oclCollectionType = (OclCollection) oclType; 
			collectionType = subtype.conformsTo(oclCollectionType.subtype);
		}
		return anyType || collectionType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// TODO Auto-generated method stub
		return null;
	}


}
