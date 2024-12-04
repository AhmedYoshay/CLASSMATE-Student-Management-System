/**
 */
package ClassDiagram.impl;

import ClassDiagram.Book_Issue;
import ClassDiagram.ClassDiagramPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Book_IssueImpl#getIssue_ID <em>Issue ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.Book_IssueImpl#getIssue_Date <em>Issue Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Book_IssueImpl#getDue_Date <em>Due Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Book_IssueImpl#getReturn_Date <em>Return Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Book_IssueImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Book_IssueImpl extends MinimalEObjectImpl.Container implements Book_Issue {
	/**
	 * The default value of the '{@link #getIssue_ID() <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int ISSUE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIssue_ID() <em>Issue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_ID()
	 * @generated
	 * @ordered
	 */
	protected int issue_ID = ISSUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue_Date() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue_Date() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_Date()
	 * @generated
	 * @ordered
	 */
	protected Date issue_Date = ISSUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDue_Date() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDue_Date() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue_Date()
	 * @generated
	 * @ordered
	 */
	protected Date due_Date = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturn_Date() <em>Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETURN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturn_Date() <em>Return Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_Date()
	 * @generated
	 * @ordered
	 */
	protected Date return_Date = RETURN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Book_IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BOOK_ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIssue_ID() {
		return issue_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue_ID(int newIssue_ID) {
		int oldIssue_ID = issue_ID;
		issue_ID = newIssue_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOK_ISSUE__ISSUE_ID, oldIssue_ID, issue_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssue_Date() {
		return issue_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue_Date(Date newIssue_Date) {
		Date oldIssue_Date = issue_Date;
		issue_Date = newIssue_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOK_ISSUE__ISSUE_DATE, oldIssue_Date, issue_Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDue_Date() {
		return due_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDue_Date(Date newDue_Date) {
		Date oldDue_Date = due_Date;
		due_Date = newDue_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOK_ISSUE__DUE_DATE, oldDue_Date, due_Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReturn_Date() {
		return return_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn_Date(Date newReturn_Date) {
		Date oldReturn_Date = return_Date;
		return_Date = newReturn_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOK_ISSUE__RETURN_DATE, oldReturn_Date, return_Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOK_ISSUE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_ID:
				return getIssue_ID();
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_DATE:
				return getIssue_Date();
			case ClassDiagramPackage.BOOK_ISSUE__DUE_DATE:
				return getDue_Date();
			case ClassDiagramPackage.BOOK_ISSUE__RETURN_DATE:
				return getReturn_Date();
			case ClassDiagramPackage.BOOK_ISSUE__STATUS:
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
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_ID:
				setIssue_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_DATE:
				setIssue_Date((Date)newValue);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__DUE_DATE:
				setDue_Date((Date)newValue);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__RETURN_DATE:
				setReturn_Date((Date)newValue);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__STATUS:
				setStatus((String)newValue);
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
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_ID:
				setIssue_ID(ISSUE_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_DATE:
				setIssue_Date(ISSUE_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__DUE_DATE:
				setDue_Date(DUE_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__RETURN_DATE:
				setReturn_Date(RETURN_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOK_ISSUE__STATUS:
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
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_ID:
				return issue_ID != ISSUE_ID_EDEFAULT;
			case ClassDiagramPackage.BOOK_ISSUE__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issue_Date != null : !ISSUE_DATE_EDEFAULT.equals(issue_Date);
			case ClassDiagramPackage.BOOK_ISSUE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? due_Date != null : !DUE_DATE_EDEFAULT.equals(due_Date);
			case ClassDiagramPackage.BOOK_ISSUE__RETURN_DATE:
				return RETURN_DATE_EDEFAULT == null ? return_Date != null : !RETURN_DATE_EDEFAULT.equals(return_Date);
			case ClassDiagramPackage.BOOK_ISSUE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
		result.append(" (Issue_ID: ");
		result.append(issue_ID);
		result.append(", Issue_Date: ");
		result.append(issue_Date);
		result.append(", Due_Date: ");
		result.append(due_Date);
		result.append(", Return_Date: ");
		result.append(return_Date);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //Book_IssueImpl
