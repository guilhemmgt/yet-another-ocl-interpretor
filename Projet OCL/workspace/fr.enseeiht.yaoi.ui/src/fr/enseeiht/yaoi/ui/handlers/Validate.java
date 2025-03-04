package fr.enseeiht.yaoi.ui.handlers;

import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.yaoi.OclInterpretor;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;
import fr.enseeiht.yaoi.ui.others.ScrollableDialog;

public class Validate extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("executing yaoi...");

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Récupère l'éditeur actif
		IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
		if (!(editor instanceof IEditingDomainProvider)) {
			throw new RuntimeException("???");
		}
		EditingDomain editorDomain = ((IEditingDomainProvider) editor).getEditingDomain();
		// Récupère la fenêtre active
		Shell shell = HandlerUtil.getActiveShell(event);
		
		// Charge les resources enregistrées dans l'editor
		ResourceSet resourceSet = editorDomain.getResourceSet();
		Resource moclResource = null;
		for (Resource r : resourceSet.getResources()) {
			if (r.getURI().fileExtension().equals("mocl")) {
				moclResource = r;
			}
		}
		// Si aucun .mocl n'a été ajouté par Load.java
		if (moclResource == null) {
		    MessageDialog.openError(
		            shell,
		            "Resource MOCL manquante.",
		            "Veuillez d'abord charger un fichier .mocl en faisant un clic droit sur un fichier .xmi puis en sélectionnant 'MOCL → Load' ou 'Load Resource'."
		        );
			return null;
		}

		//// MOCL

		EcoreUtil.resolveAll(moclResource);
		// Récupérer le Module MOCL
		Module moclModule = (Module) moclResource.getContents().get(0);

		// Enregistrement des EPackages de tous les imports du .mocl
		for (Import eImport : moclModule.getImports()) {
			if (eImport.getPackage().eResource() != null) {
				URI importUri = eImport.getPackage().eResource().getURI();
				Resource importResource = resourceSet.getResource(importUri, true);
				EPackage importEPackage = (EPackage) importResource.getContents().get(0);
				EPackage.Registry.INSTANCE.put(importEPackage.getNsURI(), importEPackage);
			} else {
				throw new RuntimeException("Impossible de charger la ressource !");
			}
		}

		//// XMI

		// Récuperer la selection
		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
		selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getSelection();
		Object firstElement = selection.getFirstElement();
		Resource xmiResource = null;
		if (firstElement instanceof XMIResourceImpl) { // Si l'élement est le .xmi
			xmiResource = (Resource) firstElement;
			// xmiResource = resourceSet.createResource(((XMIResource)
		} else if (firstElement instanceof EObject) {  // Si c'est un de ses enfants
			xmiResource = ((EObject) firstElement).eResource();
		} else { // le menu ne devrait pas pouvoir s'afficher pour autre chose
			throw new RuntimeException("Shouldn't be able to call the menu on this : " + firstElement);
		}

		//// RESULTS

		// Appelle l'interpréteur et crée la popup pour les résultats
		ValidationResult res = OclInterpretor.validate(xmiResource, moclModule);
		StringBuilder sb = new StringBuilder();
		for (ValidationError error : res.getErrors()) {
		    String invName = error.getFailedInvariant() != null 
		                     ? error.getFailedInvariant().getName() 
		                     : "Unknown Invariant";
		    String objName = error.getTestedObject() != null 
		                     ? error.getTestedObject().toString() 
		                     : "Unknown Object";
		    sb.append("Invariant \"").append(invName)
		      .append("\" is violated by \"").append(objName).append("\"\n\n");
		}
		ScrollableDialog dialog = new ScrollableDialog(
		    shell,
		    "Validation Results",
		    "The following validation errors were detected:",
		    sb.toString()
		);
		dialog.open();

		return null;
	}
}
