/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Feedback;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.FeedbackImpl#getFeedback_ID <em>Feedback ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.FeedbackImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.impl.FeedbackImpl#getCreation_time <em>Creation time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback {
	/**
	 * The default value of the '{@link #getFeedback_ID() <em>Feedback ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int FEEDBACK_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFeedback_ID() <em>Feedback ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback_ID()
	 * @generated
	 * @ordered
	 */
	protected int feedback_ID = FEEDBACK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreation_time() <em>Creation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation_time()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreation_time() <em>Creation time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation_time()
	 * @generated
	 * @ordered
	 */
	protected Date creation_time = CREATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFeedback_ID() {
		return feedback_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeedback_ID(int newFeedback_ID) {
		int oldFeedback_ID = feedback_ID;
		feedback_ID = newFeedback_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FEEDBACK__FEEDBACK_ID, oldFeedback_ID, feedback_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FEEDBACK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreation_time() {
		return creation_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreation_time(Date newCreation_time) {
		Date oldCreation_time = creation_time;
		creation_time = newCreation_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FEEDBACK__CREATION_TIME, oldCreation_time, creation_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.FEEDBACK__FEEDBACK_ID:
				return getFeedback_ID();
			case ClassDiagramPackage.FEEDBACK__DESCRIPTION:
				return getDescription();
			case ClassDiagramPackage.FEEDBACK__CREATION_TIME:
				return getCreation_time();
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
			case ClassDiagramPackage.FEEDBACK__FEEDBACK_ID:
				setFeedback_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.FEEDBACK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClassDiagramPackage.FEEDBACK__CREATION_TIME:
				setCreation_time((Date)newValue);
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
			case ClassDiagramPackage.FEEDBACK__FEEDBACK_ID:
				setFeedback_ID(FEEDBACK_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.FEEDBACK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClassDiagramPackage.FEEDBACK__CREATION_TIME:
				setCreation_time(CREATION_TIME_EDEFAULT);
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
			case ClassDiagramPackage.FEEDBACK__FEEDBACK_ID:
				return feedback_ID != FEEDBACK_ID_EDEFAULT;
			case ClassDiagramPackage.FEEDBACK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClassDiagramPackage.FEEDBACK__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creation_time != null : !CREATION_TIME_EDEFAULT.equals(creation_time);
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
		result.append(" (Feedback_ID: ");
		result.append(feedback_ID);
		result.append(", Description: ");
		result.append(description);
		result.append(", Creation_time: ");
		result.append(creation_time);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
