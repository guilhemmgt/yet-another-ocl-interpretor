/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getTokenConsumed <em>Token Consumed</em>}</li>
 *   <li>{@link petrinet.Arc#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link petrinet.Arc#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends NetElement {
	/**
	 * Returns the value of the '<em><b>Token Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Consumed</em>' attribute.
	 * @see #setTokenConsumed(int)
	 * @see petrinet.PetrinetPackage#getArc_TokenConsumed()
	 * @model required="true"
	 * @generated
	 */
	int getTokenConsumed();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTokenConsumed <em>Token Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Consumed</em>' attribute.
	 * @see #getTokenConsumed()
	 * @generated
	 */
	void setTokenConsumed(int value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Bloc#getLinksToSuccessor <em>Links To Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Bloc)
	 * @see petrinet.PetrinetPackage#getArc_Predecessor()
	 * @see petrinet.Bloc#getLinksToSuccessor
	 * @model opposite="linksToSuccessor" required="true"
	 * @generated
	 */
	Bloc getPredecessor();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Bloc value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Bloc#getLinksToPredecessor <em>Links To Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Bloc)
	 * @see petrinet.PetrinetPackage#getArc_Successor()
	 * @see petrinet.Bloc#getLinksToPredecessor
	 * @model opposite="linksToPredecessor" required="true"
	 * @generated
	 */
	Bloc getSuccessor();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Bloc value);

} // Arc
