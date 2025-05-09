
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
import petrinet.*;

public class OCL {

	private ValidationResult result;
	private OCLOperations oclOperation = new OCLOperations();
	private OCLClassicOperations oclClassicOperation = new OCLClassicOperations();


	public OCL(ValidationResult result, ArrayList<EObject> allObjects) {
		this.result = result;
		oclOperation.setAllObjects(allObjects);
	}

	public void check(EObject object) {}
	public void check(petrinet.Net object) {

		



		
		this.result.recordIfFailed(
		oclOperation.matches(object.getName(), "[A-Za-z_][A-Za-z0-9_]+")
		, object, "nomValide");
		
	}
	
	

	public int zero() {
		return 0;
	}

}
