package fr.enseeiht.ocl.xtext.validation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OclExpressionValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.impl.OperatorCallExpValidationAdapter;
import fr.enseeiht.ocl.xtext.ocl.adapter.util.OCLValidationAdapterFactory;
import fr.enseeiht.ocl.xtext.types.*;

public class OclTypeChecker {
	
	private List<OclInvalid> invalidList;
	private List<EPackage> packList;
	
	public OclTypeChecker() {
		this.invalidList = new LinkedList<OclInvalid>();
		this.packList = new LinkedList<EPackage>();
	}
 	
	public OclInvalid getAllTypes(Module mocl) {
		EPackage pack = mocl.getImports().get(0).getPackage();
		List<OclInvariant> invs = new ArrayList<OclInvariant>();
		for (OclContextBlock contextBlock : mocl.getContextBlocks()) {
			if(contextBlock instanceof OclInvariant) {
				invs.add((OclInvariant) contextBlock);
			}
		}
		
		for (OclInvariant inv : invs) {
			OclExpressionValidationAdapter exp = (OclExpressionValidationAdapter) OCLValidationAdapterFactory.INSTANCE.createAdapter(inv.getBody());
			OclType type = exp.getType();
			boolean isCorrect = type.conformsTo(new OclBoolean());
			if (!isCorrect) {
				String message = "Invariant does not have the required type Boolean (it has the type " + type + " instead)";
				invalidList.add(new OclInvalid(inv, message));
			}
			
		}
		
		return this.flattenInvalid();
		
	}
	
	public OclInvalid flattenInvalid() {
		return new OclInvalid(invalidList.toArray(new OclInvalid[0]));
	}


}
