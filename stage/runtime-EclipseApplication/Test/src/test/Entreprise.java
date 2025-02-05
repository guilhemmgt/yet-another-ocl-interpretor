/**
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entreprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.Entreprise#getEmploie <em>Emploie</em>}</li>
 *   <li>{@link test.Entreprise#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getEntreprise()
 * @model
 * @generated
 */
public interface Entreprise extends EObject {
	/**
	 * Returns the value of the '<em><b>Emploie</b></em>' containment reference list.
	 * The list contents are of type {@link test.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emploie</em>' containment reference list.
	 * @see test.TestPackage#getEntreprise_Emploie()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employe> getEmploie();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see test.TestPackage#getEntreprise_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link test.Entreprise#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Entreprise
