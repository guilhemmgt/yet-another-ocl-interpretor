package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

public class OclMap extends OclAny {

	protected OclType keyType;
	protected OclType valueType;
	
	public OclType getKeyType() {
		return keyType;
	}

	public void setKeyType(OclType keyType) {
		this.keyType = keyType;
	}

	public OclType getValueType() {
		return valueType;
	}

	public void setValueType(OclType valueType) {
		this.valueType = valueType;
	}

	public OclMap(OclType key, OclType value) {
		if (key == null || value == null) {
			// Normalement impossible, ajouté au cas où.
			this.keyType = null;
			this.valueType = null;
		}
		this.keyType = key;
		this.valueType = value;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre map est conditionnée : 
		// Il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre map.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean mapType = false;
		if (oclType.getClass().equals(OclMap.class)) {
			if (keyType == null || valueType == null) {
				return true;
			}
			// Vérification de la conformance des types des éléments
			OclMap OclMapType = (OclMap) oclType; 
			mapType = keyType.conformsTo(OclMapType.keyType) && valueType.conformsTo(OclMapType.valueType);
		}
		return anyType || mapType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// S'unifie avec une autre map en une map avec pour sous-type l'unification des sous-types.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclMap) {
			if (keyType == null || valueType == null) {
				// map vide
				return oclType;
			}
			OclMap map = (OclMap) oclType;
			return new OclMap(keyType.unifyWith(map), valueType.unifyWith(map.valueType));
		}
		else {
			return new OclAny();
		}
	}
	
	@Override
	public String toString() {
		if (keyType == null || valueType == null) {
			return "OclMap()";
		}
		return "OclMap(" + keyType.toString() + ", " + valueType.toString() +")";
	}
}
