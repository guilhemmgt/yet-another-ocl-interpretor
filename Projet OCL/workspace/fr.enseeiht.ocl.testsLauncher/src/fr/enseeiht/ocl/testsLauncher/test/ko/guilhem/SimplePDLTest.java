package fr.enseeiht.ocl.testsLauncher.test.ko.guilhem;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
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

@DisplayName("Tests SimplePDL de Guilhem KO")
class SimplePDLTest {

	private static Map<String, Integer> expectedNumberOfErrors = new HashMap<String, Integer>() {
		private static final long serialVersionUID = 1L;
		{
			put("nomUniqueR", 1);
			put("nomValide", 2);
			put("successeurEtPredecesseurDansMemeProcess", 1);
			put("nomPasCourt", 2);
			put("quantiteStrictPositive", 1);
			put("unSeulNeedParRessource", 1);
		}
	};
	
	private static Map<String, Map<String, List<String>>> errorsMaps;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		errorsMaps = LauncherUtils.run(workspacePath, "SimplePDL-Guilhem-ko", "SimplePDL.mocl", "SimplePDL.ecore", "Process-batard.xmi");
		
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("Process-batard")
	void testNetworkBlocageEMF(String invName, List<String> errors) {
		assertErrorsSize(invName, errors, expectedNumberOfErrors.get(invName));
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
		String message =  "Noeud : " + adapterName + ". Veuillez vous référer au ficher 'batard.txt' pour plus de précision.\n" 
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
