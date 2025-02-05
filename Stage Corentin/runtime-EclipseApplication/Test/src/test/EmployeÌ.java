/**
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employé</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.Employé#getManage <em>Manage</em>}</li>
 *   <li>{@link test.Employé#getManager <em>Manager</em>}</li>
 *   <li>{@link test.Employé#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getEmployé()
 * @model
 * @generated
 */
public interface Employé extends EObject {
	/**
	 * Returns the value of the '<em><b>Manage</b></em>' reference list.
	 * The list contents are of type {@link test.Employé}.
	 * It is bidirectional and its opposite is '{@link test.Employé#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage</em>' reference list.
	 * @see test.TestPackage#getEmployé_Manage()
	 * @see test.Employé#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Employé> getManage();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link test.Employé#getManage <em>Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employé)
	 * @see test.TestPackage#getEmployé_Manager()
	 * @see test.Employé#getManage
	 * @model opposite="manage"
	 * @generated
	 */
	Employé getManager();

	/**
	 * Sets the value of the '{@link test.Employé#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employé value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see test.TestPackage#getEmployé_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link test.Employé#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Employé
