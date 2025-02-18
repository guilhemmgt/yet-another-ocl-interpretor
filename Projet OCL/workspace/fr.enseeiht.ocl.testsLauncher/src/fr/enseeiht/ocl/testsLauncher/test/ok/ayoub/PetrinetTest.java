package fr.enseeiht.ocl.testsLauncher.test.ok.ayoub;

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

import fr.enseeiht.ocl.testsLauncher.util.LauncherUtils;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;

@DisplayName("Tests Petrinet de Ayoub OK")
class PetrinetTest {

	private static Map<String, ValidationResult> resultMap;
	private static List<OclInvariant> invs;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Path workspacePath = Paths.get(new File(".").getAbsolutePath()).getParent().getParent();
		resultMap = LauncherUtils.run(workspacePath, "PetriNet-Ayoub-ok", "PetriNet.mocl", "PetriNet.ecore", "PetriNet.xmi");
		invs = LauncherUtils.getInvariants(workspacePath, "PetriNet-Ayoub-ok", "PetriNet.mocl");
	}
	
	@ParameterizedTest(name="{0}")
	@ArgumentsSource(InvsArgumentsProvider.class)
	@DisplayName("PetriNet")
	void testPetriNet(String invName, List<ValidationError> errors) {
		LauncherUtils.assertErrorsSize(invName, errors, 0);
	}
	
	static class InvsArgumentsProvider implements ArgumentsProvider {
		
	    @Override
	    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
	    	ValidationResult result = resultMap.get(context.getDisplayName() + ".xmi");
			List<Arguments> arguments = new ArrayList<Arguments>();
	    	for (OclInvariant inv : invs) {
	    		arguments.add(Arguments.of(inv.getName(), result.getInvariantError(inv)));
			}
	        return Stream.of(arguments.toArray(new Arguments[0]));
	    }
	}

}
