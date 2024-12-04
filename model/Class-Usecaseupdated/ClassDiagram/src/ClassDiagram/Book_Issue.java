/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Book_Issue#getIssue_ID <em>Issue ID</em>}</li>
 *   <li>{@link ClassDiagram.Book_Issue#getIssue_Date <em>Issue Date</em>}</li>
 *   <li>{@link ClassDiagram.Book_Issue#getDue_Date <em>Due Date</em>}</li>
 *   <li>{@link ClassDiagram.Book_Issue#getReturn_Date <em>Return Date</em>}</li>
 *   <li>{@link ClassDiagram.Book_Issue#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue()
 * @model
 * @generated
 */
public interface Book_Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue ID</em>' attribute.
	 * @see #setIssue_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue_Issue_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIssue_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Book_Issue#getIssue_ID <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue ID</em>' attribute.
	 * @see #getIssue_ID()
	 * @generated
	 */
	void setIssue_ID(int value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssue_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue_Issue_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getIssue_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.Book_Issue#getIssue_Date <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssue_Date()
	 * @generated
	 */
	void setIssue_Date(Date value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDue_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue_Due_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getDue_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.Book_Issue#getDue_Date <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDue_Date()
	 * @generated
	 */
	void setDue_Date(Date value);

	/**
	 * Returns the value of the '<em><b>Return Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Date</em>' attribute.
	 * @see #setReturn_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue_Return_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getReturn_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.Book_Issue#getReturn_Date <em>Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Date</em>' attribute.
	 * @see #getReturn_Date()
	 * @generated
	 */
	void setReturn_Date(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see ClassDiagram.ClassDiagramPackage#getBook_Issue_Status()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Book_Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Book_Issue
