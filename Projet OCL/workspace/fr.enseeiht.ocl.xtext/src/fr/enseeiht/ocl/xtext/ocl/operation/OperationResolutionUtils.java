package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;

public class OperationResolutionUtils {
	public static boolean isCorrectImplementation(OclType sourceType, OclType sourceTypeImpl, List<OclType> argsType, List<OclType> argsTypeImpl, String operationName, String OperationNameImpl) {
		// Vérification du nom et de la conformité du type de la source
		if (sourceType == null || sourceTypeImpl == null) {
			if (!(sourceType == null && sourceTypeImpl == null)) return false;
		}
		if (operationName.equals(OperationNameImpl) && (sourceType == null && sourceTypeImpl == null || sourceTypeImpl.conformsTo(sourceType))) {
			boolean isArgsOK = argsType.size() == argsTypeImpl.size();
			int i = 0;
			while (isArgsOK && i < argsType.size()) {
				argsTypeImpl.get(i).conformsTo(argsType.get(i));			
				i++;
			}
			return isArgsOK;
		}
		return false;		
	}
}
