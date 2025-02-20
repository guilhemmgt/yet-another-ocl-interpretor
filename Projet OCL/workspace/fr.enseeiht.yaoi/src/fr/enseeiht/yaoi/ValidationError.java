package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.ocl.OclInvariant;

public interface ValidationError {
	public OclInvariant getFailedInvariant();
	public EObject getTestedObject();
	
}
