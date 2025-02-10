/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Bloc#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Bloc#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 *   <li>{@link petrinet.Bloc#getLinksToSuccessor <em>Links To Successor</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getBloc()
 * @model
 * @generated
 */
public interface Bloc extends NetElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getBloc_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Bloc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Links To Predecessor</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessor</em>' reference list.
	 * @see petrinet.PetrinetPackage#getBloc_LinksToPredecessor()
	 * @see petrinet.Arc#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<Arc> getLinksToPredecessor();

	/**
	 * Returns the value of the '<em><b>Links To Successor</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successor</em>' reference list.
	 * @see petrinet.PetrinetPackage#getBloc_LinksToSuccessor()
	 * @see petrinet.Arc#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<Arc> getLinksToSuccessor();

} // Bloc
