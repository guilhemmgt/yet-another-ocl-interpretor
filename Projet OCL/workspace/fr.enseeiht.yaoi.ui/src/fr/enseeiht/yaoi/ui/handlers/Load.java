package fr.enseeiht.yaoi.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class Load extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IEditorPart editor = HandlerUtil.getActiveEditorChecked(event);
		if (!(editor instanceof IEditingDomainProvider)) {
			throw new RuntimeException("???");
		}
		EditingDomain editorDomain = ((IEditingDomainProvider) editor).getEditingDomain();
		LoadResourceAction load = new LoadResourceAction(editorDomain);
		load.run();

		return null;
	}
}
