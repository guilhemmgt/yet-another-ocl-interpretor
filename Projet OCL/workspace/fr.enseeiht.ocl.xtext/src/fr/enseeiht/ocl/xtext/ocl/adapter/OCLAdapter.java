package fr.enseeiht.ocl.xtext.ocl.adapter;

import org.eclipse.emf.ecore.EObject;

import fr.enseeiht.ocl.xtext.OCLType;
public interface OCLAdapter {

	/**
	 * Returns the value of the element given its context
	 * @param Target
	 * @return value of the element
	 */
	public Object getValue(EObject contextTarget);

	/**
	 * Get the type of the element
	 * @return type of the element
	 */
	public OCLType getType();
	
	/**
	 * Get adapted element
	 * @return adapted element
	 */
	public EObject getElement();
}
