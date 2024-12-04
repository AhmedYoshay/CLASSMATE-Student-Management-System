/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Assignment#getAssignmentID <em>Assignment ID</em>}</li>
 *   <li>{@link ClassDiagram.Assignment#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link ClassDiagram.Assignment#getTotal_Marks <em>Total Marks</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment ID</em>' attribute.
	 * @see #setAssignmentID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment_AssignmentID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAssignmentID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#getAssignmentID <em>Assignment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment ID</em>' attribute.
	 * @see #getAssignmentID()
	 * @generated
	 */
	void setAssignmentID(int value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment_DueDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Marks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Marks</em>' attribute.
	 * @see #setTotal_Marks(float)
	 * @see ClassDiagram.ClassDiagramPackage#getAssignment_Total_Marks()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getTotal_Marks();

	/**
	 * Sets the value of the '{@link ClassDiagram.Assignment#getTotal_Marks <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Marks</em>' attribute.
	 * @see #getTotal_Marks()
	 * @generated
	 */
	void setTotal_Marks(float value);

} // Assignment
