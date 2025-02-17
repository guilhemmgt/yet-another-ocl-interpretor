package fr.enseeiht.ocl.testsLauncher.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;

import com.google.inject.Injector;

import fr.enseeiht.ocl.xtext.OclStandaloneSetup;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.yaoi.OclInterpretor;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;
import fr.enseeiht.ocl.ECoreToJava.main.EcoreToJava;
import fr.enseeiht.ocl.OCLCollectionToJava.main.OclCollectionToJava;
import fr.enseeiht.ocl.OCLToJava.main.OclToJava;
import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileExtensionException;
import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileStructureException;
import fr.enseeiht.ocl.testsLauncher.exceptions.SyntaxException;


public class LauncherUtils {
	
	public static void main(String[] args) {
		try {
			Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
			//Map<String, Map<String, List<String>>> errorsMaps = run(workspacePath, "PetrinetTest", "petriNet.mocl", "PetriNet.ecore", "Net.xmi");
			Map<String, ValidationResult> errorsMaps = run(workspacePath, "TestsUnitaires", "tests/typeChecking/t-stringVsInt.mocl", "Empty.ecore", "");
			
			for (String model : errorsMaps.keySet()) {
				
				System.out.println("Résultat de validation pour " + model + ":");
				
				for (OclInvariant inv : getInvariants(workspacePath, "TestsUnitaires", "tests/typeChecking/t-stringVsInt.mocl")) {
					
					List<ValidationError> errors = errorsMaps.get(model).getInvariantError(inv);
					System.out.print("- " + inv.getName() + ":");
					if (errors.isEmpty()) {
						System.out.println(" OK");
					} else {
						System.out.println(" " + errors.size() + " erreurs trouvées");
						for (ValidationError error : errors) {
							System.out.println("=> " + error.getMessage());
						}
					}
					
				}
			}
			
		} catch (FileNotFoundException | BadFileExtensionException | BadFileStructureException | SyntaxException e) {
			e.printStackTrace();
		}
	}

	public static List<OclInvariant> getInvariants(Path workspacePath, String projectName, String moclName) {
		
		File projectFolder = new File(workspacePath.toFile().getAbsolutePath() + "/" + projectName);
		
		Resource moclResource = getMoclResource(projectFolder, moclName);
		
		Module moclObject = (Module) moclResource.getContents().get(0);
		
		for (OclContextBlock block : moclObject.getContextBlocks()) {
			  for (Object member : block.getMembers()) {
			    if (member instanceof OclInvariant) {
			      
			    }
			  }
			}
	}

	public static Map<String, ValidationResult> run(Path workspacePath, String projectName, String moclName, String ecoreName, String... xmiNames) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException {

        File projectFolder = new File(workspacePath.toFile().getAbsolutePath() + "/" + projectName);
		
		System.out.println("Exécution des tests dans le projet : " + projectFolder.getAbsolutePath());
		System.out.println(" -> Mocl utilisé : " + moclName);
		System.out.println(" -> Ecore utilisé : " + ecoreName);
		System.out.println(" -> Xmi utilisés : ");
		for (String xmiName: xmiNames) {
			System.out.println("     - " + xmiName);
		}
		
		//Get Resources
		Resource moclResource = getMoclResource(projectFolder, moclName);
		Resource ecoreResource = getXMLResource(projectFolder, ecoreName);
		
		//Add ecore to mocl to make the Eclass visible
		moclResource.getContents().add(EcoreUtil.copy(ecoreResource.getContents().get(0)));
		
		// Check syntax
		for (Diagnostic diagnostic : EcoreUtil.computeDiagnostic(moclResource, false).getChildren()) {
			if(diagnostic.getData().get(0) instanceof XtextSyntaxDiagnostic) {
				throw new SyntaxException(diagnostic.getMessage());
			}
		}
		
		//Get EObjects from ecore and mocl
		if(!(moclResource.getContents().get(0) instanceof Module))
			throw new BadFileStructureException(moclName, moclName.split("\\.")[moclName.split("\\.").length-1].equals("mocl")?null : "mocl");
        Module moclObject = (Module) moclResource.getContents().get(0);
        if(!(ecoreResource.getContents().get(0) instanceof EPackage))
			throw new BadFileStructureException(ecoreName, ecoreName.split("\\.")[ecoreName.split("\\.").length-1].equals("ecore")?null : "ecore");
        EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
        
        //Update the import of the mocl
        moclObject.getImports().get(0).setPackage(ecorePackage);
		
        Map<String, ValidationResult> xmiErrors = new HashMap<String, ValidationResult>();
        
        for (String xmiName: xmiNames) {
        	Resource xmiResource = getXMLResource(projectFolder, xmiName);
//        	ValidationResult result = OclInterpretor.validate(xmiResource, moclObject);
//        	Map<OclInvariant, ValidationError>
			xmiErrors.put(xmiName, OclInterpretor.validate(xmiResource, moclObject));
		}
        
        return xmiErrors;
		
	}
	
	private static Resource getXMLResource(File projectFolder, String xmlFileText) throws FileNotFoundException, BadFileExtensionException {
		File xmlFile = new File(projectFolder.getAbsolutePath() + "/" + xmlFileText);
		
		if(!xmlFile.exists())
			throw new FileNotFoundException("Le fichier " + xmlFileText + " n'existe pas.");
		
		if(!xmlFileText.split("\\.")[xmlFileText.split("\\.").length-1].equals("ecore"))
			throw new BadFileExtensionException(xmlFileText, "ecore");
		
		URI xmlURI = URI.createFileURI(xmlFile.getAbsolutePath());
		
		ResourceSet resourceSet = new ResourceSetImpl();
        return resourceSet.getResource(xmlURI, true);
	}
	
	private static Resource getMoclResource(File projectFolder, String moclFileText) throws BadFileExtensionException, FileNotFoundException {
		File moclFile = new File(projectFolder.getAbsolutePath() + "/" + moclFileText);
		
		if(!moclFile.exists())
			throw new FileNotFoundException("Le fichier " + moclFileText + " n'existe pas.");
		
		if(!moclFileText.split("\\.")[moclFileText.split("\\.").length-1].equals("mocl"))
			throw new BadFileExtensionException(moclFileText, "mocl");
		
		URI moclURI = URI.createFileURI(moclFile.getAbsolutePath());
		
		Injector injector = new OclStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource moclResource = resourceSet.getResource(moclURI, true);
        EcoreUtil.resolveAll(moclResource);
        return moclResource;
	}

}
