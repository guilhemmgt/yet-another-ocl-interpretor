/**
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.Employe#getManage <em>Manage</em>}</li>
 *   <li>{@link test.Employe#getManager <em>Manager</em>}</li>
 *   <li>{@link test.Employe#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getEmploye()
 * @model
 * @generated
 */
public interface Employe extends EObject {
	/**
	 * Returns the value of the '<em><b>Manage</b></em>' reference list.
	 * The list contents are of type {@link test.Employe}.
	 * It is bidirectional and its opposite is '{@link test.Employe#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manage</em>' reference list.
	 * @see test.TestPackage#getEmploye_Manage()
	 * @see test.Employe#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Employe> getManage();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link test.Employe#getManage <em>Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employe)
	 * @see test.TestPackage#getEmploye_Manager()
	 * @see test.Employe#getManage
	 * @model opposite="manage"
	 * @generated
	 */
	Employe getManager();

	/**
	 * Sets the value of the '{@link test.Employe#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employe value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see test.TestPackage#getEmploye_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link test.Employe#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Employe
