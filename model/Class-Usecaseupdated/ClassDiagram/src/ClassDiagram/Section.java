/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Section#getYearSection <em>Year Section</em>}</li>
 *   <li>{@link ClassDiagram.Section#getClassroom <em>Classroom</em>}</li>
 *   <li>{@link ClassDiagram.Section#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Year Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Section</em>' attribute.
	 * @see #setYearSection(String)
	 * @see ClassDiagram.ClassDiagramPackage#getSection_YearSection()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getYearSection();

	/**
	 * Sets the value of the '{@link ClassDiagram.Section#getYearSection <em>Year Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Section</em>' attribute.
	 * @see #getYearSection()
	 * @generated
	 */
	void setYearSection(String value);

	/**
	 * Returns the value of the '<em><b>Classroom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classroom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classroom</em>' attribute.
	 * @see #setClassroom(String)
	 * @see ClassDiagram.ClassDiagramPackage#getSection_Classroom()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getClassroom();

	/**
	 * Sets the value of the '{@link ClassDiagram.Section#getClassroom <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classroom</em>' attribute.
	 * @see #getClassroom()
	 * @generated
	 */
	void setClassroom(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see ClassDiagram.ClassDiagramPackage#getSection_Capacity()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ClassDiagram.Section#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Section
