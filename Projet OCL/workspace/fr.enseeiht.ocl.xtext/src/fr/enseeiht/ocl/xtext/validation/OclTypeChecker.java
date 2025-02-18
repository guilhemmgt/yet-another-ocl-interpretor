package fr.enseeiht.ocl.xtext.validation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.types.*;

public class OclTypeChecker {
	
	private List<OclInvalid> invalidList;
	private List<EPackage> packList;
	
	public OcltypeChecker() {
		this.invalidList = new LinkedList<OclInvalid>();
		this.packList = new LinkedList<EPackage>();
	}
 	
	public List<OclInvalid> getAllTypes(Module mocl) {
		for (int i = 0 ; mocl.getImports().get(i) != null ; i++) {
			packList.add(mocl.getImports().get(i).getPackage());
		}
		
	}


}
