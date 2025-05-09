/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getSource <em>Source</em>}</li>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOperatorCallExp()
 * @model
 * @generated
 */
public interface OperatorCallExp extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(OclExpression)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOperatorCallExp_Source()
   * @model containment="true"
   * @generated
   */
  OclExpression getSource();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(OclExpression value);

  /**
   * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Name</em>' attribute.
   * @see #setOperationName(String)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOperatorCallExp_OperationName()
   * @model
   * @generated
   */
  String getOperationName();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getOperationName <em>Operation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Name</em>' attribute.
   * @see #getOperationName()
   * @generated
   */
  void setOperationName(String value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(OperatorCallExp)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOperatorCallExp_Argument()
   * @model containment="true"
   * @generated
   */
  OperatorCallExp getArgument();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OperatorCallExp#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(OperatorCallExp value);

} // OperatorCallExp
