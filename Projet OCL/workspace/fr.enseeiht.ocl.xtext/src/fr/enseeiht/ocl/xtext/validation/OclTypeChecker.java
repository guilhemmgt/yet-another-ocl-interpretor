package fr.enseeiht.ocl.xtext.validation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclFeatureDefinition;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.*;

public class OclTypeChecker {
	
	
	
	public OclTypeChecker() {
	}
 	
	/** Récupère le type de tous les invariants, des feature definitions et les vérifie.
	 * @param mocl : le Module qui applique tous les invariants et définit les features.
	 * @return Un OclInvalid avec la liste de toutes les erreurs à l'intérieur. Vide s'il n'y en a pas.
	 */
	public static OclInvalid getAllTypes(Module mocl) {
		List<OclInvalid> invalidList = new LinkedList<OclInvalid>();
		// La liste des invariants dans le fichier mocl.
		List<OclInvariant> invs = new ArrayList<OclInvariant>();
		//La liste des feature definitions dans le fichier mocl.
		List<OclFeatureDefinition> defs = new ArrayList<OclFeatureDefinition>();
		// Remplissage de la liste des invariants
		for (OclContextBlock contextBlock : mocl.getContextBlocks()) {
			for (EObject member : contextBlock.getMembers()) {
				if (member instanceof OclInvariant) {
					invs.add((OclInvariant) member);
				}
				else {
					defs.add((OclFeatureDefinition) member);
				}
			}
		}
		for (OclFeatureDefinition def : mocl.getContextlessFeatures()) {
			defs.add(def);
		}
		// Vérification des invariants à partir de leur liste.
		for (OclInvariant inv : invs) {
			OclType invType = OCLValidationAdapterFactory.INSTANCE.createAdapter(inv).getType();
			if (invType instanceof OclInvalid) {
				invalidList.add(new OclInvalid(invType));
			}
		}// Vérification des feature defs à partir de leur liste.
		for (OclFeatureDefinition def : defs) {
			OclType invType = OCLValidationAdapterFactory.INSTANCE.createAdapter(def).getType();
			if (invType instanceof OclInvalid) {
				invalidList.add(new OclInvalid(invType));
			}
		}
		return flattenInvalid(invalidList);
		
	}
	
	/** Regroupe le contenu des OclInvalids dans invalidList dans un seul OclInvalid.
	 * @return l'OclInvalid qui contient tous les messages d'erreur.
	 */
	public static OclInvalid flattenInvalid(List<OclInvalid> invalidList) {
		return new OclInvalid(invalidList.toArray(new OclInvalid[0]));
	}


}
