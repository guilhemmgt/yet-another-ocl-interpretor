/*
 * generated by Xtext 2.37.0
 */
package fr.enseeiht.ocl.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class OclStandaloneSetup extends OclStandaloneSetupGenerated {

	public static void doSetup() {
		new OclStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
