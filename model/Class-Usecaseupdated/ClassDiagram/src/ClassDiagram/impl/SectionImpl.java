/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Section;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.SectionImpl#getYearSection <em>Year Section</em>}</li>
 *   <li>{@link ClassDiagram.impl.SectionImpl#getClassroom <em>Classroom</em>}</li>
 *   <li>{@link ClassDiagram.impl.SectionImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
	/**
	 * The default value of the '{@link #getYearSection() <em>Year Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearSection()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearSection() <em>Year Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearSection()
	 * @generated
	 * @ordered
	 */
	protected String yearSection = YEAR_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassroom() <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassroom()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassroom() <em>Classroom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassroom()
	 * @generated
	 * @ordered
	 */
	protected String classroom = CLASSROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYearSection() {
		return yearSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearSection(String newYearSection) {
		String oldYearSection = yearSection;
		yearSection = newYearSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SECTION__YEAR_SECTION, oldYearSection, yearSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassroom() {
		return classroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassroom(String newClassroom) {
		String oldClassroom = classroom;
		classroom = newClassroom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SECTION__CLASSROOM, oldClassroom, classroom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.SECTION__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.SECTION__YEAR_SECTION:
				return getYearSection();
			case ClassDiagramPackage.SECTION__CLASSROOM:
				return getClassroom();
			case ClassDiagramPackage.SECTION__CAPACITY:
				return getCapacity();
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
			case ClassDiagramPackage.SECTION__YEAR_SECTION:
				setYearSection((String)newValue);
				return;
			case ClassDiagramPackage.SECTION__CLASSROOM:
				setClassroom((String)newValue);
				return;
			case ClassDiagramPackage.SECTION__CAPACITY:
				setCapacity((Integer)newValue);
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
			case ClassDiagramPackage.SECTION__YEAR_SECTION:
				setYearSection(YEAR_SECTION_EDEFAULT);
				return;
			case ClassDiagramPackage.SECTION__CLASSROOM:
				setClassroom(CLASSROOM_EDEFAULT);
				return;
			case ClassDiagramPackage.SECTION__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case ClassDiagramPackage.SECTION__YEAR_SECTION:
				return YEAR_SECTION_EDEFAULT == null ? yearSection != null : !YEAR_SECTION_EDEFAULT.equals(yearSection);
			case ClassDiagramPackage.SECTION__CLASSROOM:
				return CLASSROOM_EDEFAULT == null ? classroom != null : !CLASSROOM_EDEFAULT.equals(classroom);
			case ClassDiagramPackage.SECTION__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
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
		result.append(" (YearSection: ");
		result.append(yearSection);
		result.append(", Classroom: ");
		result.append(classroom);
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
