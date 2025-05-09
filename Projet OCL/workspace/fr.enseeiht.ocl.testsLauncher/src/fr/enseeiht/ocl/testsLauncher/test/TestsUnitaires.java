package fr.enseeiht.ocl.testsLauncher.test;

import static org.junit.Assert.assertFalse;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import fr.enseeiht.ocl.testsLauncher.exceptions.CheckTypeException;
import fr.enseeiht.ocl.testsLauncher.exceptions.LinkingException;
import fr.enseeiht.ocl.testsLauncher.util.LauncherUtils;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;
import fr.enseeiht.yaoi.ValidationUndefined;

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
		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].equals("s"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String errorLine = null;
				String sCurrentLine;
				BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
				while ((sCurrentLine = br.readLine()) != null) {
					Pattern p = Pattern.compile("\\s(?=([^\"\\\\]*(\\\\.|\"([^\"\\\\]*\\\\.)*[^\"\\\\]*\"))*[^\"]*$)", Pattern.CASE_INSENSITIVE);
					Matcher m = p.matcher(sCurrentLine);
					sCurrentLine = m.replaceAll("");
					if(sCurrentLine.startsWith("--@error:\"") && sCurrentLine.endsWith("\"")) {
						errorLine = sCurrentLine.substring(10, sCurrentLine.length() - 1);
						break;
					}
				}
				args.add(Arguments.of(Named.of(name, relativePath), errorLine));
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
		CheckTypeException exp = assertThrows(CheckTypeException.class,
				() -> LauncherUtils.run(workspacePath, projectName, moclName, emptyEcoreName, liarXmiName),
				"L'erreur de type n'as pas été identifié");
		if (errorMessage != null)
			assertEquals(errorMessage, exp.getTypeCheckingErrorMessage());

	}

	private static List<Arguments> provideValidationArguments() {
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

	private static List<Arguments> provideTypeCheckingArguments() {
		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].equals("t"));
			for (Path path : (Iterable<Path>) () -> s.iterator()) {
				String name = path.getFileName().toString().split("-")[1].split("\\.")[0];
				String relativePath = projectFolder.toURI().relativize(path.toFile().toURI()).getPath();
				String errorLine = null;
				String sCurrentLine;
				BufferedReader br = new BufferedReader(new FileReader(path.toFile()));
				while ((sCurrentLine = br.readLine()) != null) {
					Pattern p = Pattern.compile("\\s(?=([^\"\\\\]*(\\\\.|\"([^\"\\\\]*\\\\.)*[^\"\\\\]*\"))*[^\"]*$)", Pattern.CASE_INSENSITIVE);
					Matcher m = p.matcher(sCurrentLine);
					sCurrentLine = m.replaceAll("");
					if(sCurrentLine.startsWith("--@error:\"") && sCurrentLine.endsWith("\"")) {
						errorLine = sCurrentLine.substring(10, sCurrentLine.length() - 1);
						break;
					}
				}
				args.add(Arguments.of(Named.of(name, relativePath), errorLine));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return args;
	}
	
	@ParameterizedTest(name = "{0}")
	@MethodSource("provideValidationUndefinedArguments")
	@DisplayName("Tests KO sur la validation (Invalid)")
	void testValidationUndefined(String moclName, String ecoreName, String xmi) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException, CheckTypeException, LinkingException {
		Map<String, ValidationResult> resultMap = LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmi);
		ValidationResult result = resultMap.get(xmi);
		
		List<OclInvariant> invs = LauncherUtils.getInvariants(workspacePath, projectName, moclName);
		assertEquals(1, invs.size(), "Test malformé, il doit n'y avoir qu'un invariant à tester dans le fichier mocl");
		
		List<ValidationError> errors = result.getInvariantErrors(invs.get(0));
		
		List<ValidationUndefined> undefinedErors = new ArrayList<ValidationUndefined>();
		for (ValidationError error : errors) {
			if(error instanceof ValidationUndefined) {
				undefinedErors.add((ValidationUndefined) error);
			}
		}
		
		assertFalse("Aucune valeur \"null\" retournée.", undefinedErors.isEmpty());
		
		if (undefinedErors.size() != errors.size())
			System.out.println("\u001B[33mWARNING : Le test a vérifié pluieurs élments et il n'as pas retourné le même résultat pour chaque.\u001B[0m");
		
	}

	private static List<Arguments> provideValidationUndefinedArguments() {
		List<Arguments> args = new ArrayList<Arguments>();

		try {
			Stream<Path> s = Files.walk(testFolder.toPath())
					.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().split("-")[0].split(";")[0].equals("vu"));
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
	@MethodSource("provideValidationArguments")
	@DisplayName("Tests KO sur la validation (False)")
	void testValidation(String moclName, String ecoreName, String xmi) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException, CheckTypeException, LinkingException {
		Map<String, ValidationResult> resultMap = LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmi);
		ValidationResult result = resultMap.get(xmi);
		
		List<OclInvariant> invs = LauncherUtils.getInvariants(workspacePath, projectName, moclName);
		assertEquals(1, invs.size(), "Test malformé");
		
		List<ValidationError> errors = result.getInvariantErrors(invs.get(0));
		
		List<String> undefinedErors = new ArrayList<String>();
		for (ValidationError error : errors) {
			if(error instanceof ValidationUndefined) {
				undefinedErors.add(((ValidationUndefined) error).getMessage());
			}
		}
		
		assertTrue("Valeur \"invalid\" retournée.\n" + String.join("\n", undefinedErors), undefinedErors.isEmpty());
		
		assertFalse("Aucune erreur de validation trouvée.", errors.isEmpty());
	}
	
	@ParameterizedTest(name = "{0}")
	@MethodSource("provideOkArguments")
	@DisplayName("Tests OK (True)")
	void testOk(String moclName, String ecoreName, String xmi) throws FileNotFoundException, BadFileExtensionException, BadFileStructureException, SyntaxException, CheckTypeException, LinkingException {
		Map<String, ValidationResult> resultMap = LauncherUtils.run(workspacePath, projectName, moclName, ecoreName, xmi);
		ValidationResult result = resultMap.get(xmi);
		
		assertTrue("Erreur de validation trouvée.\n" + getOkErrorMessage(result), result.hasNoError());
	}

	private String getOkErrorMessage(ValidationResult result) {
		String message = "Liste des erreurs trouvées :\n";
		for (ValidationError error : result.getErrors()) {
			message += error + "\n";
		}
		return message;
	}

	private static List<Arguments> provideOkArguments() {
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
}
