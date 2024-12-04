/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Marks;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.MarksImpl#getMarks_ID <em>Marks ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.MarksImpl#getWeightage <em>Weightage</em>}</li>
 *   <li>{@link ClassDiagram.impl.MarksImpl#getTotal_Marks <em>Total Marks</em>}</li>
 *   <li>{@link ClassDiagram.impl.MarksImpl#getObtained_Marks <em>Obtained Marks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarksImpl extends MinimalEObjectImpl.Container implements Marks {
	/**
	 * The default value of the '{@link #getMarks_ID() <em>Marks ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int MARKS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarks_ID() <em>Marks ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks_ID()
	 * @generated
	 * @ordered
	 */
	protected int marks_ID = MARKS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightage() <em>Weightage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightage()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeightage() <em>Weightage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightage()
	 * @generated
	 * @ordered
	 */
	protected float weightage = WEIGHTAGE_EDEFAULT;

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
	protected MarksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.MARKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMarks_ID() {
		return marks_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarks_ID(int newMarks_ID) {
		int oldMarks_ID = marks_ID;
		marks_ID = newMarks_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MARKS__MARKS_ID, oldMarks_ID, marks_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWeightage() {
		return weightage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightage(float newWeightage) {
		float oldWeightage = weightage;
		weightage = newWeightage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MARKS__WEIGHTAGE, oldWeightage, weightage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MARKS__TOTAL_MARKS, oldTotal_Marks, total_Marks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.MARKS__OBTAINED_MARKS, oldObtained_Marks, obtained_Marks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.MARKS__MARKS_ID:
				return getMarks_ID();
			case ClassDiagramPackage.MARKS__WEIGHTAGE:
				return getWeightage();
			case ClassDiagramPackage.MARKS__TOTAL_MARKS:
				return getTotal_Marks();
			case ClassDiagramPackage.MARKS__OBTAINED_MARKS:
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
			case ClassDiagramPackage.MARKS__MARKS_ID:
				setMarks_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.MARKS__WEIGHTAGE:
				setWeightage((Float)newValue);
				return;
			case ClassDiagramPackage.MARKS__TOTAL_MARKS:
				setTotal_Marks((Float)newValue);
				return;
			case ClassDiagramPackage.MARKS__OBTAINED_MARKS:
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
			case ClassDiagramPackage.MARKS__MARKS_ID:
				setMarks_ID(MARKS_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.MARKS__WEIGHTAGE:
				setWeightage(WEIGHTAGE_EDEFAULT);
				return;
			case ClassDiagramPackage.MARKS__TOTAL_MARKS:
				setTotal_Marks(TOTAL_MARKS_EDEFAULT);
				return;
			case ClassDiagramPackage.MARKS__OBTAINED_MARKS:
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
			case ClassDiagramPackage.MARKS__MARKS_ID:
				return marks_ID != MARKS_ID_EDEFAULT;
			case ClassDiagramPackage.MARKS__WEIGHTAGE:
				return weightage != WEIGHTAGE_EDEFAULT;
			case ClassDiagramPackage.MARKS__TOTAL_MARKS:
				return total_Marks != TOTAL_MARKS_EDEFAULT;
			case ClassDiagramPackage.MARKS__OBTAINED_MARKS:
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
		result.append(" (Marks_ID: ");
		result.append(marks_ID);
		result.append(", Weightage: ");
		result.append(weightage);
		result.append(", Total_Marks: ");
		result.append(total_Marks);
		result.append(", Obtained_Marks: ");
		result.append(obtained_Marks);
		result.append(')');
		return result.toString();
	}

} //MarksImpl
