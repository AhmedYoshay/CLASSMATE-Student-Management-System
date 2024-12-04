/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Grade;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.GradeImpl#getGrade_ID <em>Grade ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.GradeImpl#getGPA <em>GPA</em>}</li>
 *   <li>{@link ClassDiagram.impl.GradeImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradeImpl extends MinimalEObjectImpl.Container implements Grade {
	/**
	 * The default value of the '{@link #getGrade_ID() <em>Grade ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int GRADE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrade_ID() <em>Grade ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade_ID()
	 * @generated
	 * @ordered
	 */
	protected int grade_ID = GRADE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected static final float GPA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected float gpa = GPA_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.GRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGrade_ID() {
		return grade_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade_ID(int newGrade_ID) {
		int oldGrade_ID = grade_ID;
		grade_ID = newGrade_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.GRADE__GRADE_ID, oldGrade_ID, grade_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGPA() {
		return gpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGPA(float newGPA) {
		float oldGPA = gpa;
		gpa = newGPA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.GRADE__GPA, oldGPA, gpa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.GRADE__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.GRADE__GRADE_ID:
				return getGrade_ID();
			case ClassDiagramPackage.GRADE__GPA:
				return getGPA();
			case ClassDiagramPackage.GRADE__COMMENTS:
				return getComments();
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
			case ClassDiagramPackage.GRADE__GRADE_ID:
				setGrade_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.GRADE__GPA:
				setGPA((Float)newValue);
				return;
			case ClassDiagramPackage.GRADE__COMMENTS:
				setComments((String)newValue);
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
			case ClassDiagramPackage.GRADE__GRADE_ID:
				setGrade_ID(GRADE_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.GRADE__GPA:
				setGPA(GPA_EDEFAULT);
				return;
			case ClassDiagramPackage.GRADE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
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
			case ClassDiagramPackage.GRADE__GRADE_ID:
				return grade_ID != GRADE_ID_EDEFAULT;
			case ClassDiagramPackage.GRADE__GPA:
				return gpa != GPA_EDEFAULT;
			case ClassDiagramPackage.GRADE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
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
		result.append(" (Grade_ID: ");
		result.append(grade_ID);
		result.append(", GPA: ");
		result.append(gpa);
		result.append(", Comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //GradeImpl
