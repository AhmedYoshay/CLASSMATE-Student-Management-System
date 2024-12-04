/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.EducationHistory#getEducation_ID <em>Education ID</em>}</li>
 *   <li>{@link ClassDiagram.EducationHistory#getDegree <em>Degree</em>}</li>
 *   <li>{@link ClassDiagram.EducationHistory#getField_of_study <em>Field of study</em>}</li>
 *   <li>{@link ClassDiagram.EducationHistory#getInstitution <em>Institution</em>}</li>
 *   <li>{@link ClassDiagram.EducationHistory#getGraduationYear <em>Graduation Year</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory()
 * @model
 * @generated
 */
public interface EducationHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Education ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Education ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education ID</em>' attribute.
	 * @see #setEducation_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory_Education_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEducation_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.EducationHistory#getEducation_ID <em>Education ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education ID</em>' attribute.
	 * @see #getEducation_ID()
	 * @generated
	 */
	void setEducation_ID(int value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(String)
	 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory_Degree()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDegree();

	/**
	 * Sets the value of the '{@link ClassDiagram.EducationHistory#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(String value);

	/**
	 * Returns the value of the '<em><b>Field of study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field of study</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field of study</em>' attribute.
	 * @see #setField_of_study(String)
	 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory_Field_of_study()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getField_of_study();

	/**
	 * Sets the value of the '{@link ClassDiagram.EducationHistory#getField_of_study <em>Field of study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field of study</em>' attribute.
	 * @see #getField_of_study()
	 * @generated
	 */
	void setField_of_study(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory_Institution()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link ClassDiagram.EducationHistory#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Graduation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graduation Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graduation Year</em>' attribute.
	 * @see #setGraduationYear(int)
	 * @see ClassDiagram.ClassDiagramPackage#getEducationHistory_GraduationYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getGraduationYear();

	/**
	 * Sets the value of the '{@link ClassDiagram.EducationHistory#getGraduationYear <em>Graduation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graduation Year</em>' attribute.
	 * @see #getGraduationYear()
	 * @generated
	 */
	void setGraduationYear(int value);

} // EducationHistory
