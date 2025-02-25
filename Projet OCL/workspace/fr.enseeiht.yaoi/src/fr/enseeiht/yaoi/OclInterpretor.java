package fr.enseeiht.yaoi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.Invalid;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;

public class OclInterpretor {

	public static ValidationResult validate (Resource xmi, Module mocl) {
		ValidationResult result = new ValidationResult();

		// Récupère le contenu du XMI
		TreeIterator<EObject> xmiTree = xmi.getAllContents();
		List<EObject> xmiContent = new ArrayList<EObject>();
		while (xmiTree.hasNext()) {
			xmiContent.add(xmiTree.next());
		}
		
		// Boucle sur les objets du XMI concernés par le Contexte
		for (EObject xmiObject : xmiContent) {
			result.addErrors(validate(xmiObject, mocl).getErrors());
		}
		
		return result;
	}
	
	public static ValidationResult validate(EObject xmiObject, Module mocl) {
		ValidationResult result = new ValidationResult();
		
		// Boucle sur les Contextes OCL
		for (OclContextBlock context : mocl.getContextBlocks()) {
			// Boucle sur les Invariants OCL
			for (Object contextMember : context.getMembers()) {
				if (contextMember instanceof OclInvariant) {
					OclInvariant invariant = (OclInvariant) contextMember;
					if (isSubClassOrEqual(context.getClass_(), xmiObject.eClass())) {
						// Récupère la valeur de l'invariant (= validation) et renvoie une erreur s'il
						// est violé
						Object invResult = OCLValidationAdapterFactory.INSTANCE.createAdapter(invariant)
								.getValue(xmiObject);
						if (invResult instanceof Invalid) {
							result.addError(
									new ValidationUndefined(invariant, xmiObject, ((Invalid) invResult).getMessage()));
						} else if (invResult instanceof Boolean && !((Boolean) invResult)) {
							result.addError(new ValidationFailed(invariant, xmiObject));
						}
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Check if an EClass herits or is the same as an other one
	 * @param eClass
	 * @param object
	 * @return
	 */
	public static boolean isSubClassOrEqual(EClass parentEClass, EClass childEClass) {
		// Check if the two class have the same name or if the parent class is one of the superclass or child class
		return childEClass.getClassifierID() == parentEClass.getClassifierID()
				|| childEClass.getEAllSuperTypes().stream().map(c -> c.getClassifierID()).anyMatch(id -> id.equals(parentEClass.getClassifierID()));
	}
}
