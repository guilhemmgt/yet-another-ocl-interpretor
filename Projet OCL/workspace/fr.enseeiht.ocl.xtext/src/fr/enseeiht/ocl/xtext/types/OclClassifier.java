package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclClassifier extends OclAny {

	protected OclType representedType;
	
	public OclClassifier(OclType type) {
		representedType = type;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre collection est conditionnée : 
		// Il y a conformance ssi le type représenté se conforme à celui de l'autre classifier.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean classifierType = false;
		if (oclType.getClass().equals(OclClassifier.class)) {
			// Vérification de la conformance des types des éléments
			OclClassifier oclCollectionType = (OclClassifier) oclType; 
			classifierType = representedType.conformsTo(oclCollectionType.representedType);
		}
		return anyType || classifierType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclClassifier) {
			return new OclClassifier(((OclClassifier) oclType).representedType.unifyWith(representedType));
		}
		else {
			return new OclAny();
		}
	}
	
	@Override
	public String toString() {
		return "OclClassifier<"+representedType+">";
	}

	
}
