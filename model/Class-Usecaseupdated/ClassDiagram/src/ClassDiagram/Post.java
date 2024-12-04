/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Post#getPost_ID <em>Post ID</em>}</li>
 *   <li>{@link ClassDiagram.Post#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.Post#getCreation_Date <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Post ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post ID</em>' attribute.
	 * @see #setPost_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getPost_Post_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPost_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Post#getPost_ID <em>Post ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post ID</em>' attribute.
	 * @see #getPost_ID()
	 * @generated
	 */
	void setPost_ID(int value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getPost_Description()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ClassDiagram.Post#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreation_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getPost_Creation_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getCreation_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.Post#getCreation_Date <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreation_Date()
	 * @generated
	 */
	void setCreation_Date(Date value);

} // Post
