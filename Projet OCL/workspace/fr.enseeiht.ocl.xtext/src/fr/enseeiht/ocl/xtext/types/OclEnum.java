package fr.enseeiht.ocl.xtext.types;

import org.eclipse.emf.ecore.EEnum;

import fr.enseeiht.ocl.xtext.OclType;

public class OclEnum extends OclAny {
	
	protected EEnum enumLit;
	

	public OclEnum(EEnum type) {
		enumLit = type;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre collection est conditionnée : 
		// Il y a conformance ssi le type représenté se conforme à celui de l'autre classifier.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean enumLitType = false;
		if (oclType.getClass().equals(OclEnum.class)) {
			// Vérification de la conformance des types des éléments
			OclEnum oclEnum = (OclEnum) oclType; 
			enumLitType = oclEnum.enumLit.equals(this.enumLit);
		}
		return anyType || enumLitType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclEnum) {
			OclEnum oclEnum = (OclEnum) oclType; 
			if (oclEnum.enumLit.equals(this.enumLit)) {
				return this;
			}
			else {
				return new OclAny();
			}
		}
		else {
			return new OclAny();
		}
	}
	
	@Override
	public String toString() {
		return "OclClassifier("+enumLit+")";
	}

	public EEnum getenumLit() {
		return enumLit;
	}

	public void setenumLit(EEnum enumLit) {
		this.enumLit = enumLit;
	}

	
}
