/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl.impl;

import fr.enseeiht.xtext.tocl.tocl.Import;
import fr.enseeiht.xtext.tocl.tocl.OclModuleElement;
import fr.enseeiht.xtext.tocl.tocl.ToclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Module Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.impl.OclModuleElementImpl#getEcoreTypes <em>Ecore Types</em>}</li>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.impl.OclModuleElementImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OclModuleElementImpl extends ModuleElementImpl implements OclModuleElement
{
  /**
   * The cached value of the '{@link #getEcoreTypes() <em>Ecore Types</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreTypes()
   * @generated
   * @ordered
   */
  protected Import ecoreTypes;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EClass class_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OclModuleElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ToclPackage.Literals.OCL_MODULE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import getEcoreTypes()
  {
    if (ecoreTypes != null && ecoreTypes.eIsProxy())
    {
      InternalEObject oldEcoreTypes = (InternalEObject)ecoreTypes;
      ecoreTypes = (Import)eResolveProxy(oldEcoreTypes);
      if (ecoreTypes != oldEcoreTypes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES, oldEcoreTypes, ecoreTypes));
      }
    }
    return ecoreTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetEcoreTypes()
  {
    return ecoreTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEcoreTypes(Import newEcoreTypes)
  {
    Import oldEcoreTypes = ecoreTypes;
    ecoreTypes = newEcoreTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES, oldEcoreTypes, ecoreTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getClass_()
  {
    if (class_ != null && class_.eIsProxy())
    {
      InternalEObject oldClass = (InternalEObject)class_;
      class_ = (EClass)eResolveProxy(oldClass);
      if (class_ != oldClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToclPackage.OCL_MODULE_ELEMENT__CLASS, oldClass, class_));
      }
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClass(EClass newClass)
  {
    EClass oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToclPackage.OCL_MODULE_ELEMENT__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES:
        if (resolve) return getEcoreTypes();
        return basicGetEcoreTypes();
      case ToclPackage.OCL_MODULE_ELEMENT__CLASS:
        if (resolve) return getClass_();
        return basicGetClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES:
        setEcoreTypes((Import)newValue);
        return;
      case ToclPackage.OCL_MODULE_ELEMENT__CLASS:
        setClass((EClass)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES:
        setEcoreTypes((Import)null);
        return;
      case ToclPackage.OCL_MODULE_ELEMENT__CLASS:
        setClass((EClass)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ToclPackage.OCL_MODULE_ELEMENT__ECORE_TYPES:
        return ecoreTypes != null;
      case ToclPackage.OCL_MODULE_ELEMENT__CLASS:
        return class_ != null;
    }
    return super.eIsSet(featureID);
  }

} //OclModuleElementImpl
