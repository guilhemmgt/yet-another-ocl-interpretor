/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Net#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Net#getNetElements <em>Net Elements</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Net#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Net Elements</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.NetElement}.
	 * It is bidirectional and its opposite is '{@link petrinet.NetElement#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Elements</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNet_NetElements()
	 * @see petrinet.NetElement#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<NetElement> getNetElements();

} // Net
