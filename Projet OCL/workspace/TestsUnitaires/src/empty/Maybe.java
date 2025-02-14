/**
 */
package empty;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maybe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link empty.Maybe#getValue <em>Value</em>}</li>
 *   <li>{@link empty.Maybe#getSubLiar <em>Sub Liar</em>}</li>
 * </ul>
 *
 * @see empty.EmptyPackage#getMaybe()
 * @model
 * @generated
 */
public interface Maybe extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see empty.EmptyPackage#getMaybe_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link empty.Maybe#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Sub Liar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Liar</em>' reference.
	 * @see #setSubLiar(SubLiar)
	 * @see empty.EmptyPackage#getMaybe_SubLiar()
	 * @model
	 * @generated
	 */
	SubLiar getSubLiar();

	/**
	 * Sets the value of the '{@link empty.Maybe#getSubLiar <em>Sub Liar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Liar</em>' reference.
	 * @see #getSubLiar()
	 * @generated
	 */
	void setSubLiar(SubLiar value);
} // Maybe
