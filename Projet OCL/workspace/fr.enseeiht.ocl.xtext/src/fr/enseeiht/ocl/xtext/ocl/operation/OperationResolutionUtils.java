package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;

public class OperationResolutionUtils {
	public static boolean isCorrectImplementation(OclType sourceType, OclType sourceTypeImpl, List<OclType> argsType, List<OclType> argsTypeImpl, String operationName, String OperationNameImpl) {
		// Vérification du nom et de la conformité du type de la source
		if (operationName.equals(OperationNameImpl) && sourceType.conformsTo(sourceTypeImpl)) {
			boolean isArgsOK = argsType.size() == argsTypeImpl.size();
			int i = 0;
			while (isArgsOK && i < argsType.size()) {
				argsType.get(i).conformsTo(argsTypeImpl.get(i));			
				i++;
			}
			return isArgsOK;
		}
		return false;		
	}
}
