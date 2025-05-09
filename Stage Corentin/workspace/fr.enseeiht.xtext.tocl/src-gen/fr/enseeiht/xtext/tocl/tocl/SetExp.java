/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.SetExp#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getSetExp()
 * @model
 * @generated
 */
public interface SetExp extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.xtext.tocl.tocl.OclExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getSetExp_Elements()
   * @model containment="true"
   * @generated
   */
  EList<OclExpression> getElements();

} // SetExp
