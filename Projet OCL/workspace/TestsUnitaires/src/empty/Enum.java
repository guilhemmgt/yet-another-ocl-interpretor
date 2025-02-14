/**
 */
package empty;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see empty.EmptyPackage#getEnum()
 * @model
 * @generated
 */
public enum Enum implements Enumerator {
	/**
	 * The '<em><b>Enum1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM1(0, "enum1", "enum1"),

	/**
	 * The '<em><b>Enum2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM2(1, "enum2", "enum2"),

	/**
	 * The '<em><b>Enum3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM3_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM3(2, "enum3", "enum3");

	/**
	 * The '<em><b>Enum1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM1
	 * @model name="enum1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM1_VALUE = 0;

	/**
	 * The '<em><b>Enum2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM2
	 * @model name="enum2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM2_VALUE = 1;

	/**
	 * The '<em><b>Enum3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM3
	 * @model name="enum3"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Enum[] VALUES_ARRAY =
		new Enum[] {
			ENUM1,
			ENUM2,
			ENUM3,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Enum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum get(int value) {
		switch (value) {
			case ENUM1_VALUE: return ENUM1;
			case ENUM2_VALUE: return ENUM2;
			case ENUM3_VALUE: return ENUM3;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Enum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Enum
