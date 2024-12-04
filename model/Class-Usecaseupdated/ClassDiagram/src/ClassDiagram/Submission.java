/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Submission#getSubmission_ID <em>Submission ID</em>}</li>
 *   <li>{@link ClassDiagram.Submission#getSubmission_time <em>Submission time</em>}</li>
 *   <li>{@link ClassDiagram.Submission#getObtained_Marks <em>Obtained Marks</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getSubmission()
 * @model
 * @generated
 */
public interface Submission extends EObject {
	/**
	 * Returns the value of the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission ID</em>' attribute.
	 * @see #setSubmission_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getSubmission_Submission_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSubmission_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Submission#getSubmission_ID <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission ID</em>' attribute.
	 * @see #getSubmission_ID()
	 * @generated
	 */
	void setSubmission_ID(int value);

	/**
	 * Returns the value of the '<em><b>Submission time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission time</em>' attribute.
	 * @see #setSubmission_time(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getSubmission_Submission_time()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getSubmission_time();

	/**
	 * Sets the value of the '{@link ClassDiagram.Submission#getSubmission_time <em>Submission time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submission time</em>' attribute.
	 * @see #getSubmission_time()
	 * @generated
	 */
	void setSubmission_time(Date value);

	/**
	 * Returns the value of the '<em><b>Obtained Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obtained Marks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obtained Marks</em>' attribute.
	 * @see #setObtained_Marks(float)
	 * @see ClassDiagram.ClassDiagramPackage#getSubmission_Obtained_Marks()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getObtained_Marks();

	/**
	 * Sets the value of the '{@link ClassDiagram.Submission#getObtained_Marks <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtained Marks</em>' attribute.
	 * @see #getObtained_Marks()
	 * @generated
	 */
	void setObtained_Marks(float value);

} // Submission
