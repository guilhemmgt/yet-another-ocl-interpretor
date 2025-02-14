package fr.enseeiht.ocl.testsLauncher.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileExtensionException;
import fr.enseeiht.ocl.testsLauncher.exceptions.BadFileStructureException;
import fr.enseeiht.ocl.testsLauncher.exceptions.SyntaxException;
import fr.enseeiht.ocl.testsLauncher.exceptions.TypeCheckingException;
import fr.enseeiht.ocl.testsLauncher.util.LauncherUtils;

public class TestsUnitaires {

//	private static Map<String, List<String>> errorsMap;
	private static Path workspacePath;

	private static String projectName;
	private static String emptyEcoreName;
	private static String liarXmiName;

	private static File projectFolder;
	private static File testFolder;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();

		projectName = "TestsUnitaires";
		emptyEcoreName = "Empty.ecore";
		liarXmiName = "Liar.xmi";

		projectFolder = new File(workspacePath.toFile().getAbsolutePath() + "/" + projectName);
		testFolder = new File(projectFolder.getAbsolutePath() + "/tests");
//		Map<String, Map<String, List<String>>> errorsMaps = LauncherUtils.run(workspacePath, "PetrinetTest",
//				"petriNet.mocl", "PetriNet.ecore", "Net.xmi");
//		errorsMap = errorsMaps.get("Net.xmi");

	}
	
	@ParameterizedTest(name = "{0}")
	@MethodSource("provideSyntaxArguments")
	@DisplayName("Tests KO sur la syntaxe")
	void testSyntax(String moclName, String errorMessage) {
		SyntaxException exp = assertThrows(SyntaxException.class,
				() -> LauncherUtils.run(workspacePath, projectName, moclName, emptyEcoreName, liarXmiName),
				"L'erreur de syntaxe n'as pas été identifié");
		if (errorMessage != null)
			assertEquals(errorMessage, exp.getSyntaxErrorMessage());

	}

	private static List<Arguments> provideSyntaxArguments() {
		// return Stream.of(Arguments.of("PetrinetTest", "petriNet.mocl",
		// "PetriNet.ecore", "Net.xmi"));

		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].equals("s"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String lastLine = "";
				String sCurrentLine;
				BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
				while ((sCurrentLine = br.readLine()) != null) {
					lastLine = sCurrentLine;
				}
				if (lastLine.endsWith("|") && lastLine.startsWith("|"))
					lastLine = lastLine.substring(1, lastLine.length() - 1);
				else
					lastLine = null;
				args.add(Arguments.of(Named.of(name, relativePath), lastLine));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return args;
	}

	@ParameterizedTest(name = "{0}")
	@MethodSource("provideTypeCheckingArguments")
	@DisplayName("Tests KO sur le typage")
	void testTypeChecking(String moclName, String errorMessage) {
		TypeCheckingException exp = assertThrows(TypeCheckingException.class,
				() -> LauncherUtils.run(workspacePath, projectName, moclName, emptyEcoreName, liarXmiName),
				"L'erreur de type n'as pas été identifié");
		if (errorMessage != null)
			assertEquals(errorMessage, exp.getTypeCheckingErrorMessage());

	}

	private static List<Arguments> provideTypeCheckingArguments() {
		// return Stream.of(Arguments.of("PetrinetTest", "petriNet.mocl",
		// "PetriNet.ecore", "Net.xmi"));

		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].equals("t"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String lastLine = "";
				String sCurrentLine;
				BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
				while ((sCurrentLine = br.readLine()) != null) {
					lastLine = sCurrentLine;
				}
				if (lastLine.endsWith("|") && lastLine.startsWith("|"))
					lastLine = lastLine.substring(1, lastLine.length() - 1);
				else
					lastLine = null;
				args.add(Arguments.of(projectName, Named.of(name, relativePath), lastLine));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return args;
	}
	
	@ParameterizedTest(name = "{0}")
	@MethodSource("provideValidationArguments")
	@DisplayName("Tests KO sur la validation")
	void testValidation(String moclName, String ecoreName, String xmi) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException {
		Map<String, Map<String, List<String>>> errorsMaps = LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmi);
		Map<String, List<String>> errorsMap = errorsMaps.get(xmi);
		
		assertEquals(1, errorsMap.size(), "Test malformé"); //TODO : nombre d'invariant et pas d'élément (a check avec les intrepretators) 
		
		List<String> errorsAll = new ArrayList<String>();
		
		for (String adapterName : errorsMap.keySet()) {
			errorsAll.addAll(errorsMap.get(adapterName));
		}
		
		assertTrue(!errorsAll.isEmpty());
	}

	private static List<Arguments> provideValidationArguments() {
		// return Stream.of(Arguments.of("PetrinetTest", "petriNet.mocl",
		// "PetriNet.ecore", "Net.xmi"));

		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].split(";")[0].equals("v"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String ecoreName;
				String xmiName;
				if(path.getFileName().toString().split("-")[0].split(";").length==3) {
					ecoreName = path.getFileName().toString().split("-")[0].split(";")[1] + ".ecore";
					xmiName = path.getFileName().toString().split("-")[0].split(";")[2] + ".xmi";
				} else {
					ecoreName = emptyEcoreName;
					xmiName = liarXmiName;
				}
				args.add(Arguments.of(Named.of(name, relativePath), ecoreName, xmiName));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return args;
	}
	
	@ParameterizedTest(name = "{0}")
	@MethodSource("provideOkArguments")
	@DisplayName("Tests OK")
	void testOk(String moclName, String ecoreName, String xmi) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException {
		Map<String, Map<String, List<String>>> errorsMaps = LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmi);
		Map<String, List<String>> errorsMap = errorsMaps.get(xmi);
		
		List<String> errorsAll = new ArrayList<String>();
		
		for (String adapterName : errorsMap.keySet()) {
			errorsAll.addAll(errorsMap.get(adapterName));
		}
		
		assertTrue(errorsAll.isEmpty());
	}

	private static List<Arguments> provideOkArguments() {
		// return Stream.of(Arguments.of("PetrinetTest", "petriNet.mocl",
		// "PetriNet.ecore", "Net.xmi"));

		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].split(";")[0].equals("ok"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String ecoreName;
				String xmiName;
				if(path.getFileName().toString().split("-")[0].split(";").length==3) {
					ecoreName = path.getFileName().toString().split("-")[0].split(";")[1] + ".ecore";
					xmiName = path.getFileName().toString().split("-")[0].split(";")[2] + ".xmi";
				} else {
					ecoreName = emptyEcoreName;
					xmiName = liarXmiName;
				} 
				args.add(Arguments.of(Named.of(name, relativePath), ecoreName, xmiName));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return args;
	}

//	private static void assertErrorsSize(String adapterName, List<String> errors, int nbErreurs) {
//		String message =  "Noeud : " + adapterName + ".\n" 
//						+ "Nombre d'erreur attendu : " + String.valueOf(nbErreurs) + ".\n"
//						+ "Nombre d'erreur remontées : " + String.valueOf(errors.size()) + ".\n";
//		if(!errors.isEmpty())
//			message += "Liste des erreurs :\n";
//		for (String error : errors) {
//			message += error + "\n";
//		}
//		
//		assertEquals(nbErreurs, errors.size(), message);
//	}

}
