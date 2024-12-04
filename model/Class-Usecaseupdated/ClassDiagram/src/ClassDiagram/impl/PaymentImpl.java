/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Payment;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getPayment_ID <em>Payment ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getPayment_type <em>Payment type</em>}</li>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getPayment_Date <em>Payment Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ClassDiagram.impl.PaymentImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getPayment_ID() <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int PAYMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPayment_ID() <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_ID()
	 * @generated
	 * @ordered
	 */
	protected int payment_ID = PAYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment_type() <em>Payment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_type() <em>Payment type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_type()
	 * @generated
	 * @ordered
	 */
	protected String payment_type = PAYMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment_Date() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_Date() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_Date()
	 * @generated
	 * @ordered
	 */
	protected Date payment_Date = PAYMENT_DATE_EDEFAULT;

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
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPayment_ID() {
		return payment_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_ID(int newPayment_ID) {
		int oldPayment_ID = payment_ID;
		payment_ID = newPayment_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__PAYMENT_ID, oldPayment_ID, payment_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayment_type() {
		return payment_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_type(String newPayment_type) {
		String oldPayment_type = payment_type;
		payment_type = newPayment_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__PAYMENT_TYPE, oldPayment_type, payment_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPayment_Date() {
		return payment_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_Date(Date newPayment_Date) {
		Date oldPayment_Date = payment_Date;
		payment_Date = newPayment_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__PAYMENT_DATE, oldPayment_Date, payment_Date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.PAYMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.PAYMENT__PAYMENT_ID:
				return getPayment_ID();
			case ClassDiagramPackage.PAYMENT__AMOUNT:
				return getAmount();
			case ClassDiagramPackage.PAYMENT__PAYMENT_TYPE:
				return getPayment_type();
			case ClassDiagramPackage.PAYMENT__PAYMENT_DATE:
				return getPayment_Date();
			case ClassDiagramPackage.PAYMENT__DESCRIPTION:
				return getDescription();
			case ClassDiagramPackage.PAYMENT__STATUS:
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
			case ClassDiagramPackage.PAYMENT__PAYMENT_ID:
				setPayment_ID((Integer)newValue);
				return;
			case ClassDiagramPackage.PAYMENT__AMOUNT:
				setAmount((Float)newValue);
				return;
			case ClassDiagramPackage.PAYMENT__PAYMENT_TYPE:
				setPayment_type((String)newValue);
				return;
			case ClassDiagramPackage.PAYMENT__PAYMENT_DATE:
				setPayment_Date((Date)newValue);
				return;
			case ClassDiagramPackage.PAYMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClassDiagramPackage.PAYMENT__STATUS:
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
			case ClassDiagramPackage.PAYMENT__PAYMENT_ID:
				setPayment_ID(PAYMENT_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.PAYMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ClassDiagramPackage.PAYMENT__PAYMENT_TYPE:
				setPayment_type(PAYMENT_TYPE_EDEFAULT);
				return;
			case ClassDiagramPackage.PAYMENT__PAYMENT_DATE:
				setPayment_Date(PAYMENT_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.PAYMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClassDiagramPackage.PAYMENT__STATUS:
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
			case ClassDiagramPackage.PAYMENT__PAYMENT_ID:
				return payment_ID != PAYMENT_ID_EDEFAULT;
			case ClassDiagramPackage.PAYMENT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case ClassDiagramPackage.PAYMENT__PAYMENT_TYPE:
				return PAYMENT_TYPE_EDEFAULT == null ? payment_type != null : !PAYMENT_TYPE_EDEFAULT.equals(payment_type);
			case ClassDiagramPackage.PAYMENT__PAYMENT_DATE:
				return PAYMENT_DATE_EDEFAULT == null ? payment_Date != null : !PAYMENT_DATE_EDEFAULT.equals(payment_Date);
			case ClassDiagramPackage.PAYMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClassDiagramPackage.PAYMENT__STATUS:
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
		result.append(" (Payment_ID: ");
		result.append(payment_ID);
		result.append(", Amount: ");
		result.append(amount);
		result.append(", Payment_type: ");
		result.append(payment_type);
		result.append(", Payment_Date: ");
		result.append(payment_Date);
		result.append(", Description: ");
		result.append(description);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
