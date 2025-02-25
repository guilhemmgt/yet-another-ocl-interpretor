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

public class Validate extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("executing yaoi...");

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		// Test
		IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
		if (!(editor instanceof IEditingDomainProvider)) {
			throw new RuntimeException("???");
		}
		EditingDomain editorDomain = ((IEditingDomainProvider) editor).getEditingDomain();
		ResourceSet resourceSet = editorDomain.getResourceSet();
		URI moclUri = null;
		for (Resource r : resourceSet.getResources()) {
			System.out.println(r);
			if (r.getURI().fileExtension().equals("mocl")) {
				System.out.println("aaaaaaaaa");
				moclUri = r.getURI();
			}
		}
		
		
		//// MOCL

		// Récupérer le .mocl (via fenêtre de dialogue)
//		FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);
//		fileDialog.setText("Sélectionner un fichier de contraintes");
//		fileDialog.setFilterExtensions(new String[] { "*.mocl" });
//		String moclPath = fileDialog.open();
//		// En cas d'annulation de la sélection par l'user
//		if (moclPath == null)
//			return null;
//
//		// Récupérer l'URI du .mocl
//		File moclFile = new File(moclPath);
//		IFile moclIFile = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(moclFile.toURI())[0];
//		URI moclUri = URI.createPlatformResourceURI(moclIFile.getFullPath().toString(), true);
//        URI moclUri = URI.createFileURI(moclPath);
		// Récupérer la Resource du .mocl
		Resource moclResource = resourceSet.getResource(moclUri, true);
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

		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
		selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getSelection();
		Object firstElement = selection.getFirstElement();
		Resource xmiResource = null;
		if (firstElement instanceof XMIResourceImpl) {
			xmiResource = (Resource) firstElement;
			// xmiResource = resourceSet.createResource(((XMIResource)
		} else if (firstElement instanceof EObject) {
			xmiResource = ((EObject) firstElement).eResource();
		} else {
			throw new RuntimeException("Shouldn't be able to call the menu on this : " + firstElement);
		}

		//// RESULTS

		ValidationResult res = OclInterpretor.validate(xmiResource, moclModule);
        boolean hasSkillIssues = res.hasNoError();
        System.out.println("Skill issues ? " + (hasSkillIssues ? "No" : "Yes"));
        if (!hasSkillIssues) {
                Set<ValidationError> errors = res.getErrors();
                for (ValidationError error : errors) {
                        System.out.println("        Error: " + error);
                }
        }
  
  		
  
		return null;
	}
}
