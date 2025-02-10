package oclTests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import oclCollections.OCLOrderedCollection;
import oclCollections.OCLSequence;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

public class ListTest {

	OCLSequence<ProcessElement> pe;

	@Before
	public void init() {
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		URI modelURI = URI.createURI("Process.xmi");

		Resource resource = resSet.getResource(modelURI, true);

		EList<EObject> r = resource.getContents();

		simplepdl.Process p = (simplepdl.Process) r.get(0);

		ArrayList<ProcessElement> arrayPe = new ArrayList<>();

		arrayPe.addAll(p.getProcessElements());

		this.pe = OCLSequence.fromArrayList(arrayPe);

	}

	@Test
	public void selectWD() {
		OCLSequence<ProcessElement> correct = new OCLSequence<ProcessElement>();

		this.pe.forEach(e -> {
			if (e instanceof WorkDefinition) {
				correct.add(e);
			}
		});

		ArrayList<ProcessElement> test = this.pe.select((elmt) -> (elmt instanceof WorkDefinition));
		assertTrue("selectWD", correct.equals(test));
	}

	@Test
	public void selectPE() {
		OCLSequence<ProcessElement> correct = new OCLSequence<ProcessElement>();

		this.pe.forEach(e -> {
			if (e instanceof ProcessElement) {
				correct.add(e);
			}
		});

		ArrayList<ProcessElement> test = this.pe.select((elmt) -> (elmt instanceof ProcessElement));
		assertTrue("selectPE", correct.equals(test));
	}

	@Test
	public void selectWDCollectWDCollectLowerCaseName() {
		OCLSequence<String> correct = new OCLSequence<String>();

		this.pe.forEach(e -> {
			if (e instanceof WorkDefinition) {
				correct.add(((WorkDefinition) e).getName().toLowerCase());
			}
		});

		OCLSequence<ProcessElement> step1 = this.pe.select((elmt) -> (elmt instanceof WorkDefinition));
		OCLSequence<WorkDefinition> step2 = step1.collect((elmt) -> (WorkDefinition.class.cast(elmt)));
		OCLSequence<String> step3 = step2.collect(elmt -> (elmt.getName().toLowerCase()));

		assertTrue("selectWDCollectWDCollectLowerCaseName", correct.equals(step3));
	}

	@Test
	public void selectResourceCollectResourceSortedByTotal() {

		OCLSequence<Integer> correct = new OCLSequence<Integer>();

		this.pe.forEach(e -> {
			if (e instanceof simplepdl.Resource) {
				correct.add(((simplepdl.Resource) e).getTotal());
			}
		});
		
		Collections.sort(correct);
		
		OCLSequence<ProcessElement> step1 = this.pe.select((elmt) -> (elmt instanceof simplepdl.Resource));
		OCLSequence<simplepdl.Resource> step2 = step1.collect((elmt) -> (simplepdl.Resource.class.cast(elmt)));
		OCLSequence<simplepdl.Resource> step3 = step2.sortedBy(elmt -> (elmt.getTotal()));
		OCLSequence<Integer> step4 = step3.collect(elmt -> (elmt.getTotal()));
		
		assertTrue("selectResourceCollectResourceSortedByTotal", correct.equals(step4));
		
	}
	
	@Test
	public void selectResourceCollectResourceRejectGT15() {
		
		OCLSequence<simplepdl.Resource> correct = new OCLSequence<simplepdl.Resource>();

		this.pe.forEach(e -> {
			if (e instanceof simplepdl.Resource && !(((simplepdl.Resource) e).getTotal()>10)) {
				correct.add(((simplepdl.Resource) e));
			}
		});
		
		OCLSequence<ProcessElement> step1 = this.pe.select((elmt) -> (elmt instanceof simplepdl.Resource));
		OCLSequence<simplepdl.Resource> step2 = step1.collect((elmt) -> (simplepdl.Resource.class.cast(elmt)));
		OCLSequence<simplepdl.Resource> step3 = step2.reject(elmt -> elmt.getTotal()>15);
		
		System.out.println(step3);
		
		assertTrue("selectResourceCollectResourceRejectGT15", correct.equals(step3));

	}
	
	@Test
	public void selectWDAnyName() {
		
		OCLSequence<WorkDefinition> correct = new OCLSequence<WorkDefinition>();

		this.pe.forEach(e -> {
			if (e instanceof simplepdl.WorkDefinition && ((simplepdl.WorkDefinition) e).getName().equals("AA")) {
				correct.add(((simplepdl.WorkDefinition) e));
			}
		});
		
		OCLSequence<ProcessElement> step1 = this.pe.select((elmt) -> (elmt instanceof simplepdl.WorkDefinition));
		OCLSequence<WorkDefinition> step2 = step1.collect((elmt) -> (simplepdl.WorkDefinition.class.cast(elmt)));
		WorkDefinition step3 = step2.any((elmt) -> (elmt.getName().equals("AA")));
		
		assertTrue("selectResourceCollectResourceRejectGT15", step3.equals(correct.get(0)));

	}
	
}
