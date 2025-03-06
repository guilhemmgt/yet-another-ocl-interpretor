package fr.enseeiht.yaoi.ui.others;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ScrollableDialog extends TitleAreaDialog {
	private String title;
	private String text;
	private String scrollableText;
	private Status status;
	
	public static enum Status {
		SUCCESS, ERROR;
	}

	public ScrollableDialog(Shell parentShell, String title, String text, String scrollableText, Status status) {
		super(parentShell);
		this.title = title;
		this.text = text;
		this.scrollableText = scrollableText;
		this.status = status;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);

		composite.setLayout(new GridLayout(1, false));

		// Create text field with scroll bars
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.verticalAlignment = GridData.FILL;

		Text scrollable = new Text(composite, SWT.BORDER | SWT.V_SCROLL | SWT.WRAP | SWT.MULTI);
		scrollable.setLayoutData(gridData);
		scrollable.setText(scrollableText);

		return composite;
	}

	@Override
	public void create() {
		super.create();
		
		String imageId = status == Status.SUCCESS ? YaoiUi.SUCCESS_IMAGE_ID : YaoiUi.ERROR_IMAGE_ID;
		Image image = YaoiUi.getInstance().getImageRegistry().get(imageId);
		
		getShell().setSize (600, 300);
		setTitle(title);
		setMessage(text);
		setTitleImage(image);

	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button okButton = createButton(parent, OK, "OK", true);
		okButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				close();
			}
		});
	}

	@Override
	protected boolean isResizable() {
		return true; // Allow the user to change the dialog size!
	}
}