package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclBoolean;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclEClass;

public class OclOclIsKindOf implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		return ((EObject)source).eClass().getClassifierID() == ((EClass)args.get(0)).getClassifierID()
				|| ((EObject)source).eClass().getEAllSuperTypes().stream().map(c->c.getClassifierID()).anyMatch(id -> id ==((EClass)args.get(0)).getClassifierID());
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		return new OclBoolean();
	}

	@Override
	public List<OclType> getArgsType(OclType sourceType, List<OclType> argsType) {
		return Arrays.asList(new OclClassifier(new OclEClass(null)));
	}

	@Override
	public int getArgsAmount() {
		return 1;
	}

	@Override
	public OclType getSourceType() {
		return new OclEClass(null);
	}

	@Override
	public String getName() {
		return "oclIsKindOf";
	}

}
