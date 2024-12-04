/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Payment#getPayment_ID <em>Payment ID</em>}</li>
 *   <li>{@link ClassDiagram.Payment#getAmount <em>Amount</em>}</li>
 *   <li>{@link ClassDiagram.Payment#getPayment_type <em>Payment type</em>}</li>
 *   <li>{@link ClassDiagram.Payment#getPayment_Date <em>Payment Date</em>}</li>
 *   <li>{@link ClassDiagram.Payment#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.Payment#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment ID</em>' attribute.
	 * @see #setPayment_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Payment_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPayment_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getPayment_ID <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment ID</em>' attribute.
	 * @see #getPayment_ID()
	 * @generated
	 */
	void setPayment_ID(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Amount()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Payment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment type</em>' attribute.
	 * @see #setPayment_type(String)
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Payment_type()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPayment_type();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getPayment_type <em>Payment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment type</em>' attribute.
	 * @see #getPayment_type()
	 * @generated
	 */
	void setPayment_type(String value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' attribute.
	 * @see #setPayment_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Payment_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getPayment_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getPayment_Date <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPayment_Date()
	 * @generated
	 */
	void setPayment_Date(Date value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Description()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getPayment_Status()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Payment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // Payment
