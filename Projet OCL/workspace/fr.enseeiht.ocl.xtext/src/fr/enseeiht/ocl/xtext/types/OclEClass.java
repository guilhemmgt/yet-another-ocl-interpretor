package fr.enseeiht.ocl.xtext.types;

import org.eclipse.emf.ecore.EClass;

import fr.enseeiht.ocl.xtext.OclType;
 

public class OclEClass implements OclType {
	// An OclEClass types an EClass, and opens access to its components(?)

	 
	public EClass classtype;
	
	public OclEClass(EClass classtype) {
		this.classtype = classtype;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		// An instance of OclEClass conforms to itself, OclAny, and its parent EClasses
		boolean anyType = oclType.getClass().equals(OclAny.class);
		boolean isSubEClass = false;
		if (oclType instanceof OclEClass) {
			isSubEClass = ((OclEClass) oclType).classtype == null || ((OclEClass) oclType).classtype.isSuperTypeOf(classtype);
		}
		return anyType || isSubEClass;
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		// The unification of two OclEClasses is an OclEClass with the unification of both classtypes.
		// The rest is OclAny.
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
	
	@Override
	public String toString() {
		String result = "EClass(";
		if (this.classtype == null) {
			return result + ")";
		}
		else {
			return result + this.classtype.toString() + ")";
		}
	}
	
	private OclType findLowestSupertype(OclEClass eclass) {
		for (EClass superType1: classtype.getESuperTypes()) {
			for (EClass superType2: eclass.classtype.getESuperTypes()) {
				if (superType1.equals(superType2)) {
					return new OclEClass(superType1);
				}
			}
		}
		return new OclAny();
	}


}
