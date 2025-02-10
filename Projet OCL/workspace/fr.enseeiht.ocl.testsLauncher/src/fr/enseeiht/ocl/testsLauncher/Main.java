package fr.enseeiht.ocl.testsLauncher;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.eclipse.emf.common.util.BasicMonitor;
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
import com.google.inject.Injector;

import fr.enseeiht.ocl.xtext.OclStandaloneSetup;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.ECoreToJava.main.EcoreToJava;
import fr.enseeiht.ocl.OCLCollectionToJava.main.OclCollectionToJava;
import fr.enseeiht.ocl.OCLToJava.main.OclToJava;


public class Main {

	public static void main(String[] args) {
		
		Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		System.out.println(workspacePath);
		
		File projectFolder = workspacePath.toFile().listFiles((f, n) -> n.equals("PetrinetTest"))[0];
		
		File srcFolder = projectFolder.listFiles((f, n) -> n.equals("src"))[0];
		File binFolder = projectFolder.listFiles((f, n) -> n.equals("bin"))[0];
		
		System.out.println(projectFolder.getAbsolutePath());
		
		File ecoreFile = projectFolder.listFiles((f, n) -> n.equals("PetriNet.ecore"))[0];
        File moclFile = projectFolder.listFiles((f, n) -> n.equals("petriNet.mocl"))[0];
		
		URI ecoreURI = URI.createFileURI(ecoreFile.getAbsolutePath());
		URI moclURI = URI.createFileURI(moclFile.getAbsolutePath());
        
        Injector injector = new OclStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

        ResourceSet res = new ResourceSetImpl();
        Resource ecoreResource = res.getResource(ecoreURI, true);
        
        
        Resource toclResource = resourceSet.getResource(moclURI, true);
        try {
	    	toclResource.save(System.out, null);
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
        EcoreUtil.resolveAll(toclResource);
        toclResource.getContents().add(EcoreUtil.copy(ecoreResource.getContents().get(0)));
        Module toclObject = (Module) toclResource.getContents().get(0);
        
        EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
        
        toclObject.getImports().get(0).setPackage(ecorePackage);
        
        File oclFolder = new File(srcFolder.getAbsolutePath() + "/ocl");
        File oclCollectionsFolder = new File(srcFolder.getAbsolutePath() + "/oclCollections");
        
        
		try {
			EcoreToJava gen0 = new EcoreToJava(ecoreURI, oclFolder, new ArrayList<String>());
			gen0.doGenerate(new BasicMonitor());
		
			EObject model = gen0.getModel();
			if (model != null) {
				
				OclCollectionToJava gen1 = new OclCollectionToJava(model, oclCollectionsFolder, new ArrayList<String>());
				gen1.doGenerate(new BasicMonitor());
			}
			
			OclToJava gen2 = new OclToJava(toclObject, oclFolder, new ArrayList<String>());
			gen2.doGenerate(new BasicMonitor());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nStart launching program");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
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
		
		for (File file : oclFiles) {
			System.out.println(file.getAbsolutePath());
		}
		
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
	        	System.out.println(new File("./").toURI().toURL());
	            try (URLClassLoader classLoader = new URLClassLoader(new URL[]{binFolder.toURI().toURL()})) {
					String[] args2 = {projectFolder.getAbsolutePath() + "/Net.xmi"};
					
					/** MAIN **/
					Class<?> petrinetPackage = classLoader.loadClass("petrinet.PetrinetPackage");
					Object packageInstance = petrinetPackage.getDeclaredField("eINSTANCE").get(petrinetPackage);
					//PetrinetPackage packageInstance = PetrinetPackage.eINSTANCE;
					
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("xmi", new XMIResourceFactoryImpl());
					
					ResourceSet resSet = new ResourceSetImpl();

					//PetrinetValidator validator = new PetrinetValidator();
					Class<?> validator = classLoader.loadClass("ocl.PetrinetValidator");
					Object validatorObject = validator.getConstructor(new Class[] {}).newInstance();
					
					for (String model : args2) {
						URI modelURI = URI.createURI(model);
						Resource resource = resSet.getResource(modelURI, true);
						
						//ValidationResult resultat = validator.validate(resource);
						Class<?> validationResult = classLoader.loadClass("ocl.ValidationResult");
					    Object resultat = validator.getMethod("validate", new Class[] {Resource.class}).invoke(validatorObject, resource);

						System.out.println("Résultat de validation pour " + model + ":");
						//afficherResultat(resultat);
						for (EClassifier eClassifier : ((EPackage) packageInstance).getEClassifiers()) {
							@SuppressWarnings("unchecked")
							List<Object> errors = (List<Object>) validationResult.getMethod("getRecordedErrorsFor", new Class[] {int.class}).invoke(resultat, eClassifier.getClassifierID());
							
							System.out.print("- " + eClassifier.getName() + ":");
							if (errors.isEmpty()) {
								System.out.println(" OK");
							} else {
								System.out.println(" " + errors.size() + " erreurs trouvées");
								for (Object error : errors) {
									System.out.println("=> " + error.toString());
								}
							}
						} 
					}
					
					System.out.println("Fini.");
					
//					Class<?> mainClass = classLoader.loadClass("ocl.ValidatePetrinet");
//					mainClass.getMethod("main", String[].class).invoke(null, (Object)args2);
				}
	            /************************************************************************************************* Load and execute **/
	        } else {
	            for (Diagnostic<? extends JavaFileObject> diagnostic : diagnostics.getDiagnostics()) {
	                System.out.format("Error on line %d in %s%n",
	                        diagnostic.getLineNumber(),
	                        diagnostic.getSource().toUri());
	            }
	        }
	        fileManager.close();
		} catch (IOException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException | NoSuchFieldException exp) {
	        exp.printStackTrace();
	    }

		System.out.println("End launching program");

	}

}
