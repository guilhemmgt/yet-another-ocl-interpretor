package fr.enseeiht.ocl.xtext.ocl.operation.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.enseeiht.ocl.xtext.OclType;
import fr.enseeiht.ocl.xtext.ocl.operation.IOclOperation;
import fr.enseeiht.ocl.xtext.types.OclClassifier;
import fr.enseeiht.ocl.xtext.types.OclCollection;
import fr.enseeiht.ocl.xtext.types.OclEClass;

public class OclAllInstances implements IOclOperation {

	@Override
	public Object getReturnValue(Object source, List<Object> args, EObject contextTarget) {
		int targetClassID = ((EClass) source).getClassifierID();

		// Gather all object contained in the resource
		Resource  root = contextTarget.eResource();	
		TreeIterator<EObject> xmiTree = root.getAllContents();
		List<EObject> eObjects = new ArrayList<EObject>();
		while (xmiTree.hasNext()) {
			eObjects.add(xmiTree.next());
		}
		
		// Get all object that implements targetType
		List<EObject> instances = new ArrayList<EObject>();
		
		for (EObject eObj : eObjects) {
			int objID = eObj.eClass().getClassifierID();
			// Checks if eObj's Eclass is a subClass of target 
			boolean isSubType = eObj.eClass().getEAllSuperTypes().stream().map(c -> c.getClassifierID()).anyMatch(id -> id.equals(targetClassID));
			if (targetClassID == objID || isSubType) {
				instances.add(eObj);
			} 
		}
		return instances;
	}

	@Override
	public OclType getReturnType(OclType sourceType, List<OclType> argsType) {
		if (sourceType instanceof OclClassifier classifierType) {
			if (classifierType.getRepresentedType() instanceof OclEClass eClassType) {
				new OclCollection(eClassType);
			}
		}
		return new OclCollection(null);
	}

	@Override
	public List<OclType> getArgsType(OclType sourceType, List<OclType> argsType) {
		return new ArrayList<OclType>();
	}

	@Override
	public int getArgsAmount() {
		return 0;
	}

	@Override
	public OclType getSourceType() {
		return new OclClassifier(new OclEClass(null));
	}

	@Override
	public String getName() {
		return "allInstances";
	}

}
