package fr.enseeiht.ocl.testsLauncher.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;

import com.google.inject.Injector;

import fr.enseeiht.ocl.xtext.OclStandaloneSetup;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.OclContextBlock;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.yaoi.OclInterpretor;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;
import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileExtensionException;
import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileStructureException;
import fr.enseeiht.ocl.testsLauncher.exceptions.CheckTypeException;
import fr.enseeiht.ocl.testsLauncher.exceptions.LinkingException;
import fr.enseeiht.ocl.testsLauncher.exceptions.SyntaxException;

public class LauncherUtils {

	private static final boolean CHECK_TYPE = false;
	private static final boolean VALIDATE = true;
	
	private static Module moclObject;
	private static Injector injector;

	public static void main(String[] args) {
		try {
			Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
			//Map<String, Map<String, List<String>>> errorsMaps = run(workspacePath, "PetrinetTest", "petriNet.mocl", "PetriNet.ecore", "Net.xmi");
			Map<String, ValidationResult> errorsMaps = run(workspacePath, "TestsUnitaires", "tests/validation/v-falseInv.mocl", "Empty.ecore", "Liar.xmi");
			
			for (String model : errorsMaps.keySet()) {
				
				System.out.println("Résultat de validation pour " + model + ":");
				
				for (OclInvariant inv : getInvariants(workspacePath, "TestsUnitaires", "tests/validation/v-falseInv.mocl")) {
					
					List<ValidationError> errors = errorsMaps.get(model).getInvariantErrors(inv);
					System.out.print("- " + inv.getName() + ":");
					if (errors.isEmpty()) {
						System.out.println(" OK");
					} else {
						System.out.println(" " + errors.size() + " erreurs trouvées");
						for (ValidationError error : errors) {
							System.out.println("=> " + error);
						}
					}
					
				}
			}
			
		} catch (FileNotFoundException | BadFileExtensionException | BadFileStructureException | SyntaxException | CheckTypeException | LinkingException e) {
			e.printStackTrace();
		}
	}

	public static List<OclInvariant> getInvariants(Path workspacePath, String projectName, String moclName) {
		List<OclInvariant> invs = new ArrayList<OclInvariant>();
		for (OclContextBlock block : moclObject.getContextBlocks()) {
			for (Object member : block.getMembers()) {
				if (member instanceof OclInvariant) {
					invs.add((OclInvariant) member);
				}
			}
		}
		return invs;
	}

	public static Map<String, ValidationResult> run(Path workspacePath, String projectName, String moclName, String ecoreName, String... xmiNames) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException, CheckTypeException, LinkingException {

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
		Resource ecoreResource = getXMLResource(projectFolder, ecoreName, "ecore");
		
		//Add ecore to mocl to make the Eclass visible
		moclResource.getContents().add(EcoreUtil.copy(ecoreResource.getContents().get(0)));
		
		// Check syntax
		for (Diagnostic diagnostic : EcoreUtil.computeDiagnostic(moclResource, false).getChildren()) {
			if(diagnostic.getData().get(0) instanceof XtextSyntaxDiagnostic dia) {
				throw new SyntaxException(diagnostic.getMessage() + ". (ligne : " + dia.getLine() + "; colonne : " + dia.getColumn() + ")");
			}
		}
		
		//Get EObjects from ecore and mocl
		if(!(moclResource.getContents().get(0) instanceof Module))
			throw new BadFileStructureException(moclName, moclName.split("\\.")[moclName.split("\\.").length-1].equals("mocl")?null : "mocl");
        moclObject = (Module) moclResource.getContents().get(0);
        if(!(ecoreResource.getContents().get(0) instanceof EPackage))
			throw new BadFileStructureException(ecoreName, ecoreName.split("\\.")[ecoreName.split("\\.").length-1].equals("ecore")?null : "ecore");
        EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
        
        //Update the import of the mocl
        moclObject.getImports().get(0).setPackage(ecorePackage);
        EcoreUtil.resolveAll(moclObject);

        //Check linking
        for (Diagnostic diagnostic : EcoreUtil.computeDiagnostic(moclResource, false).getChildren()) {
        	if(diagnostic.getData().get(0) instanceof XtextLinkingDiagnostic dia) {
        		if(!dia.getUriToProblem().fragment().contains("@imports"))
        			throw new LinkingException(diagnostic.getMessage() + " (ligne : " + dia.getLine() + "; colonne : " + dia.getColumn() + ")");
        		moclResource.getErrors().remove(dia);
			}
		}
        
	    // Check type
        if(CHECK_TYPE) {
		    IResourceValidator validator = injector.getInstance(IResourceValidator.class);
		    List<Issue> issues = validator.validate(moclResource,
		            CheckMode.ALL, CancelIndicator.NullImpl);
		    for (Issue issue: issues) {
		    	if(issue.getCode().endsWith("CheckType") && (issue.getSeverity() == Severity.ERROR)) {
		    		throw new CheckTypeException(issue.getMessage() + ". (ligne : " + issue.getLineNumber() + "; colonne : " + issue.getColumn() + ")");
		    	}
				if(issue.getCode().endsWith("CheckType.Exception") && (issue.getSeverity() == Severity.WARNING)) {
					throw new RuntimeException(issue.getData()[0] + " : " + issue.getMessage());
				}
		    }
        }
		
        // Validation
    	Map<String, ValidationResult> xmiErrors = new HashMap<String, ValidationResult>();
        if(VALIDATE) {
            for (String xmiName: xmiNames) {
            	Resource xmiResource = getXMLResource(projectFolder, xmiName, "xmi");
    			xmiErrors.put(xmiName, OclInterpretor.validate(xmiResource, moclObject));
    		}
        } else {
        	for (String xmiName: xmiNames) {
        		xmiErrors.put(xmiName, new ValidationResult());
    		}
        }
        return xmiErrors;
	}
	
	private static Resource getXMLResource(File projectFolder, String xmlFileText, String extension) throws FileNotFoundException, BadFileExtensionException {
		File xmlFile = new File(projectFolder.getAbsolutePath() + "/" + xmlFileText);
		
		if(!xmlFile.exists())
			throw new FileNotFoundException("Le fichier " + xmlFileText + " n'existe pas.");
		
		if(!xmlFileText.split("\\.")[xmlFileText.split("\\.").length-1].equals(extension))
			throw new BadFileExtensionException(xmlFileText, extension);
		
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
		
		injector = new OclStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource moclResource = resourceSet.getResource(moclURI, true);
        EcoreUtil.resolveAll(moclResource);
        return moclResource;
	}

	public static void assertErrorsSize(String adapterName, List<ValidationError> errors, int nbErreurs) {
		String message =  "Noeud : " + adapterName + ".\n" 
						+ "Nombre d'erreur attendu : " + String.valueOf(nbErreurs) + ".\n"
						+ "Nombre d'erreur remontées : " + String.valueOf(errors.size()) + ".\n";
		if(!errors.isEmpty())
			message += "Liste des erreurs :\n";
		for (ValidationError error : errors) {
			message += error + "\n";
		}
		
		assertEquals(nbErreurs, errors.size(), message);
	}


}
