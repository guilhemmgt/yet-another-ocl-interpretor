/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplepdl.Resource;
import simplepdl.ResourceNeeded;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Needed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.ResourceNeededImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.impl.ResourceNeededImpl#getLinkToWD <em>Link To WD</em>}</li>
 *   <li>{@link simplepdl.impl.ResourceNeededImpl#getTakes <em>Takes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceNeededImpl extends ProcessElementImpl implements ResourceNeeded {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkToWD() <em>Link To WD</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToWD()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition linkToWD;

	/**
	 * The cached value of the '{@link #getTakes() <em>Takes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakes()
	 * @generated
	 * @ordered
	 */
	protected Resource takes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceNeededImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.RESOURCE_NEEDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESOURCE_NEEDED__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkDefinition getLinkToWD() {
		if (linkToWD != null && linkToWD.eIsProxy()) {
			InternalEObject oldLinkToWD = (InternalEObject)linkToWD;
			linkToWD = (WorkDefinition)eResolveProxy(oldLinkToWD);
			if (linkToWD != oldLinkToWD) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD, oldLinkToWD, linkToWD));
			}
		}
		return linkToWD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetLinkToWD() {
		return linkToWD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToWD(WorkDefinition newLinkToWD, NotificationChain msgs) {
		WorkDefinition oldLinkToWD = linkToWD;
		linkToWD = newLinkToWD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD, oldLinkToWD, newLinkToWD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkToWD(WorkDefinition newLinkToWD) {
		if (newLinkToWD != linkToWD) {
			NotificationChain msgs = null;
			if (linkToWD != null)
				msgs = ((InternalEObject)linkToWD).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
			if (newLinkToWD != null)
				msgs = ((InternalEObject)newLinkToWD).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
			msgs = basicSetLinkToWD(newLinkToWD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD, newLinkToWD, newLinkToWD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getTakes() {
		if (takes != null && takes.eIsProxy()) {
			InternalEObject oldTakes = (InternalEObject)takes;
			takes = (Resource)eResolveProxy(oldTakes);
			if (takes != oldTakes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.RESOURCE_NEEDED__TAKES, oldTakes, takes));
			}
		}
		return takes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetTakes() {
		return takes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTakes(Resource newTakes) {
		Resource oldTakes = takes;
		takes = newTakes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.RESOURCE_NEEDED__TAKES, oldTakes, takes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				if (linkToWD != null)
					msgs = ((InternalEObject)linkToWD).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__NEED, WorkDefinition.class, msgs);
				return basicSetLinkToWD((WorkDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				return basicSetLinkToWD(null, msgs);
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
			case SimplepdlPackage.RESOURCE_NEEDED__QUANTITY:
				return getQuantity();
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				if (resolve) return getLinkToWD();
				return basicGetLinkToWD();
			case SimplepdlPackage.RESOURCE_NEEDED__TAKES:
				if (resolve) return getTakes();
				return basicGetTakes();
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
			case SimplepdlPackage.RESOURCE_NEEDED__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				setLinkToWD((WorkDefinition)newValue);
				return;
			case SimplepdlPackage.RESOURCE_NEEDED__TAKES:
				setTakes((Resource)newValue);
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
			case SimplepdlPackage.RESOURCE_NEEDED__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				setLinkToWD((WorkDefinition)null);
				return;
			case SimplepdlPackage.RESOURCE_NEEDED__TAKES:
				setTakes((Resource)null);
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
			case SimplepdlPackage.RESOURCE_NEEDED__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case SimplepdlPackage.RESOURCE_NEEDED__LINK_TO_WD:
				return linkToWD != null;
			case SimplepdlPackage.RESOURCE_NEEDED__TAKES:
				return takes != null;
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //ResourceNeededImpl
