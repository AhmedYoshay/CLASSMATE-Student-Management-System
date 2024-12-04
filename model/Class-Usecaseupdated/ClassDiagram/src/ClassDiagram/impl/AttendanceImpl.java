/**
 */
package ClassDiagram.impl;

import ClassDiagram.Attendance;
import ClassDiagram.ClassDiagramPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attendance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.AttendanceImpl#getAttendance_ID <em>Attendance ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.AttendanceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.AttendanceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttendanceImpl extends MinimalEObjectImpl.Container implements Attendance {
	/**
	 * The default value of the '{@link #getAttendance_ID() <em>Attendance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendance_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTENDANCE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttendance_ID() <em>Attendance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendance_ID()
	 * @generated
	 * @ordered
	 */
	protected int attendance_ID = ATTENDANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final char STATUS_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected char status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttendanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ATTENDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttendance_ID() {
		return attendance_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttendance_ID(int newAttendance_ID) {
		int oldAttendance_ID = attendance_ID;
		attendance_ID = newAttendance_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTENDANCE__ATTENDANCE_ID, oldAttendance_ID, attendance_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTENDANCE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(char newStatus) {
		char oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ATTENDANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ATTENDANCE__ATTENDANCE_ID:
				return getAttendance_ID();
			case ClassDiagramPackage.ATTENDANCE__DATE:
				return getDate();
			case ClassDiagramPackage.ATTENDANCE__STATUS:
				return getStatus();
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
			case ClassDiagramPackage.ATTENDANCE__ATTENDANCE_ID:
				setAttendance_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.ATTENDANCE__DATE:
				setDate((Date)newValue);
				return;
			case ClassDiagramPackage.ATTENDANCE__STATUS:
				setStatus((Character)newValue);
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
			case ClassDiagramPackage.ATTENDANCE__ATTENDANCE_ID:
				setAttendance_ID(ATTENDANCE_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.ATTENDANCE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.ATTENDANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ClassDiagramPackage.ATTENDANCE__ATTENDANCE_ID:
				return attendance_ID != ATTENDANCE_ID_EDEFAULT;
			case ClassDiagramPackage.ATTENDANCE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ClassDiagramPackage.ATTENDANCE__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (Attendance_ID: ");
		result.append(attendance_ID);
		result.append(", Date: ");
		result.append(date);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AttendanceImpl
