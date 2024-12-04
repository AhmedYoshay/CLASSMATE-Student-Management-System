/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Enrollment#getEnrollmentID <em>Enrollment ID</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>Enrollment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment ID</em>' attribute.
	 * @see #setEnrollmentID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getEnrollment_EnrollmentID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEnrollmentID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Enrollment#getEnrollmentID <em>Enrollment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment ID</em>' attribute.
	 * @see #getEnrollmentID()
	 * @generated
	 */
	void setEnrollmentID(int value);

} // Enrollment
