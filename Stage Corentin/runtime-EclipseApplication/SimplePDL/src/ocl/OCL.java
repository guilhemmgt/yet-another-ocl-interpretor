
package ocl;

import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import oclCollections.OCLSequence;
import oclCollections.OCLBag;
import oclCollections.OCLSet;
import oclCollections.OCLOrderedSet;
import simplepdl.*;

public class OCL {

	private ValidationResult result;
	private OCLOperations oclOperation = new OCLOperations();
	private OCLClassicOperations oclClassicOperation = new OCLClassicOperations();


	public OCL(ValidationResult result, ArrayList<EObject> allObjects) {
		this.result = result;
		oclOperation.setAllObjects(allObjects);
	}

	public void check(EObject object) {}
	public void check(simplepdl.WorkDefinition object) {

		








		
		this.result.recordIfFailed(
		oclOperation.matches(object.getName(), "[A-Za-z][A-Za-z0-9]+")
		, object, "validName");







		
	}
	public void check(simplepdl.ProcessElement object) {

		



		












		
	}
	public void check(simplepdl.ResourceNeeded object) {

		













		
		this.result.recordIfFailed(
		oclClassicOperation.operationGreater(oclClassicOperation.operationMinus(oclClassicOperation.operationAdd(oclClassicOperation.operationAdd(oclClassicOperation.operationAdd(object.getQuantity(), 1), 1), 1), 1), 0)
		, object, "NombreDeRessourceDemandeeNonValide");


		
	}
	public void check(simplepdl.Process object) {

		OCLOrderedSet<String> workDefinitionNames = oclOperation.asOrderedSet(OCLSequence.fromArrayList(OCLSequence.fromArrayList(object.getProcessElements()).select((p) -> oclOperation.oclIsTypeOf(p, simplepdl.WorkDefinition.class))).collect((p) -> oclOperation.oclAsType(p, simplepdl.WorkDefinition.class).getName()));
		





		
		this.result.recordIfFailed(
		oclClassicOperation.operationEquals(oclOperation.size(workDefinitionNames), oclOperation.size(OCLSequence.fromArrayList(object.getProcessElements()).select((pe) -> oclOperation.oclIsTypeOf(pe, simplepdl.WorkDefinition.class))))
		, object, "uniqueOrderedWorkDefinitionNames");



		
		this.result.recordIfFailed(
		oclOperation.matches(object.getName(), "[A-Za-z_][A-Za-z0-9_]+")
		, object, "validName");



		
		this.result.recordIfFailed(
		OCLSequence.fromArrayList(OCLSequence.fromArrayList(OCLSequence.fromArrayList(object.getProcessElements()).select((pe) -> oclClassicOperation.operationAnd(oclOperation.oclIsTypeOf(pe, simplepdl.WorkDefinition.class), oclOperation.oclIsTypeOf(pe, simplepdl.WorkDefinition.class)))).collect((pe) -> oclOperation.oclAsType(pe, simplepdl.WorkDefinition.class))).isUnique((e) -> e.getName())
		, object, "NomsWDIdentique");



		
		this.result.recordIfFailed(
		OCLSequence.fromArrayList(OCLSequence.fromArrayList(OCLSequence.fromArrayList(object.getProcessElements()).select((pe) -> oclOperation.oclIsTypeOf(pe, simplepdl.Resource.class))).collect((pe) -> oclOperation.oclAsType(pe, simplepdl.Resource.class))).isUnique((e) -> e.getName())
		, object, "NomsRessourcesIdentique");




		
	}
	public void check(simplepdl.Resource object) {

		










		
		this.result.recordIfFailed(
		oclOperation.matches(object.getName(), "[A-Za-z_][A-Za-z0-9_]+")
		, object, "RessourceNomValide");



		
		this.result.recordIfFailed(
		oclClassicOperation.operationGreater(object.getTotal(), 0)
		, object, "RessourceNonVide");



		
	}
	public void check(simplepdl.WorkSequence object) {

		simplepdl.WorkDefinition pred = object.getPredecessor();
		simplepdl.WorkDefinition succ = object.getSuccessor();
		




		
		this.result.recordIfFailed(
		oclClassicOperation.operationNotEquals(object.getPredecessor(), object.getSuccessor())
		, object, "Pasreflexive");



		
		this.result.recordIfFailed(
		oclClassicOperation.operationNotEquals(pred, succ)
		, object, "Pasreflexive3");









		
		this.result.recordIfFailed(
		oclClassicOperation.operationAnd(oclClassicOperation.operationEquals(process(object), process(object.getSuccessor())), oclClassicOperation.operationEquals(process(object), process(object.getPredecessor())))
		, object, "successorAndPredecessorInSameProcess");


		
		this.result.recordIfFailed(
		oclClassicOperation.operationEquals(object.getLinkType(), WorkSequenceType.START_TO_START)
		, object, "test");
		
	}
	
		public simplepdl.Process process(ProcessElement object) {return oclOperation.first(oclOperation.asSequence(OCLSequence.fromArrayList(oclOperation.allInstances(simplepdl.Process.class)).select((p) -> oclOperation.includes(p.getProcessElements(), object))));}
	

	public int zero() {
		return 0;
	}

}
