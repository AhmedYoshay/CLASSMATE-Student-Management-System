/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attendance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Attendance#getAttendance_ID <em>Attendance ID</em>}</li>
 *   <li>{@link ClassDiagram.Attendance#getDate <em>Date</em>}</li>
 *   <li>{@link ClassDiagram.Attendance#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getAttendance()
 * @model
 * @generated
 */
public interface Attendance extends EObject {
	/**
	 * Returns the value of the '<em><b>Attendance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attendance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attendance ID</em>' attribute.
	 * @see #setAttendance_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getAttendance_Attendance_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAttendance_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Attendance#getAttendance_ID <em>Attendance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attendance ID</em>' attribute.
	 * @see #getAttendance_ID()
	 * @generated
	 */
	void setAttendance_ID(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getAttendance_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link ClassDiagram.Attendance#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(char)
	 * @see ClassDiagram.ClassDiagramPackage#getAttendance_Status()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	char getStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Attendance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(char value);

} // Attendance
