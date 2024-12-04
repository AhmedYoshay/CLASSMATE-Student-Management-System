/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Feedback#getFeedback_ID <em>Feedback ID</em>}</li>
 *   <li>{@link ClassDiagram.Feedback#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.Feedback#getCreation_time <em>Creation time</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Feedback ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback ID</em>' attribute.
	 * @see #setFeedback_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getFeedback_Feedback_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getFeedback_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Feedback#getFeedback_ID <em>Feedback ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback ID</em>' attribute.
	 * @see #getFeedback_ID()
	 * @generated
	 */
	void setFeedback_ID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ClassDiagram.ClassDiagramPackage#getFeedback_Description()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ClassDiagram.Feedback#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation time</em>' attribute.
	 * @see #setCreation_time(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getFeedback_Creation_time()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getCreation_time();

	/**
	 * Sets the value of the '{@link ClassDiagram.Feedback#getCreation_time <em>Creation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation time</em>' attribute.
	 * @see #getCreation_time()
	 * @generated
	 */
	void setCreation_time(Date value);

} // Feedback
