package fr.enseeiht.ocl.xtext.types;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.validation.TypeCheckingError;

public class OclInvalid extends OclAny {
	
	public List<TypeCheckingError> origins; 

	/** Génère la classe OclInvalid en ajoutant toutes les causes d'échec des éléments qui ont causé sa génération.
	 * Par exemple, "1+(void*3)" résulte en deux éléments de type Integer et Invalid.
	 * Alors le constructeur OclInvalid(elt1, elt2) va ajouter les causes d'échec d'elt2.
	 * @param others : les types des autres éléments impliqués dans la levée d'erreur
	 */
	public OclInvalid(OclType ... others) {
		this.origins = new LinkedList<TypeCheckingError>();
		
		for (OclType other : others) {
			if (other instanceof OclInvalid) {
				// Si un des éléments est du type Invalid, on ajoute ses origines à la liste.
				OclInvalid otherInvalid = (OclInvalid) other;
				this.origins.addAll(otherInvalid.origins);	
			}
		}
			
	}
	
	/** Génère la classe OclInvalid en ajoutant toutes les causes d'échec des éléments qui ont causé sa génération, ainsi que l'EObject qui a soulevé l'erreur si aucun des autre élément est invalide.
	 * Par exemple, "1+(void*3)" résulte en deux éléments de type Integer et Invalid. Alors le constructeur OclInvalid(elt1, elt2) va ajouter les causes d'échec d'elt2 mais pas l'addition.
	 * "1+void" n'aura pour seule origine que l'addition.
	 * @param cause : l'EObject qui a soulevé l'Invalidité.
	 * @param others : les types des autres éléments impliqués dans la levée d'erreur
	 */
	public OclInvalid(TypeCheckingError error, OclType ... others) {
		this.origins = new LinkedList<TypeCheckingError>();
		
		boolean addCause = true; // Détermine si on ajoute l'EObject courant.
		for (OclType other : others) {
			if (other instanceof OclInvalid) {
				// Si un des éléments est du type Invalid, on ajoute ses origines à la liste.
				OclInvalid otherInvalid = (OclInvalid) other;
				this.origins.addAll(otherInvalid.origins);	
				// On n'ajoute pas l'EObject qui les a récupéré.
				addCause = false;
			}
		}
		if (addCause) {
			// Dans ce cas la liste des origines est vide.
			this.origins.add(error);
		}
	}
	
	@Override
	public boolean conformsTo(OclType oclType) {
		// conformance à tout
		return true;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// OclInvalid s'unifie en OclInvalid avec tous les types
		return new OclInvalid(this, oclType);
	}
	

	
	@Override
	public String toString() {
		return "OclInvalid";
	}
	
}
