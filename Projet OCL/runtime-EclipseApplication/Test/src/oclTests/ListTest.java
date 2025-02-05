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
import oclCollections.OCLOrderedSet;
import oclCollections.OCLSequence;
import test.Employe;
import test.TestPackage;

public class ListTest {

	OCLSequence<Employe> pe;

	@Before
	public void init() {
		TestPackage packageInstance = TestPackage.eINSTANCE;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		URI modelURI = URI.createURI("Entreprise.xmi");

		Resource resource = resSet.getResource(modelURI, true);

		EList<EObject> r = resource.getContents();

		test.Entreprise p = (test.Entreprise) r.get(0);

		ArrayList<Employe> arrayPe = new ArrayList<>();

		arrayPe.addAll(p.getEmploie());

		this.pe = OCLSequence.fromArrayList(arrayPe);

	}

	@Test
	public void closure() {
		OCLSequence<Employe> correct = new OCLSequence<Employe>();

		OCLOrderedSet<Employe> test = OCLSequence.fromArrayList(this.pe.get(0).getManage()).closure((e) -> e.getManage());
		
		for(Employe e : test) {
			System.out.println(e.getNom());
		}
		
		assertTrue("selectWD", false);
	}
	
}
