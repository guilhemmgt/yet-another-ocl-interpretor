package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclOrderedSet extends OclCollection {
	
	public OclOrderedSet(OclType subtype) {
		super(subtype);
	}
	
	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à un autre OrderedSet est conditionnée : 
		//		il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre collection.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean collectionType = false;
		if (oclType.getClass().equals(OclCollection.class) || oclType.getClass().equals(OclOrderedSet.class)) {
			// Vérification de la conformance des types des éléments
			OclCollection oclCollectionType = (OclCollection) oclType; 
			collectionType = subtype.conformsTo(oclCollectionType.subtype);
		}
		return anyType || collectionType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclOrderedSet) {
			return new OclOrderedSet(((OclCollection) oclType).subtype.unifyWith(subtype));
		}
		else {
			return super.unifyWith(oclType);
		}
	}
	

	
	@Override
	public String toString() {
		return "OrderedSet<"+subtype.toString() + ">";
	}


}
