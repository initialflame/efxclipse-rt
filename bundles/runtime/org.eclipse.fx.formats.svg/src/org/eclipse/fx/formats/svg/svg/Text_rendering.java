/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.fx.formats.svg.svg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text rendering</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.formats.svg.svg.SvgPackage#getText_rendering()
 * @model
 * @generated
 */
public enum Text_rendering implements Enumerator {
	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(0, "auto", "auto"),

	/**
	 * The '<em><b>Optimize Speed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZE_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMIZE_SPEED(1, "optimizeSpeed", "optimizeSpeed"),

	/**
	 * The '<em><b>Optimize Legibility</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZE_LEGIBILITY_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMIZE_LEGIBILITY(2, "optimizeLegibility", "optimizeLegibility"),

	/**
	 * The '<em><b>Geometric Precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOMETRIC_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	GEOMETRIC_PRECISION(3, "geometricPrecision", "geometricPrecision"),

	/**
	 * The '<em><b>Inherit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(4, "inherit", "inherit");

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 0;

	/**
	 * The '<em><b>Optimize Speed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optimize Speed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZE_SPEED
	 * @model name="optimizeSpeed"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMIZE_SPEED_VALUE = 1;

	/**
	 * The '<em><b>Optimize Legibility</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optimize Legibility</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIMIZE_LEGIBILITY
	 * @model name="optimizeLegibility"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMIZE_LEGIBILITY_VALUE = 2;

	/**
	 * The '<em><b>Geometric Precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Geometric Precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEOMETRIC_PRECISION
	 * @model name="geometricPrecision"
	 * @generated
	 * @ordered
	 */
	public static final int GEOMETRIC_PRECISION_VALUE = 3;

	/**
	 * The '<em><b>Inherit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inherit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT
	 * @model name="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Text rendering</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Text_rendering[] VALUES_ARRAY =
		new Text_rendering[] {
			AUTO,
			OPTIMIZE_SPEED,
			OPTIMIZE_LEGIBILITY,
			GEOMETRIC_PRECISION,
			INHERIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Text rendering</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Text_rendering> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text rendering</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Text_rendering get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Text_rendering result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text rendering</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Text_rendering getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Text_rendering result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text rendering</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Text_rendering get(int value) {
		switch (value) {
			case AUTO_VALUE: return AUTO;
			case OPTIMIZE_SPEED_VALUE: return OPTIMIZE_SPEED;
			case OPTIMIZE_LEGIBILITY_VALUE: return OPTIMIZE_LEGIBILITY;
			case GEOMETRIC_PRECISION_VALUE: return GEOMETRIC_PRECISION;
			case INHERIT_VALUE: return INHERIT;
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
	private Text_rendering(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Text_rendering
