/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.EducationHistory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.EducationHistoryImpl#getEducation_ID <em>Education ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.EducationHistoryImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link ClassDiagram.impl.EducationHistoryImpl#getField_of_study <em>Field of study</em>}</li>
 *   <li>{@link ClassDiagram.impl.EducationHistoryImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link ClassDiagram.impl.EducationHistoryImpl#getGraduationYear <em>Graduation Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationHistoryImpl extends MinimalEObjectImpl.Container implements EducationHistory {
	/**
	 * The default value of the '{@link #getEducation_ID() <em>Education ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducation_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int EDUCATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEducation_ID() <em>Education ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducation_ID()
	 * @generated
	 * @ordered
	 */
	protected int education_ID = EDUCATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected String degree = DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getField_of_study() <em>Field of study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_of_study()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_OF_STUDY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField_of_study() <em>Field of study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField_of_study()
	 * @generated
	 * @ordered
	 */
	protected String field_of_study = FIELD_OF_STUDY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraduationYear() <em>Graduation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraduationYear()
	 * @generated
	 * @ordered
	 */
	protected static final int GRADUATION_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGraduationYear() <em>Graduation Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraduationYear()
	 * @generated
	 * @ordered
	 */
	protected int graduationYear = GRADUATION_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.EDUCATION_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEducation_ID() {
		return education_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEducation_ID(int newEducation_ID) {
		int oldEducation_ID = education_ID;
		education_ID = newEducation_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EDUCATION_HISTORY__EDUCATION_ID, oldEducation_ID, education_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(String newDegree) {
		String oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EDUCATION_HISTORY__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getField_of_study() {
		return field_of_study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField_of_study(String newField_of_study) {
		String oldField_of_study = field_of_study;
		field_of_study = newField_of_study;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EDUCATION_HISTORY__FIELD_OF_STUDY, oldField_of_study, field_of_study));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EDUCATION_HISTORY__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGraduationYear() {
		return graduationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraduationYear(int newGraduationYear) {
		int oldGraduationYear = graduationYear;
		graduationYear = newGraduationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.EDUCATION_HISTORY__GRADUATION_YEAR, oldGraduationYear, graduationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.EDUCATION_HISTORY__EDUCATION_ID:
				return getEducation_ID();
			case ClassDiagramPackage.EDUCATION_HISTORY__DEGREE:
				return getDegree();
			case ClassDiagramPackage.EDUCATION_HISTORY__FIELD_OF_STUDY:
				return getField_of_study();
			case ClassDiagramPackage.EDUCATION_HISTORY__INSTITUTION:
				return getInstitution();
			case ClassDiagramPackage.EDUCATION_HISTORY__GRADUATION_YEAR:
				return getGraduationYear();
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
			case ClassDiagramPackage.EDUCATION_HISTORY__EDUCATION_ID:
				setEducation_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__DEGREE:
				setDegree((String)newValue);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__FIELD_OF_STUDY:
				setField_of_study((String)newValue);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__GRADUATION_YEAR:
				setGraduationYear((Integer)newValue);
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
			case ClassDiagramPackage.EDUCATION_HISTORY__EDUCATION_ID:
				setEducation_ID(EDUCATION_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__FIELD_OF_STUDY:
				setField_of_study(FIELD_OF_STUDY_EDEFAULT);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case ClassDiagramPackage.EDUCATION_HISTORY__GRADUATION_YEAR:
				setGraduationYear(GRADUATION_YEAR_EDEFAULT);
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
			case ClassDiagramPackage.EDUCATION_HISTORY__EDUCATION_ID:
				return education_ID != EDUCATION_ID_EDEFAULT;
			case ClassDiagramPackage.EDUCATION_HISTORY__DEGREE:
				return DEGREE_EDEFAULT == null ? degree != null : !DEGREE_EDEFAULT.equals(degree);
			case ClassDiagramPackage.EDUCATION_HISTORY__FIELD_OF_STUDY:
				return FIELD_OF_STUDY_EDEFAULT == null ? field_of_study != null : !FIELD_OF_STUDY_EDEFAULT.equals(field_of_study);
			case ClassDiagramPackage.EDUCATION_HISTORY__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case ClassDiagramPackage.EDUCATION_HISTORY__GRADUATION_YEAR:
				return graduationYear != GRADUATION_YEAR_EDEFAULT;
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
		result.append(" (Education_ID: ");
		result.append(education_ID);
		result.append(", Degree: ");
		result.append(degree);
		result.append(", field_of_study: ");
		result.append(field_of_study);
		result.append(", Institution: ");
		result.append(institution);
		result.append(", GraduationYear: ");
		result.append(graduationYear);
		result.append(')');
		return result.toString();
	}

} //EducationHistoryImpl
