package fr.enseeiht.ocl.xtext.types;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;

public class OclTuple extends OclAny {


	protected Map<String, OclType> subtypes;

	public OclTuple(Map<String, OclType> map) {
		this.subtypes = map;
	}
	
	public OclType getTypeOf(EObject target, String name) {
		OclType type = subtypes.get(name);
		if (type == null) {
			return new OclInvalid(target, "Tuple " + this + " has no attribute " + name);
		}
		else {
			return type;
		}
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// Conformance à OclAny
		// La conformance à une autre tuple est conditionnée : 
		// Il y a conformance ssi le type des éléments se conforme à celui des éléments de l'autre tuple.
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean subtypeConformance = false;
		if (oclType instanceof OclType) {
			// Vérification de la conformance des types des éléments
			OclTuple OclTupleType = (OclTuple) oclType; 
			if (!subtypes.keySet().equals(OclTupleType.subtypes.keySet())) {
				// Les ensembles de clé doivent être identiques.
				return false;
			}
			subtypeConformance = true;
			for (String key : subtypes.keySet()) {
				subtypeConformance = subtypeConformance && subtypes.get(key).conformsTo(OclTupleType.subtypes.get(key));
			}
			
		}
		return anyType || subtypeConformance;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// S'unifie avec une autre tuple en une tuple avec pour sous-type l'unification des sous-types.
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclTuple) {
			OclTuple OclTupleType = (OclTuple) oclType; 
			if (!subtypes.keySet().equals(OclTupleType.subtypes.keySet())) {
				// Les ensembles de clé doivent être identiques.
				return new OclAny();
			}
			Map<String, OclType> map = new HashMap<String, OclType>();
			for (String key : subtypes.keySet()) {
				// unification des sous-types.
				map.put(key, subtypes.get(key).unifyWith(OclTupleType.subtypes.get(key)));
			}
			return new OclTuple(map);
		}
		else {
			return new OclAny();
		}
	}
	
	@Override
	public String toString() {
		String str = "OclTuple(";
		if (subtypes.keySet().isEmpty()) {
			// Cas où il n'y a pas d'éléments.
			return str + ")";
		}
		List<String> elements = new LinkedList<String>();
		for (String key : subtypes.keySet()) {
			// Ajout des éléments de la forme "key:type"
			elements.add(key + ":"+ subtypes.get(key));
		}
		return str + String.join(", ", elements) + ")" ;
	}
	
}
