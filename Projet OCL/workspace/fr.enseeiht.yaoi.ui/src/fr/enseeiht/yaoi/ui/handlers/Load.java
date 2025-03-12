package fr.enseeiht.yaoi.ui.handlers;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.Module;

import fr.enseeiht.yaoi.ui.others.YaoiConsole;

/**
 * Handler for loading MOCL resources into the active editor.
 * <p>
 * This handler implements the functionality to select and load MOCL files
 * into the current EMF-based editor. It opens a file selection dialog
 * filtered to show only MOCL files, and then loads the selected files
 * into the editor's resource set.
 * </p>
 * 
 */
public class Load extends AbstractHandler {
    /**
     * Executes the command to load MOCL resources.
     * <p>
     * This method performs the following steps:
     * <ol>
     *   <li>Gets the active editor and verifies it provides an editing domain</li>
     *   <li>Opens a file selection dialog filtered to show only MOCL files</li>
     *   <li>Loads the selected files into the editor's resource set</li>
     *   <li>Resolves all cross-references in the loaded resources</li>
     * </ol>
     * </p>
     * 
     * @param event The execution event containing information about the command execution context
     * @return null (as per {@link AbstractHandler} contract)
     * @throws ExecutionException If an error occurs during command execution
     */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			// Récuperer l'éditeur courant
			IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
			if (!(editor instanceof IEditingDomainProvider)) {
				throw new RuntimeException("Not an editing-domain-based editor!");
			}
			EditingDomain domain = ((IEditingDomainProvider) editor).getEditingDomain();

			// // Je laisse ça pour des générations futures, ça ne marche pas mais c'est l'idée que j'avais pour enregistrer un EValidator
			
			//		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
			//		selection = (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
			//				.getSelection();
			//		Object firstElement = selection.getFirstElement();
			//		Resource xmiResource = null;
			//		if (firstElement instanceof XMIResourceImpl) {
			//			xmiResource = (Resource) firstElement;
			//		} else if (firstElement instanceof EObject) {
			//			xmiResource = ((EObject) firstElement).eResource();
			//		} else {
			//			throw new RuntimeException("Shouldn't be able to call the menu on this : " + firstElement);
			//		}
			//		EPackage ePackage = xmiResource.getContents().get(0).eClass().getEPackage();
			//		EValidator.Registry.INSTANCE.put(EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI()), new OclEValidator());

			// Find the Ecore model used by the active XMI (first resource on the set)
            String xmiEcoreNsUri = null;
            for (Resource res : domain.getResourceSet().getResources()) {
                if (!res.getContents().isEmpty()) {
                    EObject rootObject = res.getContents().get(0);
                    xmiEcoreNsUri = rootObject.eClass().getEPackage().getNsURI();
                    break;
                }
            }

            if (xmiEcoreNsUri == null) {
                throw new RuntimeException("Could not determine the Ecore model of the active XMI file.");
            }
            // TODO : Transform this into platform uri or smth
            YaoiConsole.out.println(xmiEcoreNsUri);
			
			// Récupère l'environnement de la fenêtre active
			Shell shell = HandlerUtil.getActiveShell(event);

			// Filtre les élments pour n'avoir que des .mocl
			List<ViewerFilter> filters = Collections.singletonList(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof IContainer)
							|| ((element instanceof File) && ((File) element).getFileExtension().equals("mocl"));
				}
			});

			// Selection en elle même
			IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, "Load Resource", "Select resource(s)",
					true, null, // initial selection
					filters);

			// Ajoute à l'éditeur tous les .mocl séléctionnés.
			if (files != null && files.length > 0) {
				for (IFile file : files) {
					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					
					ResourceSet tempSet = new ResourceSetImpl();
                    // Load the MOCL file in the temporary set
                    Resource tempResource = tempSet.getResource(uri, true);
                    EcoreUtil.resolveAll(tempResource);
                    
                    Module tempMocl = (Module) tempResource.getContents().get(0);
                    
                    if (tempMocl.getImports().get(0).getPackage().getNsURI().equals(xmiEcoreNsUri)) {
                        // If the MOCL file doesn't import incompatible Ecore models, load it into the editor
                        Resource resource = domain.getResourceSet().getResource(uri, true);
                        EcoreUtil.resolveAll(resource);
                        YaoiConsole.out.println("Successfully loaded: " + file.getName());
                    } else {
        				MessageDialog.openError(shell, "Invalid Mocl",
        						"The Ecore this MOCL imports is not the same as this XMI's");
        				return null;
                    }
				}
			}
		} catch (Exception e) {
			YaoiConsole.printStackTrace(e);
		}
		return null;
	}
}
