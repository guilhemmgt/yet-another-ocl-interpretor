/**
 * generated by Xtext
 */
package fr.enseeiht.ocl.xtext.ocl.impl;

import fr.enseeiht.ocl.xtext.ocl.Import;
import fr.enseeiht.ocl.xtext.ocl.OclModelElementClass;
import fr.enseeiht.ocl.xtext.ocl.OclPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.ocl.xtext.ocl.impl.OclModelElementClassImpl#getModel <em>Model</em>}</li>
 *   <li>{@link fr.enseeiht.ocl.xtext.ocl.impl.OclModelElementClassImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OclModelElementClassImpl extends OclTypeLiteralImpl implements OclModelElementClass
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected Import model;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EClassifier name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OclModelElementClassImpl()
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
    return OclPackage.Literals.OCL_MODEL_ELEMENT_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import getModel()
  {
    if (model != null && model.eIsProxy())
    {
      InternalEObject oldModel = (InternalEObject)model;
      model = (Import)eResolveProxy(oldModel);
      if (model != oldModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL, oldModel, model));
      }
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModel(Import newModel)
  {
    Import oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClassifier getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (EClassifier)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(EClassifier newName)
  {
    EClassifier oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME, oldName, name));
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
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL:
        if (resolve) return getModel();
        return basicGetModel();
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME:
        if (resolve) return getName();
        return basicGetName();
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
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL:
        setModel((Import)newValue);
        return;
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME:
        setName((EClassifier)newValue);
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
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL:
        setModel((Import)null);
        return;
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME:
        setName((EClassifier)null);
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
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__MODEL:
        return model != null;
      case OclPackage.OCL_MODEL_ELEMENT_CLASS__NAME:
        return name != null;
    }
    return super.eIsSet(featureID);
  }

} //OclModelElementClassImpl
