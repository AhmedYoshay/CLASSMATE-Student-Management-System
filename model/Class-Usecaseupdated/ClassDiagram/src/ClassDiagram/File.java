/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.File#getFile_ID <em>File ID</em>}</li>
 *   <li>{@link ClassDiagram.File#getFile_Name <em>File Name</em>}</li>
 *   <li>{@link ClassDiagram.File#getFile_Path <em>File Path</em>}</li>
 *   <li>{@link ClassDiagram.File#getFile_type <em>File type</em>}</li>
 *   <li>{@link ClassDiagram.File#getFile_Size <em>File Size</em>}</li>
 *   <li>{@link ClassDiagram.File#getUpload_Date <em>Upload Date</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>File ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File ID</em>' attribute.
	 * @see #setFile_ID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_File_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getFile_ID();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getFile_ID <em>File ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File ID</em>' attribute.
	 * @see #getFile_ID()
	 * @generated
	 */
	void setFile_ID(int value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFile_Name(String)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_File_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFile_Name();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getFile_Name <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFile_Name()
	 * @generated
	 */
	void setFile_Name(String value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFile_Path(String)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_File_Path()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFile_Path();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getFile_Path <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFile_Path()
	 * @generated
	 */
	void setFile_Path(String value);

	/**
	 * Returns the value of the '<em><b>File type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File type</em>' attribute.
	 * @see #setFile_type(String)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_File_type()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFile_type();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getFile_type <em>File type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File type</em>' attribute.
	 * @see #getFile_type()
	 * @generated
	 */
	void setFile_type(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFile_Size(int)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_File_Size()
	 * @model unique="false" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getFile_Size();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getFile_Size <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFile_Size()
	 * @generated
	 */
	void setFile_Size(int value);

	/**
	 * Returns the value of the '<em><b>Upload Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Date</em>' attribute.
	 * @see #setUpload_Date(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getFile_Upload_Date()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Date getUpload_Date();

	/**
	 * Sets the value of the '{@link ClassDiagram.File#getUpload_Date <em>Upload Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Date</em>' attribute.
	 * @see #getUpload_Date()
	 * @generated
	 */
	void setUpload_Date(Date value);

} // File
