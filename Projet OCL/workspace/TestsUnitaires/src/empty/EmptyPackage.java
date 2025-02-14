/**
 */
package empty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see empty.EmptyFactory
 * @model kind="package"
 * @generated
 */
public interface EmptyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "empty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://empty";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "empty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmptyPackage eINSTANCE = empty.impl.EmptyPackageImpl.init();

	/**
	 * The meta object id for the '{@link empty.impl.LiarImpl <em>Liar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empty.impl.LiarImpl
	 * @see empty.impl.EmptyPackageImpl#getLiar()
	 * @generated
	 */
	int LIAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Maybe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR__MAYBE = 1;

	/**
	 * The feature id for the '<em><b>Sub Liar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR__SUB_LIAR = 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR__ENUM = 3;

	/**
	 * The number of structural features of the '<em>Liar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Liar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIAR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link empty.impl.MaybeImpl <em>Maybe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empty.impl.MaybeImpl
	 * @see empty.impl.EmptyPackageImpl#getMaybe()
	 * @generated
	 */
	int MAYBE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Sub Liar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE__SUB_LIAR = 1;

	/**
	 * The number of structural features of the '<em>Maybe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Maybe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYBE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link empty.impl.SubLiarImpl <em>Sub Liar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empty.impl.SubLiarImpl
	 * @see empty.impl.EmptyPackageImpl#getSubLiar()
	 * @generated
	 */
	int SUB_LIAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR__NAME = LIAR__NAME;

	/**
	 * The feature id for the '<em><b>Maybe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR__MAYBE = LIAR__MAYBE;

	/**
	 * The feature id for the '<em><b>Sub Liar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR__SUB_LIAR = LIAR__SUB_LIAR;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR__ENUM = LIAR__ENUM;

	/**
	 * The number of structural features of the '<em>Sub Liar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR_FEATURE_COUNT = LIAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Liar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_LIAR_OPERATION_COUNT = LIAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link empty.Enum <em>Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see empty.Enum
	 * @see empty.impl.EmptyPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 3;


	/**
	 * Returns the meta object for class '{@link empty.Liar <em>Liar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liar</em>'.
	 * @see empty.Liar
	 * @generated
	 */
	EClass getLiar();

	/**
	 * Returns the meta object for the attribute '{@link empty.Liar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see empty.Liar#getName()
	 * @see #getLiar()
	 * @generated
	 */
	EAttribute getLiar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link empty.Liar#getMaybe <em>Maybe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maybe</em>'.
	 * @see empty.Liar#getMaybe()
	 * @see #getLiar()
	 * @generated
	 */
	EReference getLiar_Maybe();

	/**
	 * Returns the meta object for the containment reference list '{@link empty.Liar#getSubLiar <em>Sub Liar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Liar</em>'.
	 * @see empty.Liar#getSubLiar()
	 * @see #getLiar()
	 * @generated
	 */
	EReference getLiar_SubLiar();

	/**
	 * Returns the meta object for the attribute '{@link empty.Liar#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see empty.Liar#getEnum()
	 * @see #getLiar()
	 * @generated
	 */
	EAttribute getLiar_Enum();

	/**
	 * Returns the meta object for class '{@link empty.Maybe <em>Maybe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maybe</em>'.
	 * @see empty.Maybe
	 * @generated
	 */
	EClass getMaybe();

	/**
	 * Returns the meta object for the attribute '{@link empty.Maybe#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see empty.Maybe#getValue()
	 * @see #getMaybe()
	 * @generated
	 */
	EAttribute getMaybe_Value();

	/**
	 * Returns the meta object for the reference '{@link empty.Maybe#getSubLiar <em>Sub Liar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Liar</em>'.
	 * @see empty.Maybe#getSubLiar()
	 * @see #getMaybe()
	 * @generated
	 */
	EReference getMaybe_SubLiar();

	/**
	 * Returns the meta object for class '{@link empty.SubLiar <em>Sub Liar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Liar</em>'.
	 * @see empty.SubLiar
	 * @generated
	 */
	EClass getSubLiar();

	/**
	 * Returns the meta object for enum '{@link empty.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum</em>'.
	 * @see empty.Enum
	 * @generated
	 */
	EEnum getEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmptyFactory getEmptyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link empty.impl.LiarImpl <em>Liar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empty.impl.LiarImpl
		 * @see empty.impl.EmptyPackageImpl#getLiar()
		 * @generated
		 */
		EClass LIAR = eINSTANCE.getLiar();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIAR__NAME = eINSTANCE.getLiar_Name();
		/**
		 * The meta object literal for the '<em><b>Maybe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIAR__MAYBE = eINSTANCE.getLiar_Maybe();
		/**
		 * The meta object literal for the '<em><b>Sub Liar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIAR__SUB_LIAR = eINSTANCE.getLiar_SubLiar();
		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIAR__ENUM = eINSTANCE.getLiar_Enum();
		/**
		 * The meta object literal for the '{@link empty.impl.MaybeImpl <em>Maybe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empty.impl.MaybeImpl
		 * @see empty.impl.EmptyPackageImpl#getMaybe()
		 * @generated
		 */
		EClass MAYBE = eINSTANCE.getMaybe();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAYBE__VALUE = eINSTANCE.getMaybe_Value();
		/**
		 * The meta object literal for the '<em><b>Sub Liar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAYBE__SUB_LIAR = eINSTANCE.getMaybe_SubLiar();
		/**
		 * The meta object literal for the '{@link empty.impl.SubLiarImpl <em>Sub Liar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empty.impl.SubLiarImpl
		 * @see empty.impl.EmptyPackageImpl#getSubLiar()
		 * @generated
		 */
		EClass SUB_LIAR = eINSTANCE.getSubLiar();
		/**
		 * The meta object literal for the '{@link empty.Enum <em>Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see empty.Enum
		 * @see empty.impl.EmptyPackageImpl#getEnum()
		 * @generated
		 */
		EEnum ENUM = eINSTANCE.getEnum();

	}

} //EmptyPackage
