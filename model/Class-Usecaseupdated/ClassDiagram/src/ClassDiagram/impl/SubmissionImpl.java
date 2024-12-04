/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Submission;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.SubmissionImpl#getSubmission_ID <em>Submission ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.SubmissionImpl#getSubmission_time <em>Submission time</em>}</li>
 *   <li>{@link ClassDiagram.impl.SubmissionImpl#getObtained_Marks <em>Obtained Marks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmissionImpl extends MinimalEObjectImpl.Container implements Submission {
	/**
	 * The default value of the '{@link #getSubmission_ID() <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmission_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBMISSION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubmission_ID() <em>Submission ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmission_ID()
	 * @generated
	 * @ordered
	 */
	protected int submission_ID = SUBMISSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmission_time() <em>Submission time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmission_time()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMISSION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmission_time() <em>Submission time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmission_time()
	 * @generated
	 * @ordered
	 */
	protected Date submission_time = SUBMISSION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObtained_Marks() <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtained_Marks()
	 * @generated
	 * @ordered
	 */
	protected static final float OBTAINED_MARKS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getObtained_Marks() <em>Obtained Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtained_Marks()
	 * @generated
	 * @ordered
	 */
	protected float obtained_Marks = OBTAINED_MARKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.SUBMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSubmission_ID() {
		return submission_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmission_ID(int newSubmission_ID) {
		int oldSubmission_ID = submission_ID;
		submission_ID = newSubmission_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SUBMISSION__SUBMISSION_ID, oldSubmission_ID, submission_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSubmission_time() {
		return submission_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmission_time(Date newSubmission_time) {
		Date oldSubmission_time = submission_time;
		submission_time = newSubmission_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SUBMISSION__SUBMISSION_TIME, oldSubmission_time, submission_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getObtained_Marks() {
		return obtained_Marks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObtained_Marks(float newObtained_Marks) {
		float oldObtained_Marks = obtained_Marks;
		obtained_Marks = newObtained_Marks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SUBMISSION__OBTAINED_MARKS, oldObtained_Marks, obtained_Marks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_ID:
				return getSubmission_ID();
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_TIME:
				return getSubmission_time();
			case ClassDiagramPackage.SUBMISSION__OBTAINED_MARKS:
				return getObtained_Marks();
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
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_ID:
				setSubmission_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_TIME:
				setSubmission_time((Date)newValue);
				return;
			case ClassDiagramPackage.SUBMISSION__OBTAINED_MARKS:
				setObtained_Marks((Float)newValue);
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
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_ID:
				setSubmission_ID(SUBMISSION_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_TIME:
				setSubmission_time(SUBMISSION_TIME_EDEFAULT);
				return;
			case ClassDiagramPackage.SUBMISSION__OBTAINED_MARKS:
				setObtained_Marks(OBTAINED_MARKS_EDEFAULT);
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
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_ID:
				return submission_ID != SUBMISSION_ID_EDEFAULT;
			case ClassDiagramPackage.SUBMISSION__SUBMISSION_TIME:
				return SUBMISSION_TIME_EDEFAULT == null ? submission_time != null : !SUBMISSION_TIME_EDEFAULT.equals(submission_time);
			case ClassDiagramPackage.SUBMISSION__OBTAINED_MARKS:
				return obtained_Marks != OBTAINED_MARKS_EDEFAULT;
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
		result.append(" (Submission_ID: ");
		result.append(submission_ID);
		result.append(", Submission_time: ");
		result.append(submission_time);
		result.append(", Obtained_Marks: ");
		result.append(obtained_Marks);
		result.append(')');
		return result.toString();
	}

} //SubmissionImpl
