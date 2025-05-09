/**
 * generated by Xtext
 */
package fr.enseeiht.ocl.xtext.ocl;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementClass#getModel <em>Model</em>}</li>
 *   <li>{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementClass#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.ocl.xtext.ocl.OclPackage#getOclModelElementClass()
 * @model
 * @generated
 */
public interface OclModelElementClass extends OclTypeLiteral
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(Import)
   * @see fr.enseeiht.ocl.xtext.ocl.OclPackage#getOclModelElementClass_Model()
   * @model
   * @generated
   */
  Import getModel();

  /**
   * Sets the value of the '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementClass#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(Import value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EClassifier)
   * @see fr.enseeiht.ocl.xtext.ocl.OclPackage#getOclModelElementClass_Name()
   * @model
   * @generated
   */
  EClassifier getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.ocl.xtext.ocl.OclModelElementClass#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EClassifier value);

} // OclModelElementClass
