package fr.enseeiht.ocl.testsLauncher.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Named;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import fr.enseeiht.ocl.testsLauncher.LauncherUtils;
import fr.enseeiht.ocl.testsLauncher.exceptions.SyntaxException;

public class TestsUnitaires {

//	private static Map<String, List<String>> errorsMap;
	private static Path workspacePath;
	
	private static String projectName;
	private static String emptyEcoreName;
	
	private static File projectFolder;
	private static File testFolder;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		
		projectName = "TestsUnitaires";
		emptyEcoreName = "Empty.ecore";
		
		projectFolder = new File(workspacePath.toFile().getAbsolutePath() + "/" + projectName);
		testFolder = new File(projectFolder.getAbsolutePath() + "/tests");
//		Map<String, Map<String, List<String>>> errorsMaps = LauncherUtils.run(workspacePath, "PetrinetTest",
//				"petriNet.mocl", "PetriNet.ecore", "Net.xmi");
//		errorsMap = errorsMaps.get("Net.xmi");

	}

	@ParameterizedTest(name = "{1}")
	@MethodSource("provideSyntaxArguments")
	@DisplayName("Tests sur la syntaxe")
	void testSyntax(String projectName, String moclName, String ecoreName, String xmiName) {
		SyntaxException exp = assertThrows(SyntaxException.class,
				() -> LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmiName));
		assertEquals("extraneous input 'a' expecting 'import'", exp.getSyntaxErrorMessage());

	}
	
	//TODO : Stream of Stream
	private static List<Arguments> provideSyntaxArguments() {
		// return Stream.of(Arguments.of("PetrinetTest", "petriNet.mocl",
		// "PetriNet.ecore", "Net.xmi"));
		
		List<Arguments> args = new ArrayList<Arguments>();
		
		try {
			Stream<Path> s = Files.walk(testFolder.toPath()).filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].equals("s"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				args.add(Arguments.of(projectName, Named.of(name, relativePath), emptyEcoreName, ""));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return args; //Stream.of(Arguments.of("TestsUnitaires", Named.of("importOnly", "syntax/s-importOnly.mocl"), "Empty.ecore", ""))
	}

//	private static void assertErrorsSize(List<String> errors, int nbErreurs) {
//		String message =  "Nombre d'erreur attendu : " + String.valueOf(nbErreurs) + ".\n"
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
