package fr.enseeiht.ocl.xtext.utils;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.types.OclCollection;

public class OclTypeUtils {

	public static OclType getFlattenedType(OclType type) {
		if (type instanceof OclCollection collectType) {
			return getFlattenedType(collectType.getSubtype());
		}
		return type;
	}
}
