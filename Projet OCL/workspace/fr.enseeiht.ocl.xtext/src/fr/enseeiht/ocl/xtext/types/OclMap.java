package fr.enseeiht.ocl.xtext.types;

import java.util.Map;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.OclExpression;

public class OclMap extends OclAny {

	protected Map<OclType, OclType> subtypes;
	
	public Map<OclType, OclType> getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(Map<OclType, OclType> subtypes) {
		this.subtypes = subtypes;
	}

	public OclMap(Map<OclType, OclType> subtypes) {
		this.subtypes = subtypes;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre map est conditionnée : 
		// Il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre map.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean mapType = false;
		if (oclType.getClass().equals(OclMap.class)) {
			// Vérification de la conformance des types des éléments
			OclMap OclMapType = (OclMap) oclType; 
			for (OclType type : subtypes.keySet()) {
				if (OclMapType.subtypes.get(type).conformsTo(type)) {
					return true;
				}
			}
		}
		return anyType || mapType;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// S'unifie avec une autre map en une map avec pour sous-type l'unification des sous-types.
		if (oclType instanceof OclMap) {
			return new OclMap(((OclMap) oclType).subtype.unifyWith(subtype));
		}
		else {
			return new OclAny();
		}
	}
	

	
	@Override
	public String toString() {
		return "OclMap<" + subtype.toString() + ">";
	}
}
