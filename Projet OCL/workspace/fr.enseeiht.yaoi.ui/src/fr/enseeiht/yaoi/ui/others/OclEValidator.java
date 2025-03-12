package fr.enseeiht.yaoi.ui.others;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * Classe pouvant s'intégrer à la Validation des Ecore et des XMI fait par le plugin EMF
 * (Non implémentée et ne fonctionne pas)
 * <p>
 * Laissée ici à l'abandon si quelqu'un arrive à la faire fonctionner.
 * </p>
 * 
 */
public class OclEValidator extends EObjectValidator {
    @Override
    public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    	boolean valid = super.validate(eObject, diagnostics, context);
    	
    	System.out.println(eObject.eResource().getContents());

    	return valid;
    }
}
