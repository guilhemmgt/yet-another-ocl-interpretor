package fr.enseeiht.yaoi;

import org.eclipse.emf.ecore.resource.Resource;

import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;

public class OclInterpretor {
	
	public ValidationResult validate (Resource xmi, Module mocl) {
		throw new UnimplementedException("validate not implemented");
	}
}
