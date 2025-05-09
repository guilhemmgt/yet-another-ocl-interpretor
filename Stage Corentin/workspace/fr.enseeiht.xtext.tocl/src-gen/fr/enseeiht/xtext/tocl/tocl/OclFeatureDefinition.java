/**
 * generated by Xtext 2.32.0
 */
package fr.enseeiht.xtext.tocl.tocl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Feature Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.xtext.tocl.tocl.OclFeatureDefinition#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOclFeatureDefinition()
 * @model
 * @generated
 */
public interface OclFeatureDefinition extends OclModuleElement
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(EObject)
   * @see fr.enseeiht.xtext.tocl.tocl.ToclPackage#getOclFeatureDefinition_Feature()
   * @model containment="true"
   * @generated
   */
  EObject getFeature();

  /**
   * Sets the value of the '{@link fr.enseeiht.xtext.tocl.tocl.OclFeatureDefinition#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(EObject value);

} // OclFeatureDefinition
