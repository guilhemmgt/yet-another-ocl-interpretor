package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclCollection extends OclAny {
	 
	public OclAny subtype;
	
	public OclCollection(OclAny subtype) {
		this.subtype = subtype;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre collection est conditionnée : 
		//		il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre collection.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean collectionType = false;
		if (oclType.getClass().equals(OclCollection.class)) {
			// Vérification de la conformance des types des éléments
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
