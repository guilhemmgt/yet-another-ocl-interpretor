package fr.enseeiht.yaoi.ui.handlers;

import java.io.File;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.PlatformUI;
import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.Module;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		System.out.println("executing yaoi...");

//		// Récupère l'environnement de l'Eclipse de déploiement
//		Injector injector = XtextActivator.getInstance().getInjector(XtextActivator.FR_ENSEEIHT_OCL_XTEXT_OCL);
//		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//		// Charge le package de OCL2
//		resourceSet.getPackageRegistry().put(OclPackage.eNS_URI, OclPackage.eINSTANCE);
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);

		// Récupérer le .mocl (via fenêtre de dialogue)
		fileDialog.setText("Sélectionner un fichier de contraintes");
		fileDialog.setFilterExtensions(new String[] { "*.mocl" });
		String moclPath = fileDialog.open();
		System.out.println("mocl path: " + moclPath);

		// En cas d'annulation de la sélection par l'user
		if (moclPath == null)
			return null;

		// Récupérer l'URI du .mocl
		File moclFile = new File(moclPath);
		IFile moclIFile = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(moclFile.toURI())[0];
		URI moclUri = URI.createPlatformResourceURI(moclIFile.getFullPath().toString(), true);
		System.out.println("mocl uri: " + moclUri);

		// Récupérer la Resource du .mocl
		Resource moclResource = resourceSet.getResource(moclUri, true);
		System.out.println("mocl resource: " + moclResource);
		
		// Récupérer le Module MOCL
		Module moclModule = (Module) moclResource.getContents().get(0);
		
		// Enregistrement des EPackages de tous les imports du .mocl
		for (Import eImport : moclModule.getImports()) {
			System.out.print(eImport.getPackage().getName() + " : ");
			if (eImport.getPackage().eResource() != null) {
				
				URI importUri = eImport.getPackage().eResource().getURI();
				Resource importResource = resourceSet.getResource(importUri, true);
				EPackage importEPackage = (EPackage) importResource.getContents().get(0);
				EPackage.Registry.INSTANCE.put(importEPackage.getNsURI(), importEPackage);
				
				System.out.println("ok");
			} else {
				System.err.println("Impossible de charger la ressource !");
			}
		}

		// Récupérer le .xmi (via fenêtre de dialogue)
		fileDialog.setText("Sélectionner un modèle");
		fileDialog.setFilterExtensions(new String[] { "*.xmi" });
		String modelPath = fileDialog.open();
		System.out.println("model path: " + modelPath);

		// En cas d'annulation de la sélection par l'user
		if (modelPath == null)
			return null;

		// Récupérer l'URI du .mocl
		URI modelUri = URI.createFileURI(modelPath);
		System.out.println("model uri: " + modelUri);

		// Récupérer la Resource du .mocl
		Resource modelResource = resourceSet.getResource(modelUri, true);
		System.out.println("model resource: " + modelResource);

		// TODO validation des invariants à l'aide du .mocl et du .xmi
		System.out.println("\nValidation des invariants :");
		
		// j'ai commenté pcq on a changé la syntaxe et
		// flemme de fix pcq on va pas utiliser et zzz zzz zzz zzz ...
//		for (ModuleElement elt : moclModule.getElements()) { 
//			if (elt instanceof OclInvariant) {
//				OclInvariant inv = (OclInvariant) elt;
//				System.out.println(inv.getName() + " : ");
//			}
//		}

		return null;
	}
}
