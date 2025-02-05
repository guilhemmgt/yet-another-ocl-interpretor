import org.eclipse.emf.ecore.EObject;
import java.util.ArrayList;
import simplepdl.*;

public class OCL extends OCLFunctions{

	private ValidationResult result;

	public OCL(ValidationResult result, ArrayList<EObject> allObjects) {
		this.result = result;
		setAllObjects(allObjects);
	}

	public void check(EObject object) {}
	public void check(simplepdl.WorkSequence object) {

		



		
		this.result.recordIfFailed(
		operationNotEquals(object.getPredecessor(), object.getSuccessor())
		, object, "PasReflexive");


		
	}
	public void check(simplepdl.WorkDefinition object) {

		




		
		this.result.recordIfFailed(
		matches(object.getName(), "test", "[A-Za-z][A-Za-z0-9]+")
		, object, "ValidName");

		
	}
	public void check(simplepdl.Resource object) {

		





		
		this.result.recordIfFailed(
		object.getProcessElements()
		, object, "NomResourceIdentique");
		
	}
	
	

}
