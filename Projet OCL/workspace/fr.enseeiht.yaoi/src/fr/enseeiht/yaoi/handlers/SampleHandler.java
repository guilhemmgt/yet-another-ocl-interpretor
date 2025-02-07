package fr.enseeiht.yaoi.handlers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.enseeiht.ocl.xtext.OclStandaloneSetup;
import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.ocl.xtext.ocl.ModuleElement;
import fr.enseeiht.ocl.xtext.ocl.OclInvariant;
import fr.enseeiht.ocl.xtext.ocl.OclPackage;
import fr.enseeiht.ocl.xtext.ui.internal.XtextActivator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// TODO : Ask for a file 
		String result = "/Test/test.tocl";
		
		// Récuperer l'env de l'ecclipse de déploiment 
		Injector injector = XtextActivator.getInstance().getInjector(XtextActivator.FR_ENSEEIHT_OCL_XTEXT_OCL);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// Charger le package de OCL2
		resourceSet.getPackageRegistry().put
			(OclPackage.eNS_URI, 
					OclPackage.eINSTANCE);
		
		// Charger le *.ocl2
		URI uri = URI.createURI(new File(result).getAbsolutePath());
		System.out.println(uri);
		// System.out.println(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		//Resource ecoreResource = resourceSet.getResource(URI.createURI("http://www.enseeiht.fr/xtext/tocl/Tocl"), false);
		//System.out.println(ecoreResource.getContents());
		
		// Conversion en EObject en passant par une ressource xmi
		EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI("file:///"+System.getProperty("user.dir")+"/test.xmi"));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    //xmiResource.getContents().add(ecoreResource.getContents().get(0));
//	    try {
//			xmiResource.save(null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    Module toclModule = (Module) xmiResource.getContents().get(0);
	    
	    System.out.println("\nChargement des imports :");
	    Map<String,Resource> imports = new HashMap<String, Resource>();
	    System.out.println("\nChargement des imports : ");
	    for (Import eImport : toclModule.getImports()) {
	    	System.out.print(eImport.getPackage().getName()+ " : ");
	    	if (eImport.getPackage().eResource() != null) {	    		
	    		imports.put(eImport.getPackage().getName(), eImport.getPackage().eResource());
	    		// TODO : Charger le Ecore dans le contexte
	    		System.out.println("ok");	
	    	} else {
	    		System.err.println("Impossible de charger la ressource !");
	    		//System.exit(-1);
	    	}
	    }
	    
	    System.out.println("\nValidation des invariants :");
	    for (ModuleElement elt : toclModule.getElements()) {
	    	if (elt instanceof OclInvariant) {
	    		OclInvariant inv = (OclInvariant) elt;
	    		
	    		System.out.println(inv.getName() + " : ");
	    		
	    		
	    	}
	    }
		return null;
	}
}
