/**
 */
package empty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see empty.EmptyPackage
 * @generated
 */
public interface EmptyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmptyFactory eINSTANCE = empty.impl.EmptyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Liar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liar</em>'.
	 * @generated
	 */
	Liar createLiar();

	/**
	 * Returns a new object of class '<em>Maybe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maybe</em>'.
	 * @generated
	 */
	Maybe createMaybe();

	/**
	 * Returns a new object of class '<em>Sub Liar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Liar</em>'.
	 * @generated
	 */
	SubLiar createSubLiar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmptyPackage getEmptyPackage();

} //EmptyFactory
