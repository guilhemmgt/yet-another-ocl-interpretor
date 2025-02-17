/**
 */
package empty.impl;

import empty.EmptyPackage;
import empty.Liar;

import empty.Maybe;
import empty.SubLiar;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link empty.impl.LiarImpl#getName <em>Name</em>}</li>
 *   <li>{@link empty.impl.LiarImpl#getMaybe <em>Maybe</em>}</li>
 *   <li>{@link empty.impl.LiarImpl#getSubLiar <em>Sub Liar</em>}</li>
 *   <li>{@link empty.impl.LiarImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiarImpl extends MinimalEObjectImpl.Container implements Liar {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMaybe() <em>Maybe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaybe()
	 * @generated
	 * @ordered
	 */
	protected EList<Maybe> maybe;
	/**
	 * The cached value of the '{@link #getSubLiar() <em>Sub Liar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLiar()
	 * @generated
	 * @ordered
	 */
	protected EList<SubLiar> subLiar;
	/**
	 * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected static final empty.Enum ENUM_EDEFAULT = empty.Enum.ENUM1;
	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected empty.Enum enum_ = ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmptyPackage.Literals.LIAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmptyPackage.LIAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Maybe> getMaybe() {
		if (maybe == null) {
			maybe = new EObjectContainmentEList<Maybe>(Maybe.class, this, EmptyPackage.LIAR__MAYBE);
		}
		return maybe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubLiar> getSubLiar() {
		if (subLiar == null) {
			subLiar = new EObjectContainmentEList<SubLiar>(SubLiar.class, this, EmptyPackage.LIAR__SUB_LIAR);
		}
		return subLiar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public empty.Enum getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(empty.Enum newEnum) {
		empty.Enum oldEnum = enum_;
		enum_ = newEnum == null ? ENUM_EDEFAULT : newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmptyPackage.LIAR__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmptyPackage.LIAR__MAYBE:
				return ((InternalEList<?>)getMaybe()).basicRemove(otherEnd, msgs);
			case EmptyPackage.LIAR__SUB_LIAR:
				return ((InternalEList<?>)getSubLiar()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmptyPackage.LIAR__NAME:
				return getName();
			case EmptyPackage.LIAR__MAYBE:
				return getMaybe();
			case EmptyPackage.LIAR__SUB_LIAR:
				return getSubLiar();
			case EmptyPackage.LIAR__ENUM:
				return getEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmptyPackage.LIAR__NAME:
				setName((String)newValue);
				return;
			case EmptyPackage.LIAR__MAYBE:
				getMaybe().clear();
				getMaybe().addAll((Collection<? extends Maybe>)newValue);
				return;
			case EmptyPackage.LIAR__SUB_LIAR:
				getSubLiar().clear();
				getSubLiar().addAll((Collection<? extends SubLiar>)newValue);
				return;
			case EmptyPackage.LIAR__ENUM:
				setEnum((empty.Enum)newValue);
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
			case EmptyPackage.LIAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmptyPackage.LIAR__MAYBE:
				getMaybe().clear();
				return;
			case EmptyPackage.LIAR__SUB_LIAR:
				getSubLiar().clear();
				return;
			case EmptyPackage.LIAR__ENUM:
				setEnum(ENUM_EDEFAULT);
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
			case EmptyPackage.LIAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmptyPackage.LIAR__MAYBE:
				return maybe != null && !maybe.isEmpty();
			case EmptyPackage.LIAR__SUB_LIAR:
				return subLiar != null && !subLiar.isEmpty();
			case EmptyPackage.LIAR__ENUM:
				return enum_ != ENUM_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}

} //LiarImpl
