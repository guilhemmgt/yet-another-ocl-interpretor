package fr.enseeiht.yaoi.ui.others;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

public class OclEValidator extends EObjectValidator {
    @Override
    public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
    	boolean valid = super.validate(eObject, diagnostics, context);
    	
    	System.out.println(eObject.eResource().getContents());

    	return valid;
    }
}
