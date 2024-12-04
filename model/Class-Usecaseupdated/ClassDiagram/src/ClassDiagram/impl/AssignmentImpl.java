/**
 */
package ClassDiagram.impl;

import ClassDiagram.Assignment;
import ClassDiagram.ClassDiagramPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.AssignmentImpl#getAssignmentID <em>Assignment ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.AssignmentImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.AssignmentImpl#getTotal_Marks <em>Total Marks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment {
	/**
	 * The default value of the '{@link #getAssignmentID() <em>Assignment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentID()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSIGNMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssignmentID() <em>Assignment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentID()
	 * @generated
	 * @ordered
	 */
	protected int assignmentID = ASSIGNMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_Marks() <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Marks()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_MARKS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotal_Marks() <em>Total Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_Marks()
	 * @generated
	 * @ordered
	 */
	protected float total_Marks = TOTAL_MARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAssignmentID() {
		return assignmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignmentID(int newAssignmentID) {
		int oldAssignmentID = assignmentID;
		assignmentID = newAssignmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSIGNMENT__ASSIGNMENT_ID, oldAssignmentID, assignmentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSIGNMENT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotal_Marks() {
		return total_Marks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotal_Marks(float newTotal_Marks) {
		float oldTotal_Marks = total_Marks;
		total_Marks = newTotal_Marks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ASSIGNMENT__TOTAL_MARKS, oldTotal_Marks, total_Marks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ASSIGNMENT__ASSIGNMENT_ID:
				return getAssignmentID();
			case ClassDiagramPackage.ASSIGNMENT__DUE_DATE:
				return getDueDate();
			case ClassDiagramPackage.ASSIGNMENT__TOTAL_MARKS:
				return getTotal_Marks();
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
			case ClassDiagramPackage.ASSIGNMENT__ASSIGNMENT_ID:
				setAssignmentID((Integer)newValue);
				return;
			case ClassDiagramPackage.ASSIGNMENT__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case ClassDiagramPackage.ASSIGNMENT__TOTAL_MARKS:
				setTotal_Marks((Float)newValue);
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
			case ClassDiagramPackage.ASSIGNMENT__ASSIGNMENT_ID:
				setAssignmentID(ASSIGNMENT_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.ASSIGNMENT__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.ASSIGNMENT__TOTAL_MARKS:
				setTotal_Marks(TOTAL_MARKS_EDEFAULT);
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
			case ClassDiagramPackage.ASSIGNMENT__ASSIGNMENT_ID:
				return assignmentID != ASSIGNMENT_ID_EDEFAULT;
			case ClassDiagramPackage.ASSIGNMENT__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case ClassDiagramPackage.ASSIGNMENT__TOTAL_MARKS:
				return total_Marks != TOTAL_MARKS_EDEFAULT;
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
		result.append(" (AssignmentID: ");
		result.append(assignmentID);
		result.append(", DueDate: ");
		result.append(dueDate);
		result.append(", Total_Marks: ");
		result.append(total_Marks);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
