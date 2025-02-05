/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Arc;
import petrinet.Bloc;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.BlocImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.impl.BlocImpl#getLinksToPredecessor <em>Links To Predecessor</em>}</li>
 *   <li>{@link petrinet.impl.BlocImpl#getLinksToSuccessor <em>Links To Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlocImpl extends NetElementImpl implements Bloc {
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
	 * The cached value of the '{@link #getLinksToPredecessor() <em>Links To Predecessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToPredecessor;

	/**
	 * The cached value of the '{@link #getLinksToSuccessor() <em>Links To Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> linksToSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.BLOC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.BLOC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLinksToPredecessor() {
		if (linksToPredecessor == null) {
			linksToPredecessor = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR, PetrinetPackage.ARC__SUCCESSOR);
		}
		return linksToPredecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arc> getLinksToSuccessor() {
		if (linksToSuccessor == null) {
			linksToSuccessor = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR, PetrinetPackage.ARC__PREDECESSOR);
		}
		return linksToSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToPredecessor()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToSuccessor()).basicAdd(otherEnd, msgs);
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
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				return ((InternalEList<?>)getLinksToPredecessor()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				return ((InternalEList<?>)getLinksToSuccessor()).basicRemove(otherEnd, msgs);
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
			case PetrinetPackage.BLOC__NAME:
				return getName();
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				return getLinksToPredecessor();
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				return getLinksToSuccessor();
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
			case PetrinetPackage.BLOC__NAME:
				setName((String)newValue);
				return;
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				getLinksToPredecessor().clear();
				getLinksToPredecessor().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				getLinksToSuccessor().clear();
				getLinksToSuccessor().addAll((Collection<? extends Arc>)newValue);
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
			case PetrinetPackage.BLOC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				getLinksToPredecessor().clear();
				return;
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				getLinksToSuccessor().clear();
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
			case PetrinetPackage.BLOC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetrinetPackage.BLOC__LINKS_TO_PREDECESSOR:
				return linksToPredecessor != null && !linksToPredecessor.isEmpty();
			case PetrinetPackage.BLOC__LINKS_TO_SUCCESSOR:
				return linksToSuccessor != null && !linksToSuccessor.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BlocImpl
