package fr.enseeiht.yaoi.ui.handlers;

import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.PlatformUI;
import fr.enseeiht.ocl.xtext.ocl.Module;
import fr.enseeiht.yaoi.OclInterpretor;
import fr.enseeiht.yaoi.ValidationError;
import fr.enseeiht.yaoi.ValidationResult;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		System.out.println("executing yaoi...");

		ResourceSet resourceSet = new ResourceSetImpl();
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);

		
		//// XMI 
		
		// Récupérer le .xmi (via fenêtre de dialogue)
		fileDialog.setText("Sélectionner un XMI");
		fileDialog.setFilterExtensions(new String[] { "*.xmi" });
		String xmiPath = fileDialog.open();

		// En cas d'annulation de la sélection par l'user
		if (xmiPath == null)
			return null;
		
		URI xmiUri = URI.createFileURI(xmiPath);
		Resource xmiResource = resourceSet.createResource(xmiUri);
		
		
		//// MOCL
		
		// Récupérer le .mocl (via fenêtre de dialogue)
		fileDialog.setText("Sélectionner un MOCL");
		fileDialog.setFilterExtensions(new String[] { "*.mocl" });
		String moclPath = fileDialog.open();

		// En cas d'annulation de la sélection par l'user
		if (moclPath == null)
			return null;

		// Récupérer l'URI du .mocl
		URI moclUri = URI.createFileURI(moclPath);

		// Récupérer la Resource du .mocl
		Resource moclResource = resourceSet.getResource(moclUri, true);
		
		// Récupérer le Module MOCL
		Module moclModule = (Module) moclResource.getContents().get(0);


		
		ValidationResult res = OclInterpretor.validate(xmiResource, moclModule);
		boolean hasSkillIssues = res.hasNoError();
		System.out.println("Skill issues ? " + (hasSkillIssues ? "No" : "Yes"));
		if (!hasSkillIssues) {
			Set<ValidationError> errors = res.getErrors();
			for (ValidationError error : errors) {
				System.out.println("	Error: " + error);
			}
		}
		
		return null;
	}
}


