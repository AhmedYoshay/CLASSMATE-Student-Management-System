/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.File;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.FileImpl#getFile_ID <em>File ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.FileImpl#getFile_Name <em>File Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.FileImpl#getFile_Path <em>File Path</em>}</li>
 *   <li>{@link ClassDiagram.impl.FileImpl#getFile_type <em>File type</em>}</li>
 *   <li>{@link ClassDiagram.impl.FileImpl#getFile_Size <em>File Size</em>}</li>
 *   <li>{@link ClassDiagram.impl.FileImpl#getUpload_Date <em>Upload Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
	/**
	 * The default value of the '{@link #getFile_ID() <em>File ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFile_ID() <em>File ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_ID()
	 * @generated
	 * @ordered
	 */
	protected int file_ID = FILE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_Name() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_Name() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Name()
	 * @generated
	 * @ordered
	 */
	protected String file_Name = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_Path() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Path()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_Path() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Path()
	 * @generated
	 * @ordered
	 */
	protected String file_Path = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_type() <em>File type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_type()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_type() <em>File type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_type()
	 * @generated
	 * @ordered
	 */
	protected String file_type = FILE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_Size() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Size()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFile_Size() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_Size()
	 * @generated
	 * @ordered
	 */
	protected int file_Size = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpload_Date() <em>Upload Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpload_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPLOAD_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpload_Date() <em>Upload Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpload_Date()
	 * @generated
	 * @ordered
	 */
	protected Date upload_Date = UPLOAD_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFile_ID() {
		return file_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_ID(int newFile_ID) {
		int oldFile_ID = file_ID;
		file_ID = newFile_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__FILE_ID, oldFile_ID, file_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile_Name() {
		return file_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_Name(String newFile_Name) {
		String oldFile_Name = file_Name;
		file_Name = newFile_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__FILE_NAME, oldFile_Name, file_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile_Path() {
		return file_Path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_Path(String newFile_Path) {
		String oldFile_Path = file_Path;
		file_Path = newFile_Path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__FILE_PATH, oldFile_Path, file_Path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile_type() {
		return file_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_type(String newFile_type) {
		String oldFile_type = file_type;
		file_type = newFile_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__FILE_TYPE, oldFile_type, file_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFile_Size() {
		return file_Size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_Size(int newFile_Size) {
		int oldFile_Size = file_Size;
		file_Size = newFile_Size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__FILE_SIZE, oldFile_Size, file_Size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpload_Date() {
		return upload_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpload_Date(Date newUpload_Date) {
		Date oldUpload_Date = upload_Date;
		upload_Date = newUpload_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FILE__UPLOAD_DATE, oldUpload_Date, upload_Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.FILE__FILE_ID:
				return getFile_ID();
			case ClassDiagramPackage.FILE__FILE_NAME:
				return getFile_Name();
			case ClassDiagramPackage.FILE__FILE_PATH:
				return getFile_Path();
			case ClassDiagramPackage.FILE__FILE_TYPE:
				return getFile_type();
			case ClassDiagramPackage.FILE__FILE_SIZE:
				return getFile_Size();
			case ClassDiagramPackage.FILE__UPLOAD_DATE:
				return getUpload_Date();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.FILE__FILE_ID:
				setFile_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.FILE__FILE_NAME:
				setFile_Name((String)newValue);
				return;
			case ClassDiagramPackage.FILE__FILE_PATH:
				setFile_Path((String)newValue);
				return;
			case ClassDiagramPackage.FILE__FILE_TYPE:
				setFile_type((String)newValue);
				return;
			case ClassDiagramPackage.FILE__FILE_SIZE:
				setFile_Size((Integer)newValue);
				return;
			case ClassDiagramPackage.FILE__UPLOAD_DATE:
				setUpload_Date((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.FILE__FILE_ID:
				setFile_ID(FILE_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.FILE__FILE_NAME:
				setFile_Name(FILE_NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.FILE__FILE_PATH:
				setFile_Path(FILE_PATH_EDEFAULT);
				return;
			case ClassDiagramPackage.FILE__FILE_TYPE:
				setFile_type(FILE_TYPE_EDEFAULT);
				return;
			case ClassDiagramPackage.FILE__FILE_SIZE:
				setFile_Size(FILE_SIZE_EDEFAULT);
				return;
			case ClassDiagramPackage.FILE__UPLOAD_DATE:
				setUpload_Date(UPLOAD_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.FILE__FILE_ID:
				return file_ID != FILE_ID_EDEFAULT;
			case ClassDiagramPackage.FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? file_Name != null : !FILE_NAME_EDEFAULT.equals(file_Name);
			case ClassDiagramPackage.FILE__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? file_Path != null : !FILE_PATH_EDEFAULT.equals(file_Path);
			case ClassDiagramPackage.FILE__FILE_TYPE:
				return FILE_TYPE_EDEFAULT == null ? file_type != null : !FILE_TYPE_EDEFAULT.equals(file_type);
			case ClassDiagramPackage.FILE__FILE_SIZE:
				return file_Size != FILE_SIZE_EDEFAULT;
			case ClassDiagramPackage.FILE__UPLOAD_DATE:
				return UPLOAD_DATE_EDEFAULT == null ? upload_Date != null : !UPLOAD_DATE_EDEFAULT.equals(upload_Date);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (File_ID: ");
		result.append(file_ID);
		result.append(", File_Name: ");
		result.append(file_Name);
		result.append(", File_Path: ");
		result.append(file_Path);
		result.append(", File_type: ");
		result.append(file_type);
		result.append(", File_Size: ");
		result.append(file_Size);
		result.append(", Upload_Date: ");
		result.append(upload_Date);
		result.append(')');
		return result.toString();
	}

} //FileImpl
