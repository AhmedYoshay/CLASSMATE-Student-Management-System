/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Grade#getGrade_ID <em>Grade ID</em>}</li>
 *   <li>{@link ClassDiagram.Grade#getGPA <em>GPA</em>}</li>
 *   <li>{@link ClassDiagram.Grade#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade ID</em>' attribute.
	 * @see #setGrade_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getGrade_Grade_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getGrade_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Grade#getGrade_ID <em>Grade ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade ID</em>' attribute.
	 * @see #getGrade_ID()
	 * @generated
	 */
	void setGrade_ID(int value);

	/**
	 * Returns the value of the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPA</em>' attribute.
	 * @see #setGPA(float)
	 * @see ClassDiagram.ClassDiagramPackage#getGrade_GPA()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getGPA();

	/**
	 * Sets the value of the '{@link ClassDiagram.Grade#getGPA <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPA</em>' attribute.
	 * @see #getGPA()
	 * @generated
	 */
	void setGPA(float value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see ClassDiagram.ClassDiagramPackage#getGrade_Comments()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link ClassDiagram.Grade#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

} // Grade
