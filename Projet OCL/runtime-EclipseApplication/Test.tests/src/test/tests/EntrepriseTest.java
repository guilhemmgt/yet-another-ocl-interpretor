/**
 */
package test.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import test.Entreprise;
import test.TestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entreprise</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntrepriseTest extends TestCase {

	/**
	 * The fixture for this Entreprise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entreprise fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntrepriseTest.class);
	}

	/**
	 * Constructs a new Entreprise test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrepriseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Entreprise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Entreprise fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Entreprise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entreprise getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestFactory.eINSTANCE.createEntreprise());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EntrepriseTest
