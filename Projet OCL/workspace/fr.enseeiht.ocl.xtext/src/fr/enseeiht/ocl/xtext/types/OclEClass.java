package fr.enseeiht.ocl.xtext.types;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.adapter.UnimplementedException;
 

public class OclEClass implements OclType {
	// An OclEClass types an EClass, and opens access to its components(?)

	 
	public EClassifier classtype;
	
	public OclEClass(EClassifier classtype) {
		this.classtype = classtype;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// An instance of OclEClass conforms to itself, OclAny, and its parent EClasses
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean isSubEClass = false;
		if (oclType instanceof OclEClass) {
			OclEClass classType = (OclEClass) oclType;
			if (classtype instanceof EClass && classType.classtype instanceof EClass) {
				isSubEClass = ((EClass) classType.classtype).isSuperTypeOf(((EClass) classtype));
			} else if (classtype instanceof EClass || classType.classtype instanceof EClass){
				return false;
			} else {
				throw new UnimplementedException(getClass(), null);
			}
		}
		return anyType || isSubEClass;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclInvalid) {
			return oclType;
		}
		else if (oclType instanceof OclVoid) {
			return this;
		}
		else if (oclType instanceof OclEClass) {
			return findLowestSupertype((OclEClass) oclType);
 		}
		else {
			return new OclAny();
		}
	}
	
	private OclType findLowestSupertype(OclEClass eclass) {
		if (classtype instanceof EClass && eclass.classtype instanceof EClass) {
			for (EClass superType1: ((EClass) classtype).getESuperTypes()) {
				for (EClass superType2: ((EClass) eclass.classtype).getESuperTypes()) {
					if (superType1.equals(superType2)) {
						return new OclEClass(superType1);
					}
				}
			}
			return new OclAny();
		}
		else {
			return null;
		}
	}

}
