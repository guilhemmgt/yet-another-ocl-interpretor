package fr.enseeiht.ocl.testsLauncher.test.ok.guilhem;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import fr.enseeiht.ocl.testsLauncher.LauncherUtils;

@DisplayName("Tests SimplePDL de Guilhem OK")
class SimplePDLTest {

	private static Map<String, Map<String, List<String>>> errorsMaps;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		errorsMaps = LauncherUtils.run(workspacePath, "SimplePDL-Guilhem-ok", "SimplePDL.mocl", "SimplePDL.ecore", "Process-blocage.xmi", "Process-concurrence.xmi", "Process-developpement.xmi", "Process-patisserie.xmi", "Process-penurie.xmi");
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-blocage")
	void testNetworkBlocageEMF(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, 0);
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-concurrence")
	void testNetworkDeveloppementEMF(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, 0);
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-developpement")
	void testNetworkPatisserieEMF(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, 0);
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-patisserie")
	void testNetworkReadarc(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, 0);
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-penurie")
	void testNetworkSaisons(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, 0);
	}
	
	static class InvsArgumentsProvider implements ArgumentsProvider {
		
	    @Override
	    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
	    	Map<String, List<String>> errorsMap = errorsMaps.get(context.getDisplayName() + ".xmi");
			List<Arguments> arguments = new ArrayList<Arguments>();
	    	for (String invName : errorsMap.keySet()) {
	    		arguments.add(Arguments.of(invName, errorsMap.get(invName)));
			}
	        return Stream.of(arguments.toArray(new Arguments[0]));
	    }
	}

	private static void assertErrorsSize(String adapterName, List<String> errors, int nbErreurs) {
		String message =  "Noeud : " + adapterName + ".\n" 
						+ "Nombre d'erreur attendu : " + String.valueOf(nbErreurs) + ".\n"
						+ "Nombre d'erreur remontées : " + String.valueOf(errors.size()) + ".\n";
		if(!errors.isEmpty())
			message += "Liste des erreurs :\n";
		for (String error : errors) {
			message += error + "\n";
		}
		
		assertEquals(nbErreurs, errors.size(), message);
	}

}
