package fr.enseeiht.ocl.xtext.ocl.operation;

import java.util.List;

import fr.enseeiht.ocl.xtext.OclType;

public class OperationResolutionUtils {
	
	/**
	 * Check if an operationCall is a correct call of an operation
	 * @param sourceTypeCall     	Type of the object on which the operation is called
	 * @param sourceTypeImpl 	Expected type
	 * @param argsTypeCall			Type of the arguments of the call
	 * @param argsTypeImpl		Expected arguments type
	 * @param operationNameCall		Name of the operation in call
	 * @param OperationNameImpl	operation's name
	 * @return
	 */
	public static boolean isCorrectImplementation(OclType sourceTypeCall, OclType sourceTypeImpl, List<OclType> argsTypeCall, List<OclType> argsTypeImpl, String operationNameCall, String OperationNameImpl) {
		// Vérification du nom et de la conformité du type de la source
		if (sourceTypeCall == null || sourceTypeImpl == null) {
			if (!(sourceTypeCall == null && sourceTypeImpl == null)) return false;
		}
		if (operationNameCall.equals(OperationNameImpl) && (sourceTypeCall == null && sourceTypeImpl == null || sourceTypeCall.conformsTo(sourceTypeImpl))) {
			boolean isArgsOK = argsTypeCall.size() == argsTypeImpl.size();
			int i = 0;
			while (isArgsOK && i < argsTypeCall.size()) {
				argsTypeCall.get(i).conformsTo(argsTypeImpl.get(i));			
				i++;
			}
			return isArgsOK;
		}
		return false;		
	}
}
