/**
 */
package empty.impl;

import empty.EmptyPackage;
import empty.Maybe;

import empty.SubLiar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maybe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empty.impl.MaybeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link empty.impl.MaybeImpl#getSubLiar <em>Sub Liar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaybeImpl extends MinimalEObjectImpl.Container implements Maybe {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSubLiar() <em>Sub Liar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLiar()
	 * @generated
	 * @ordered
	 */
	protected SubLiar subLiar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaybeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmptyPackage.Literals.MAYBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmptyPackage.MAYBE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubLiar getSubLiar() {
		if (subLiar != null && subLiar.eIsProxy()) {
			InternalEObject oldSubLiar = (InternalEObject)subLiar;
			subLiar = (SubLiar)eResolveProxy(oldSubLiar);
			if (subLiar != oldSubLiar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmptyPackage.MAYBE__SUB_LIAR, oldSubLiar, subLiar));
			}
		}
		return subLiar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLiar basicGetSubLiar() {
		return subLiar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubLiar(SubLiar newSubLiar) {
		SubLiar oldSubLiar = subLiar;
		subLiar = newSubLiar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmptyPackage.MAYBE__SUB_LIAR, oldSubLiar, subLiar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmptyPackage.MAYBE__VALUE:
				return getValue();
			case EmptyPackage.MAYBE__SUB_LIAR:
				if (resolve) return getSubLiar();
				return basicGetSubLiar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmptyPackage.MAYBE__VALUE:
				setValue((Integer)newValue);
				return;
			case EmptyPackage.MAYBE__SUB_LIAR:
				setSubLiar((SubLiar)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmptyPackage.MAYBE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EmptyPackage.MAYBE__SUB_LIAR:
				setSubLiar((SubLiar)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmptyPackage.MAYBE__VALUE:
				return value != VALUE_EDEFAULT;
			case EmptyPackage.MAYBE__SUB_LIAR:
				return subLiar != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //MaybeImpl
