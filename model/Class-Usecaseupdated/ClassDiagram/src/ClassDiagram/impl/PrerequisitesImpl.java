/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Prerequisites;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.PrerequisitesImpl#getCourse_ID <em>Course ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.PrerequisitesImpl#getPrerequisites_ID <em>Prerequisites ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisitesImpl extends MinimalEObjectImpl.Container implements Prerequisites {
	/**
	 * The default value of the '{@link #getCourse_ID() <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int COURSE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCourse_ID() <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse_ID()
	 * @generated
	 * @ordered
	 */
	protected int course_ID = COURSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrerequisites_ID() <em>Prerequisites ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int PREREQUISITES_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrerequisites_ID() <em>Prerequisites ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites_ID()
	 * @generated
	 * @ordered
	 */
	protected int prerequisites_ID = PREREQUISITES_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisitesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.PREREQUISITES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCourse_ID() {
		return course_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse_ID(int newCourse_ID) {
		int oldCourse_ID = course_ID;
		course_ID = newCourse_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PREREQUISITES__COURSE_ID, oldCourse_ID, course_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrerequisites_ID() {
		return prerequisites_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrerequisites_ID(int newPrerequisites_ID) {
		int oldPrerequisites_ID = prerequisites_ID;
		prerequisites_ID = newPrerequisites_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PREREQUISITES__PREREQUISITES_ID, oldPrerequisites_ID, prerequisites_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.PREREQUISITES__COURSE_ID:
				return getCourse_ID();
			case ClassDiagramPackage.PREREQUISITES__PREREQUISITES_ID:
				return getPrerequisites_ID();
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
			case ClassDiagramPackage.PREREQUISITES__COURSE_ID:
				setCourse_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.PREREQUISITES__PREREQUISITES_ID:
				setPrerequisites_ID((Integer)newValue);
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
			case ClassDiagramPackage.PREREQUISITES__COURSE_ID:
				setCourse_ID(COURSE_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.PREREQUISITES__PREREQUISITES_ID:
				setPrerequisites_ID(PREREQUISITES_ID_EDEFAULT);
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
			case ClassDiagramPackage.PREREQUISITES__COURSE_ID:
				return course_ID != COURSE_ID_EDEFAULT;
			case ClassDiagramPackage.PREREQUISITES__PREREQUISITES_ID:
				return prerequisites_ID != PREREQUISITES_ID_EDEFAULT;
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
		result.append(" (Course_ID: ");
		result.append(course_ID);
		result.append(", Prerequisites_ID: ");
		result.append(prerequisites_ID);
		result.append(')');
		return result.toString();
	}

} //PrerequisitesImpl
