package fr.enseeiht.ocl.testsLauncher;

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
			Map<String, Map<String, List<String>>> errorsMaps = run(workspacePath, "TestsUnitaires", "tests/typeChecking/t-stringVsInt.mocl", "Empty.ecore", "");
			
			for (String model : errorsMaps.keySet()) {
				
				System.out.println("Résultat de validation pour " + model + ":");
				
				for (String eClassifierName : errorsMaps.get(model).keySet()) {
					
					List<String> errors = errorsMaps.get(model).get(eClassifierName);
					System.out.print("- " + eClassifierName + ":");
					if (errors.isEmpty()) {
						System.out.println(" OK");
					} else {
						System.out.println(" " + errors.size() + " erreurs trouvées");
						for (String error : errors) {
							System.out.println("=> " + error);
						}
					}
				}
			}
			
		} catch (FileNotFoundException | BadFileExtensionException | BadFileStructureException | SyntaxException e) {
			e.printStackTrace();
		}
	}


	public static Map<String, Map<String, List<String>>> run(Path workspacePath, String projectName, String moclName, String ecoreName, String... xmiNames) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException {

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
		Resource ecoreResource = getEcoreResource(projectFolder, ecoreName);
		
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
		
		compile(projectFolder, ecorePackage, moclObject); //TODO : reamplacer avec l'interpreteur
		return verifiy(projectFolder, ecorePackage.getName(), xmiNames);
		
	}
	
	private static Resource getEcoreResource(File projectFolder, String ecoreFileText) throws FileNotFoundException, BadFileExtensionException {
		File ecoreFile = new File(projectFolder.getAbsolutePath() + "/" + ecoreFileText);
		
		if(!ecoreFile.exists())
			throw new FileNotFoundException("Le fichier " + ecoreFileText + " n'existe pas.");
		
		if(!ecoreFileText.split("\\.")[ecoreFileText.split("\\.").length-1].equals("ecore"))
			throw new BadFileExtensionException(ecoreFileText, "ecore");
		
		URI ecoreURI = URI.createFileURI(ecoreFile.getAbsolutePath());
		
		ResourceSet resourceSet = new ResourceSetImpl();
        return resourceSet.getResource(ecoreURI, true);
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
	
	private static void compile(File projectFolder, EPackage ecoreObject, Module moclObject) {

        File srcFolder = new File(projectFolder.getAbsolutePath() + "/src");
        
        File oclFolder = new File(srcFolder.getAbsolutePath() + "/ocl");
        File oclCollectionsFolder = new File(srcFolder.getAbsolutePath() + "/oclCollections");
        
        System.out.println("Compilation du mocl...");
        
		try {
			EcoreToJava gen0 = new EcoreToJava(ecoreObject, oclFolder, new ArrayList<String>());
			gen0.doGenerate(new BasicMonitor());
		
			EObject model = gen0.getModel();
			if (model != null) {
				
				OclCollectionToJava gen1 = new OclCollectionToJava(model, oclCollectionsFolder, new ArrayList<String>());
				gen1.doGenerate(new BasicMonitor());
			}
			
			OclToJava gen2 = new OclToJava(moclObject, oclFolder, new ArrayList<String>());
			gen2.doGenerate(new BasicMonitor());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static Map<String, Map<String, List<String>>> verifiy(File projectFolder, String ecoreName, String... xmiNames) {
		String capitalizedEcoreName = ecoreName.substring(0, 1).toUpperCase() + ecoreName.substring(1);
		String lowerCasedEcoreName = ecoreName.toLowerCase();
		

        File srcFolder = new File(projectFolder.getAbsolutePath() + "/src");
        File binFolder = new File(projectFolder.getAbsolutePath() + "/bin");
        binFolder.mkdirs();

		System.out.println("Vérification du xmi...");
		// Lancement du programme de vérification
		List<File> srcFiles = new ArrayList<File>();
		
		try {
			Stream<Path> s = Files.walk(srcFolder.toPath()).filter(p -> Files.isRegularFile(p));
			
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				srcFiles.add(path.toFile());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File[] oclFiles = new File[srcFiles.size()];
		srcFiles.toArray(oclFiles);
		
		try {
			/** Compilation Requirements *********************************************************************************************/
	        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
	        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
	        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, Arrays.asList(binFolder));
	
	        // This sets up the class path that the compiler will use.
	        // I've added the .jar file that contains the DoStuff interface within in it...
	        List<String> optionList = new ArrayList<String>();
	        optionList.add("-classpath");
	        optionList.add(System.getProperty("java.class.path") + File.pathSeparator + "dist/InlineCompiler.jar");
	
	        Iterable<? extends JavaFileObject> compilationUnit
	                = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(oclFiles));
	        JavaCompiler.CompilationTask task = compiler.getTask(
	            null, 
	            fileManager, 
	            diagnostics, 
	            optionList, 
	            null, 
	            compilationUnit);
	        /********************************************************************************************* Compilation Requirements **/
	        if (task.call()) {
	            /** Load and execute *************************************************************************************************/
	            // Create a new custom class loader, pointing to the directory that contains the compiled
	            // classes, this should point to the top of the package structure!
	        	try (URLClassLoader classLoader = new URLClassLoader(new URL[]{binFolder.toURI().toURL()})) {
	        		
					Map<String, Map<String, List<String>>> errorsMaps = new HashMap<String, Map<String, List<String>>>();
					
					/** MAIN **/
					Class<?> petrinetPackage = classLoader.loadClass(lowerCasedEcoreName + "." + capitalizedEcoreName + "Package");
					Object packageInstance = petrinetPackage.getDeclaredField("eINSTANCE").get(petrinetPackage);
					//PetrinetPackage packageInstance = PetrinetPackage.eINSTANCE;
					
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("xmi", new XMIResourceFactoryImpl());
					
					ResourceSet resSet = new ResourceSetImpl();

					//PetrinetValidator validator = new PetrinetValidator();
					Class<?> validator = classLoader.loadClass("ocl." + capitalizedEcoreName +"Validator");
					Object validatorObject = validator.getConstructor(new Class[] {}).newInstance();
					
					for (String xmiName : xmiNames) {
						String model = projectFolder.getAbsolutePath() + "/" + xmiName;
						URI modelURI = URI.createURI(model);
						Resource resource = resSet.getResource(modelURI, true);
						
						//ValidationResult resultat = validator.validate(resource);
						Class<?> validationResult = classLoader.loadClass("ocl.ValidationResult");
					    Object resultat = validator.getMethod("validate", new Class[] {Resource.class}).invoke(validatorObject, resource);
						
						Map<String, List<String>> errorsMap = new HashMap<String, List<String>>();
						
						//afficherResultat(resultat);
						for (EClassifier eClassifier : ((EPackage) packageInstance).getEClassifiers()) {
							@SuppressWarnings("unchecked")
							List<Object> errors = (List<Object>) validationResult.getMethod("getRecordedErrorsFor", new Class[] {int.class}).invoke(resultat, eClassifier.getClassifierID());
							List<String> errorsString = new ArrayList<String>();
							for (Object error : errors) {
								errorsString.add(error.toString());
							}
							
							errorsMap.put(eClassifier.getName(), errorsString);
						}
						errorsMaps.put(xmiName, errorsMap);
					}
					
//					Class<?> mainClass = classLoader.loadClass("ocl.ValidatePetrinet");
//					mainClass.getMethod("main", String[].class).invoke(null, (Object)args2);

			        fileManager.close();
					return errorsMaps;
				}
	            /************************************************************************************************* Load and execute **/
	        } else {
	            for (javax.tools.Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
	                System.err.format("Error on line %d in %s%n",
	                        diagnostic.getLineNumber(),
	                        diagnostic.getSource().toUri());
	            }
	            throw new RuntimeException("Generated java compiled with error");
	        }
		} catch (IOException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException | NoSuchFieldException exp) {
	        throw new RuntimeException("Java compilation and execution exception", exp);
			//exp.printStackTrace();
	    }
	}

}
