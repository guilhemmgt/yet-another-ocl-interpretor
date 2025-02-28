package fr.enseeiht.ocl.xtext.types;

import fr.enseeiht.ocl.xtext.OclType;

/**
 * This class has no OCL equivalent, this is only a programming artifice to help with OCL elements that represent
 * elements with two types (like map elements : "(Type, Type)".
 * DO NOT treat this as a regula
 */
public class OclTypePair implements OclType {
	
	private OclType left;
	private OclType right;

	public OclTypePair(OclType left, OclType right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean conformsTo(OclType oclType) {
		if (oclType instanceof OclTypePair) {
			OclTypePair oclPair = (OclTypePair) oclType;
			return left.conformsTo(oclPair.left) && right.conformsTo(oclPair.right);
		}
		else {
			return false;
		}
	}

	@Override
	public OclType unifyWith(OclType oclType) {
		if (oclType instanceof OclTypePair) {
			OclTypePair oclPair = (OclTypePair) oclType;
			return new OclTypePair(left.unifyWith(oclPair.left), right.unifyWith(oclPair.right));
		}
		else {
			return new OclInvalid();
		}
	}

	public OclType getLeft() {
		return left;
	}

	public void setLeft(OclType left) {
		this.left = left;
	}

	public OclType getRight() {
		return right;
	}

	public void setRight(OclType right) {
		this.right = right;
	}
	
	
	
}
