/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl.impl;

import fr.enseeiht.xtext.tocl.tocl.LocalVariable;
import fr.enseeiht.xtext.tocl.tocl.OclExpression;
import fr.enseeiht.xtext.tocl.tocl.ToclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.impl.LocalVariableImpl#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalVariableImpl extends AuxiliaryImpl implements LocalVariable
{
  /**
   * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitExpression()
   * @generated
   * @ordered
   */
  protected OclExpression initExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalVariableImpl()
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
    return ToclPackage.Literals.LOCAL_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OclExpression getInitExpression()
  {
    return initExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitExpression(OclExpression newInitExpression, NotificationChain msgs)
  {
    OclExpression oldInitExpression = initExpression;
    initExpression = newInitExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION, oldInitExpression, newInitExpression);
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
  public void setInitExpression(OclExpression newInitExpression)
  {
    if (newInitExpression != initExpression)
    {
      NotificationChain msgs = null;
      if (initExpression != null)
        msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION, null, msgs);
      if (newInitExpression != null)
        msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION, null, msgs);
      msgs = basicSetInitExpression(newInitExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION, newInitExpression, newInitExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION:
        return basicSetInitExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION:
        return getInitExpression();
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
      case ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION:
        setInitExpression((OclExpression)newValue);
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
      case ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION:
        setInitExpression((OclExpression)null);
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
      case ToclPackage.LOCAL_VARIABLE__INIT_EXPRESSION:
        return initExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalVariableImpl
