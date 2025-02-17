package fr.enseeiht.ocl.testsLauncher;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Execution de tout les tests")
@SelectPackages("fr.enseeiht.ocl.testsLauncher.test")
public class TestSuite {

}
