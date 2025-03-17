package fr.enseeiht.yaoi.ui.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import fr.enseeiht.yaoi.ui.others.ScrollableDialog.Status;
import fr.enseeiht.yaoi.ui.others.YaoiConsole;

/**
 * Handler for Validating MOCL resources against the selected XMI.
 * <p>
 * This handler implements the functionality to validate all loaded MOCL files
 * It then opens a result popup scrollable text dialog.
 * </p>
 * 
 */
public class Validate extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
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
			List<Resource> moclResources = new ArrayList<Resource>();
			for (Resource r : resourceSet.getResources()) {
				String uri = r.getURI().fileExtension();
				if (uri != null && uri.equals("mocl")) {
					moclResources.add(r);
				}
			}
			// Si aucun .mocl n'a été ajouté par Load.java
			if (moclResources.isEmpty()) {
				MessageDialog.openError(shell, "Missing Mocl Resource",
						"Please load an .mocl file first by right-clicking on an .xmi file and selecting 'MOCL → Load' or 'Load Resource'.");
				return null;
			}

			//// MOCL

			// Charger tous les mocl
			HashMap<Module, URI> moclModules = new HashMap<Module, URI>();
			for (Resource mocl : moclResources) {
				EcoreUtil.resolveAll(mocl);
				// Récupérer le Module
				Module module = (Module) mocl.getContents().get(0);

				// Enregistrement des EPackages de tous les imports du .mocl
				for (Import eImport : module.getImports()) {
					if (eImport.getPackage().eResource() != null) {
						URI importUri = eImport.getPackage().eResource().getURI();
						Resource importResource = resourceSet.getResource(importUri, true);
						EPackage importEPackage = (EPackage) importResource.getContents().get(0);
						EPackage.Registry.INSTANCE.put(importEPackage.getNsURI(), importEPackage);
					} else {
						throw new RuntimeException("Impossible to load the resource !");
					}
				}

				moclModules.put(module, mocl.getURI());
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
			} else if (firstElement instanceof EObject) { // Si c'est un de ses enfants
				xmiResource = ((EObject) firstElement).eResource();
			} else { // le menu ne devrait pas pouvoir s'afficher pour autre chose
				throw new RuntimeException("Shouldn't be able to call the menu on this : " + firstElement);
			}

			//// RESULTS

			// Appelle l'interpréteur et crée la popup pour les résultats
			StringBuilder sb = new StringBuilder();
			boolean hasErrors = false;
			for (Module module : moclModules.keySet()) {
				ValidationResult res = OclInterpretor.validate(xmiResource, module);

				sb.append(moclModules.get(module).toString() + ":\n");

				boolean hasErrorsLocal = !res.getErrors().isEmpty();
				if (hasErrorsLocal) {
					hasErrors = true;
					for (ValidationError error : res.getErrors()) {
						sb.append(error.toString()+"\n");
					}
				} else {
					sb.append("The model conforms to all OCL constraints defined in the MOCL file.\n");
					sb.append("No violations were detected during validation.\n");
				}
				sb.append("\n");
			}
			if (sb.isEmpty()) {
				sb.append("The model conforms to all OCL constraints defined in the MOCL file.\n");
				sb.append("No violations were detected during validation.");
			}

			String dialogTitle = hasErrors ? "Validation Results" : "Validation Success";
			String dialogMessage = hasErrors ? "The following validation errors were detected:"
					: "All validations passed successfully!";
			Status status = hasErrors ? Status.ERROR : Status.SUCCESS;

			// Display the scrollable dialog with appropriate icon
			ScrollableDialog dialog = new ScrollableDialog(shell, dialogTitle, dialogMessage, sb.toString(), status);
			dialog.open();
		} catch (Exception e) {
			YaoiConsole.printStackTrace(e);
		}

		return null;
	}
}
