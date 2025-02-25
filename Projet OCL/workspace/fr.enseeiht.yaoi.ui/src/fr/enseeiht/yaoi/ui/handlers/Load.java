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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class Load extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
		if (!(editor instanceof IEditingDomainProvider)) {
			throw new RuntimeException("Not an editing-domain-based editor!");
		}
		EditingDomain domain = ((IEditingDomainProvider) editor).getEditingDomain();

		// Let the user pick files from the workspace only
		Shell shell = HandlerUtil.getActiveShell(event);

		List<ViewerFilter> filters = Collections.singletonList(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof IContainer) || ((element instanceof File) && ((File) element).getFileExtension().equals("mocl"));
			}
		});

		IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, "Load Resource", "Select resource(s)", true,
				null, // initial selection
				filters);

		if (files != null && files.length > 0) {
			// Load each selected file into the EditingDomain’s ResourceSet
			for (IFile file : files) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = domain.getResourceSet().getResource(uri, true);
				EcoreUtil.resolveAll(resource);
			}
		}

		return null;
	}
}
