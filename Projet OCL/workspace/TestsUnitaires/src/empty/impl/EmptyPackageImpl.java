/**
 */
package empty.impl;

import empty.EmptyFactory;
import empty.EmptyPackage;
import empty.Liar;

import empty.Maybe;
import empty.SubLiar;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmptyPackageImpl extends EPackageImpl implements EmptyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maybeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLiarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see empty.EmptyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmptyPackageImpl() {
		super(eNS_URI, EmptyFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EmptyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmptyPackage init() {
		if (isInited) return (EmptyPackage)EPackage.Registry.INSTANCE.getEPackage(EmptyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEmptyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EmptyPackageImpl theEmptyPackage = registeredEmptyPackage instanceof EmptyPackageImpl ? (EmptyPackageImpl)registeredEmptyPackage : new EmptyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEmptyPackage.createPackageContents();

		// Initialize created meta-data
		theEmptyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmptyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmptyPackage.eNS_URI, theEmptyPackage);
		return theEmptyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiar() {
		return liarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiar_Name() {
		return (EAttribute)liarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiar_Maybe() {
		return (EReference)liarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiar_SubLiar() {
		return (EReference)liarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiar_Enum() {
		return (EAttribute)liarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaybe() {
		return maybeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaybe_Value() {
		return (EAttribute)maybeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaybe_SubLiar() {
		return (EReference)maybeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubLiar() {
		return subLiarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnum() {
		return enumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyFactory getEmptyFactory() {
		return (EmptyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		liarEClass = createEClass(LIAR);
		createEAttribute(liarEClass, LIAR__NAME);
		createEReference(liarEClass, LIAR__MAYBE);
		createEReference(liarEClass, LIAR__SUB_LIAR);
		createEAttribute(liarEClass, LIAR__ENUM);

		maybeEClass = createEClass(MAYBE);
		createEAttribute(maybeEClass, MAYBE__VALUE);
		createEReference(maybeEClass, MAYBE__SUB_LIAR);

		subLiarEClass = createEClass(SUB_LIAR);

		// Create enums
		enumEEnum = createEEnum(ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subLiarEClass.getESuperTypes().add(this.getLiar());

		// Initialize classes, features, and operations; add parameters
		initEClass(liarEClass, Liar.class, "Liar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Liar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiar_Maybe(), this.getMaybe(), null, "maybe", null, 0, -1, Liar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiar_SubLiar(), this.getSubLiar(), null, "subLiar", null, 0, -1, Liar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiar_Enum(), this.getEnum(), "enum", null, 0, 1, Liar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maybeEClass, Maybe.class, "Maybe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaybe_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Maybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaybe_SubLiar(), this.getSubLiar(), null, "subLiar", null, 0, 1, Maybe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subLiarEClass, SubLiar.class, "SubLiar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(enumEEnum, empty.Enum.class, "Enum");
		addEEnumLiteral(enumEEnum, empty.Enum.ENUM1);
		addEEnumLiteral(enumEEnum, empty.Enum.ENUM2);
		addEEnumLiteral(enumEEnum, empty.Enum.ENUM3);

		// Create resource
		createResource(eNS_URI);
	}

} //EmptyPackageImpl
