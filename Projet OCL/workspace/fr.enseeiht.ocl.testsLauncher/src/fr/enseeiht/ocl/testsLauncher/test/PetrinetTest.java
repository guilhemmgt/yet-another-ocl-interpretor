package fr.enseeiht.ocl.testsLauncher.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.enseeiht.ocl.testsLauncher.LauncherUtils;

class PetrinetTest {

	private static Map<String, List<String>> errorsMap;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		Map<String, Map<String, List<String>>> errorsMaps = LauncherUtils.run(workspacePath, "PetrinetTest", "petriNet.mocl", "PetriNet.ecore", "Net.xmi");
		errorsMap = errorsMaps.get("Net.xmi");
		
	}

	@Test
	@DisplayName("Net")
	void testNet() {
			assertErrorsSize(errorsMap.get("Net"), 1);
	}
	
	@Test
	@DisplayName("NetElement")
	void testNetElement() {
			assertErrorsSize(errorsMap.get("NetElement"), 0);
	}
	
	@Test
	@DisplayName("Arc")
	void testArc() {
			assertErrorsSize(errorsMap.get("Arc"), 0);
	}
	
	@Test
	@DisplayName("Place")
	void testPlace() {
			assertErrorsSize(errorsMap.get("Place"), 0);
	}
	
	@Test
	@DisplayName("Transition")
	void testTransition() {
			assertErrorsSize(errorsMap.get("Transition"), 0);
	}
	
	@Test
	@DisplayName("Bloc")
	void testBloc() {
			assertErrorsSize(errorsMap.get("Bloc"), 0);
	}

	private static void assertErrorsSize(List<String> errors, int nbErreurs) {
		String message =  "Nombre d'erreur attendu : " + String.valueOf(nbErreurs) + ".\n"
						+ "Nombre d'erreur remontées : " + String.valueOf(errors.size()) + ".\n";
		if(!errors.isEmpty())
			message += "Liste des erreurs :\n";
		for (String error : errors) {
			message += error + "\n";
		}
		
		assertEquals(nbErreurs, errors.size(), message);
	}

}
