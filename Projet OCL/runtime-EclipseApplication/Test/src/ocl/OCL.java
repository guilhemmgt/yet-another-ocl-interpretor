
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
import test.*;

public class OCL {

	private ValidationResult result;
	private OCLOperations oclOperation = new OCLOperations();
	private OCLClassicOperations oclClassicOperation = new OCLClassicOperations();


	public OCL(ValidationResult result, ArrayList<EObject> allObjects) {
		this.result = result;
		oclOperation.setAllObjects(allObjects);
	}

	public void check(EObject object) {}
	public void check(test.Employe object) {

		



		
		this.result.recordIfFailed(
		OCLSequence.fromArrayList(OCLSequence.fromArrayList(object.getManage()).closure((e) -> e.getManage())).isUnique((e) -> e.getNom())
		, object, "closure");

		
	}
	public void check(test.Entreprise object) {

		




		
		this.result.recordIfFailed(
		OCLSequence.fromArrayList(oclOperation.print(OCLSequence.fromArrayList(oclOperation.print(OCLSequence.fromArrayList(object.getEmploie()).iterate(Stream.of(  ).collect(Collectors.toCollection(OCLBag::new)), (a, acc) -> oclOperation.including(acc, a)))).collect((a) -> oclOperation.oclAsType(a, test.Employe.class)))).isUnique((e) -> e.getNom())
		, object, "iteratee");
		
	}
	
	

	public int zero() {
		return 0;
	}

}
