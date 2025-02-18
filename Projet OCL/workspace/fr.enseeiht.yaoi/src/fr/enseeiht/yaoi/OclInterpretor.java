package fr.enseeiht.yaoi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;

public class OclInterpretor {

	public static ValidationResult validate (Resource xmi, Module mocl) {
		OCLValidationAdapterFactory factory = new OCLValidationAdapterFactory();
		ValidationResult result = new ValidationResult();

		// Récupère le contenu du XMI
		TreeIterator<EObject> xmiTree = xmi.getAllContents();
		List<EObject> xmiContent = new ArrayList<EObject>();
		while (xmiTree.hasNext()) {
			xmiContent.add(xmiTree.next());
		}
		
		// Boucle sur les Contextes OCL
		for (OclContextBlock context : mocl.getContextBlocks()) { 
			// Boucle sur les Invariants OCL
			for (Object contextMember : context.getMembers()) { 
				if (contextMember instanceof OclInvariant) { 
					OclInvariant invariant = (OclInvariant)contextMember;
					// Boucle sur les objets du XMI concernés par le Contexte
					for (EObject xmiObject : xmiContent) {
						if (xmiObject.getClass().isInstance(context.getClass_().getClass())) {
							// Récupère la valeur de l'invariant (= validation) et renvoie une erreur s'il est violé
							Boolean invResult = (Boolean) factory.createAdapter(invariant).getValue(xmiObject);
							if (!invResult) {
								result.addError(new ValidationError (invariant, xmiObject));
							}
						}
					}
				}
			}
		}
		
		return result;
	}
}
