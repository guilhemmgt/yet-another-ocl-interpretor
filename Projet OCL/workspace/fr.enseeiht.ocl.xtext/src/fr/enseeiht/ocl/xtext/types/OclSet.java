package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclSet extends OclCollection {
	
	public OclSet(OclType subtype) {
		super(subtype);
	}
	
	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à un autre Set est conditionnée : 
		//		il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre collection.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean collectionType = false;
		if (oclType.getClass().equals(OclCollection.class) || oclType.getClass().equals(OclSet.class)) {
			if (subtype == null) {
				return true;
			}
			// Vérification de la conformance des types des éléments
			OclCollection oclCollectionType = (OclCollection) oclType; 
			collectionType = subtype.conformsTo(oclCollectionType.subtype);
		}
		return anyType || collectionType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclVoid || oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclSet) {
			if (subtype == null) {
				// Set vide
				return oclType;
			}
			return new OclSet(((OclCollection) oclType).subtype.unifyWith(subtype));
		}
		else {
			return super.unifyWith(oclType);
		}
	}
	

	
	@Override
	public String toString() {
		if (subtype == null) {
			return "Set()";
		}
		return "Set("+subtype.toString() + ")";
	}


}
