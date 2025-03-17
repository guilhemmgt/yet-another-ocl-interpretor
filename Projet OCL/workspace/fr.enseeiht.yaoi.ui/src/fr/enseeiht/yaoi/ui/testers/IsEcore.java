package fr.enseeiht.yaoi.ui.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * Contrary to what the name suggests, it tests if the selection is an XMI or
 * one of its child.
 */
public class IsEcore extends PropertyTester {
	private static final String PROPERTY_ISECORE = "isecore"; //$NON-NLS-1$

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (PROPERTY_ISECORE.equals(property)) {
			Object firstElement = ((StructuredSelection) receiver).getFirstElement();
			return firstElement.getClass().equals(XMIResourceImpl.class) || firstElement.getClass().equals(DynamicEObjectImpl.class);
		} else {	
			throw new RuntimeException("This property doesn't exist.");
		}
	}
	
}
