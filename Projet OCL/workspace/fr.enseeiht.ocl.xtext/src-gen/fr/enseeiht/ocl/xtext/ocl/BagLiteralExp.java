/**
 * generated by Xtext
 */
package fr.enseeiht.ocl.xtext.ocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bag Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.ocl.xtext.ocl.BagLiteralExp#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.ocl.xtext.ocl.OclPackage#getBagLiteralExp()
 * @model
 * @generated
 */
public interface BagLiteralExp extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.ocl.xtext.ocl.OclExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.enseeiht.ocl.xtext.ocl.OclPackage#getBagLiteralExp_Elements()
   * @model containment="true"
   * @generated
   */
  EList<OclExpression> getElements();

} // BagLiteralExp
