/**
 */
package empty;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empty.Liar#getName <em>Name</em>}</li>
 *   <li>{@link empty.Liar#getMaybe <em>Maybe</em>}</li>
 *   <li>{@link empty.Liar#getSubLiar <em>Sub Liar</em>}</li>
 *   <li>{@link empty.Liar#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see empty.EmptyPackage#getLiar()
 * @model
 * @generated
 */
public interface Liar extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see empty.EmptyPackage#getLiar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link empty.Liar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Maybe</b></em>' containment reference list.
	 * The list contents are of type {@link empty.Maybe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maybe</em>' containment reference list.
	 * @see empty.EmptyPackage#getLiar_Maybe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Maybe> getMaybe();

	/**
	 * Returns the value of the '<em><b>Sub Liar</b></em>' containment reference list.
	 * The list contents are of type {@link empty.SubLiar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Liar</em>' containment reference list.
	 * @see empty.EmptyPackage#getLiar_SubLiar()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubLiar> getSubLiar();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link empty.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see empty.Enum
	 * @see #setEnum(empty.Enum)
	 * @see empty.EmptyPackage#getLiar_Enum()
	 * @model
	 * @generated
	 */
	empty.Enum getEnum();

	/**
	 * Sets the value of the '{@link empty.Liar#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see empty.Enum
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(empty.Enum value);
} // Liar
