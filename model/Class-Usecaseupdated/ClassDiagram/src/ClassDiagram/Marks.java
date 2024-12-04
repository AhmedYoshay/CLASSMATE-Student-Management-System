/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Marks#getMarks_ID <em>Marks ID</em>}</li>
 *   <li>{@link ClassDiagram.Marks#getWeightage <em>Weightage</em>}</li>
 *   <li>{@link ClassDiagram.Marks#getTotal_Marks <em>Total Marks</em>}</li>
 *   <li>{@link ClassDiagram.Marks#getObtained_Marks <em>Obtained Marks</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getMarks()
 * @model
 * @generated
 */
public interface Marks extends EObject {
	/**
	 * Returns the value of the '<em><b>Marks ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marks ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marks ID</em>' attribute.
	 * @see #setMarks_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getMarks_Marks_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMarks_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Marks#getMarks_ID <em>Marks ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marks ID</em>' attribute.
	 * @see #getMarks_ID()
	 * @generated
	 */
	void setMarks_ID(int value);

	/**
	 * Returns the value of the '<em><b>Weightage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weightage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weightage</em>' attribute.
	 * @see #setWeightage(float)
	 * @see ClassDiagram.ClassDiagramPackage#getMarks_Weightage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getWeightage();

	/**
	 * Sets the value of the '{@link ClassDiagram.Marks#getWeightage <em>Weightage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weightage</em>' attribute.
	 * @see #getWeightage()
	 * @generated
	 */
	void setWeightage(float value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getMarks_Total_Marks()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getTotal_Marks();

	/**
	 * Sets the value of the '{@link ClassDiagram.Marks#getTotal_Marks <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Marks</em>' attribute.
	 * @see #getTotal_Marks()
	 * @generated
	 */
	void setTotal_Marks(float value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getMarks_Obtained_Marks()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	float getObtained_Marks();

	/**
	 * Sets the value of the '{@link ClassDiagram.Marks#getObtained_Marks <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obtained Marks</em>' attribute.
	 * @see #getObtained_Marks()
	 * @generated
	 */
	void setObtained_Marks(float value);

} // Marks
