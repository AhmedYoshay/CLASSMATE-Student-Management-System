/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Prerequisites#getCourse_ID <em>Course ID</em>}</li>
 *   <li>{@link ClassDiagram.Prerequisites#getPrerequisites_ID <em>Prerequisites ID</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPrerequisites()
 * @model
 * @generated
 */
public interface Prerequisites extends EObject {
	/**
	 * Returns the value of the '<em><b>Course ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course ID</em>' attribute.
	 * @see #setCourse_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getPrerequisites_Course_ID()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCourse_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Prerequisites#getCourse_ID <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course ID</em>' attribute.
	 * @see #getCourse_ID()
	 * @generated
	 */
	void setCourse_ID(int value);

	/**
	 * Returns the value of the '<em><b>Prerequisites ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prerequisites ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites ID</em>' attribute.
	 * @see #setPrerequisites_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getPrerequisites_Prerequisites_ID()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrerequisites_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Prerequisites#getPrerequisites_ID <em>Prerequisites ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisites ID</em>' attribute.
	 * @see #getPrerequisites_ID()
	 * @generated
	 */
	void setPrerequisites_ID(int value);

} // Prerequisites
