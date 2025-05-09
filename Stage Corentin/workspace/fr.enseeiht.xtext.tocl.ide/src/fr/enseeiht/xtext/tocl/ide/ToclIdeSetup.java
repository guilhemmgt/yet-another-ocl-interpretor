/*
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.enseeiht.xtext.tocl.ToclRuntimeModule;
import fr.enseeiht.xtext.tocl.ToclStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ToclIdeSetup extends ToclStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ToclRuntimeModule(), new ToclIdeModule()));
	}
	
}
