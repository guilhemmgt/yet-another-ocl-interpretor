package fr.enseeiht.ocl.xtext.validation;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.OCLAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclExpressionValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OperatorCallExpValidationAdapter;
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
		List<EPackage> packList = new LinkedList<EPackage>();
		// Le EPackage importé le permier (TODO : en faire plusieurs)
		EPackage pack = mocl.getImports().get(0).getPackage();
		// La liiste des invariants dans le fichier mocl.
		List<OclInvariant> invs = new ArrayList<OclInvariant>();
		// Remplissage de la liste des invariants
		for (OclContextBlock contextBlock : mocl.getContextBlocks()) {
			for (EObject member : contextBlock.getMembers()) {
				if (member instanceof OclInvariant) {
					invs.add(((OclInvariant) member));
				}
			}
		}
		// Vérification des invariants à partir de leur liste.
		for (OclInvariant inv : invs) {
			// Récupération de l'expression dans l'invariant
			OCLAdapter exp = OCLValidationAdapterFactory.INSTANCE.createAdapter(inv.getBody());
			OclType type = exp.getType();
			System.out.println("Step");
			// L'expression dans l'invariant doit nécessairement avoir un type Boolean
			boolean isCorrect = type.conformsTo(new OclBoolean());
			boolean isInvalid = type.conformsTo(new OclInvalid());
			if (!isCorrect && !isInvalid) {
				String message = "Invariant does not have the required type Boolean (it has the type " + type + " instead)";
				invalidList.add(new OclInvalid(inv, message));
			}
			else if (isInvalid) {
				invalidList.add(new OclInvalid(type));
			}
			
		}
		System.out.println("invalidList :");
		System.out.println(flattenInvalid(invalidList));
		return flattenInvalid(invalidList);
		
	}
	
	/** Regroupe le contenu des OclInvalids dans invalidList dans un seul OclInvalid.
	 * @return l'OclInvalid qui contient tous les messages d'erreur.
	 */
	public static OclInvalid flattenInvalid(List<OclInvalid> invalidList) {
		return new OclInvalid(invalidList.toArray(new OclInvalid[0]));
	}


}
