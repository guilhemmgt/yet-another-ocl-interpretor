package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclCollection extends OclAny {
	 
	protected OclType subtype;
	
	public OclType getSubtype() {
		return subtype;
	}

	public void setSubtype(OclType subtype) {
		this.subtype = subtype;
	}

	public OclCollection(OclType subtype) {
		this.subtype = subtype;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre collection est conditionnée : 
		// Il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre collection.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean collectionType = false;
		if (oclType.getClass().equals(OclCollection.class)) {
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
		// S'unifie avec une autre collection en une collection avec pour sous-type l'unification des sous-types.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclCollection collectType) {
			if (subtype == null) {
				// Collection vide
				return oclType;
			}
			if (collectType.subtype == null) {
				return subtype;
			}
			return new OclCollection(collectType.subtype.unifyWith(subtype));
		}
		else {
			return new OclAny();
		}
	}
	

	
	@Override
	public String toString() {
		if (subtype == null) {
			return "Collection()";
		}
		return "Collection(" + subtype.toString() + ")";
	}

}
