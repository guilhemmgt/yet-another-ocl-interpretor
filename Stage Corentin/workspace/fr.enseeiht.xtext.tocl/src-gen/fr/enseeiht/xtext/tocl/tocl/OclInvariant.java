/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OclInvariant#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OclInvariant#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOclInvariant()
 * @model
 * @generated
 */
public interface OclInvariant extends OclModuleElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOclInvariant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OclInvariant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(OclExpression)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOclInvariant_Body()
   * @model containment="true"
   * @generated
   */
  OclExpression getBody();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OclInvariant#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(OclExpression value);

} // OclInvariant
