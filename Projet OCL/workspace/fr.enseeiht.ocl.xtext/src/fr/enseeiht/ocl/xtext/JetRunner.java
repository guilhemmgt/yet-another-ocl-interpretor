package fr.enseeiht.ocl.xtext;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.jdom.JDOMFacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.jdom.JDOMJCompilationUnit;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import fr.enseeiht.ocl.xtext.ocl.adapter.templates.AdapterFactoryTemplate;
import fr.enseeiht.ocl.xtext.ocl.adapter.templates.AdapterTemplate;

public class JetRunner implements IWorkflowComponent {
	
	// WARNING : May implode over time
	// This allows JMerge to use the right source level when parsing
	class MyJDomFacadeHelper extends JDOMFacadeHelper {
		  @Override
		  public JCompilationUnit createCompilationUnit(String name,String contents) {
			@SuppressWarnings("deprecation")
		    JDOMJCompilationUnit compilationUnit = (JDOMJCompilationUnit)   convertToNode(getJDOMFactory().createCompilationUnit(contents, name));
					compilationUnit.setOriginalContent(contents);
		    return compilationUnit;
		  }
	}
	
	private JMerger jMerger;

	private List<String> ecoreClassesNames;

	public void setEcorePath(String path) {
		System.out.println("Récupération des classes du ECore...");

		// Récupère l'URI
		URI ecoreUri = URI.createFileURI(new File(path).getAbsolutePath());
		// Récupère la Resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource ecoreResource = resourceSet.getResource(ecoreUri, true);
		// Récupère le EPackage
		EPackage ecoreEPackage = (EPackage) ecoreResource.getContents().get(0);
		// Récupère les EObjects
		List<EObject> ecoreEObjects = ecoreEPackage.eContents();
		// Récupère les noms des classes des EObjects
		ecoreClassesNames = new ArrayList<String>();
		for (EObject eobj : ecoreEObjects) {
			ecoreClassesNames.add(((EClassImpl) eobj).getName());
		}

		System.out.println(
				"Récupération de " + ecoreClassesNames.size() + " classes depuis " + ecoreEPackage.getName() + " !");
	}

	@Override
	public void preInvoke() {
		System.out.println("Lancement de JetRunner ...");
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		// Configuration de JMerge
		{
			JControlModel jControlModel = new JControlModel();
			jControlModel.initialize(new MyJDomFacadeHelper(),
					"./templates/emf-merge.xml");
			jMerger = new JMerger(jControlModel);
		}

		// Génération des Adapters
		{
			System.out.println("Génération des Adapters ...");
			AdapterTemplate template = new AdapterTemplate();
			for (String className : ecoreClassesNames) {
				String generationResult = template.generate(className);
				File classFile = new File(
						"./jet-gen/fr/enseeiht/ocl/xtext/ocl/adapter/impl/" + className + "ValidationAdapter.java");
				generateClass(classFile, generationResult, true);
			}
		}

		// Génération de la AdapterFactory
		{
			System.out.println("Génération de la Factory ...");
			AdapterFactoryTemplate template = new AdapterFactoryTemplate();
			String generationResult = template.generate(ecoreClassesNames);
			File classFile = new File(
					"./jet-gen/fr/enseeiht/ocl/xtext/ocl/adapter/util/OCLValidationAdapterFactory.java");
			generateClass(classFile, generationResult, false);
		}
	}

	@Override
	public void postInvoke() {
	}

	private void generateClass(File classFile, String generationResult, Boolean merge) {
		// Récupère le contenu du fichier
		// (et créé les dossiers et le fichier si nécessaires)
		String classContent = "";
		try {
			classFile.getParentFile().mkdirs();
			classFile.createNewFile();
			classContent = Files.readString(classFile.toPath());
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		String newClassContent = generationResult;
		if (merge) {
			// Fusion avec JMerge:
			// écrase les classes et méthodes annotées avec "@generate"
			// conserve les classes et méthodes annotées avec "@generated not"
			jMerger.setTargetCompilationUnit(jMerger.createCompilationUnitForContents(classContent));
			jMerger.setSourceCompilationUnit(jMerger.createCompilationUnitForContents(generationResult));
			jMerger.merge();
			String mergeResult = jMerger.getTargetCompilationUnit().getContents().toString();
			newClassContent = mergeResult;
		}

		// Écrase le fichier avec le résult de la fusion
		try {
			FileWriter writer = new FileWriter(classFile);
			writer.write(newClassContent);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}
