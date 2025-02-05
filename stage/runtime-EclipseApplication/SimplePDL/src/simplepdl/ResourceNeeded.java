/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Needed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.ResourceNeeded#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.ResourceNeeded#getLinkToWD <em>Link To WD</em>}</li>
 *   <li>{@link simplepdl.ResourceNeeded#getTakes <em>Takes</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResourceNeeded()
 * @model
 * @generated
 */
public interface ResourceNeeded extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getResourceNeeded_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceNeeded#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Link To WD</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getNeed <em>Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To WD</em>' reference.
	 * @see #setLinkToWD(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getResourceNeeded_LinkToWD()
	 * @see simplepdl.WorkDefinition#getNeed
	 * @model opposite="need" required="true"
	 * @generated
	 */
	WorkDefinition getLinkToWD();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceNeeded#getLinkToWD <em>Link To WD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To WD</em>' reference.
	 * @see #getLinkToWD()
	 * @generated
	 */
	void setLinkToWD(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Takes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes</em>' reference.
	 * @see #setTakes(Resource)
	 * @see simplepdl.SimplepdlPackage#getResourceNeeded_Takes()
	 * @model required="true"
	 * @generated
	 */
	Resource getTakes();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceNeeded#getTakes <em>Takes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takes</em>' reference.
	 * @see #getTakes()
	 * @generated
	 */
	void setTakes(Resource value);

} // ResourceNeeded
