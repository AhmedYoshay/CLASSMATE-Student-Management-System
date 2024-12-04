/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ClassDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackage eINSTANCE = ClassDiagram.impl.ClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BookImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ISBN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Book_IssueImpl <em>Book Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Book_IssueImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBook_Issue()
	 * @generated
	 */
	int BOOK_ISSUE = 1;

	/**
	 * The feature id for the '<em><b>Issue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE__ISSUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE__ISSUE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE__DUE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Return Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE__RETURN_DATE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Book Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Book Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.CourseImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Course id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_ID = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.PrerequisitesImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPrerequisites()
	 * @generated
	 */
	int PREREQUISITES = 3;

	/**
	 * The feature id for the '<em><b>Course ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES__COURSE_ID = 0;

	/**
	 * The feature id for the '<em><b>Prerequisites ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES__PREREQUISITES_ID = 1;

	/**
	 * The number of structural features of the '<em>Prerequisites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prerequisites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREREQUISITES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.UserImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTH_DATE = 3;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GENDER = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHONE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REGISTRATION_DATE = 8;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.StudentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 4;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__BIRTH_DATE = USER__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__GENDER = USER__GENDER;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PROGRAM = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STATUS = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>View Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VIEW_ATTENDANCE = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>View Marks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VIEW_MARKS = USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Register Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___REGISTER_COURSE = USER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Withdraw Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___WITHDRAW_COURSE = USER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Give Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___GIVE_FEEDBACK = USER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>View Library Books</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VIEW_LIBRARY_BOOKS = USER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Issue Books</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___ISSUE_BOOKS = USER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>View Transcript</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VIEW_TRANSCRIPT = USER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Print Transcript</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___PRINT_TRANSCRIPT = USER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.SectionImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 6;

	/**
	 * The feature id for the '<em><b>Year Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__YEAR_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Classroom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CLASSROOM = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CAPACITY = 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.TeacherImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 7;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__BIRTH_DATE = USER__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__GENDER = USER__GENDER;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Teacher ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__TEACHER_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__PROGRAM = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__STATUS = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__SALARY = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Viewmarks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___VIEWMARKS = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Editmarks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___EDITMARKS = USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Heading</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___ADD_HEADING = USER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___ADD_SUBCATEGORY = USER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Marks Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___ADD_MARKS_ENTRY = USER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___ADD_ATTENDANCE = USER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>View Attendance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___VIEW_ATTENDANCE = USER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Edit Marks Entry</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___EDIT_MARKS_ENTRY = USER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Edit Subcategory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___EDIT_SUBCATEGORY = USER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Submit Grades</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___SUBMIT_GRADES = USER_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = USER_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.EducationHistoryImpl <em>Education History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.EducationHistoryImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEducationHistory()
	 * @generated
	 */
	int EDUCATION_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Education ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY__EDUCATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY__DEGREE = 1;

	/**
	 * The feature id for the '<em><b>Field of study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY__FIELD_OF_STUDY = 2;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY__INSTITUTION = 3;

	/**
	 * The feature id for the '<em><b>Graduation Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY__GRADUATION_YEAR = 4;

	/**
	 * The number of structural features of the '<em>Education History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Education History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.PaymentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 9;

	/**
	 * The feature id for the '<em><b>Payment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Payment type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__STATUS = 5;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FileImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 10;

	/**
	 * The feature id for the '<em><b>File ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_ID = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_PATH = 2;

	/**
	 * The feature id for the '<em><b>File type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Upload Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__UPLOAD_DATE = 5;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.GradeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 11;

	/**
	 * The feature id for the '<em><b>Grade ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__GRADE_ID = 0;

	/**
	 * The feature id for the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__GPA = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__COMMENTS = 2;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AttendanceImpl <em>Attendance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AttendanceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttendance()
	 * @generated
	 */
	int ATTENDANCE = 12;

	/**
	 * The feature id for the '<em><b>Attendance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDANCE__ATTENDANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDANCE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDANCE__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Attendance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attendance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTENDANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.EnrollmentImpl <em>Enrollment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.EnrollmentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEnrollment()
	 * @generated
	 */
	int ENROLLMENT = 13;

	/**
	 * The feature id for the '<em><b>Enrollment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__ENROLLMENT_ID = 0;

	/**
	 * The number of structural features of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FeedbackImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 14;

	/**
	 * The feature id for the '<em><b>Feedback ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__FEEDBACK_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CREATION_TIME = 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.MarksImpl <em>Marks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.MarksImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getMarks()
	 * @generated
	 */
	int MARKS = 15;

	/**
	 * The feature id for the '<em><b>Marks ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS__MARKS_ID = 0;

	/**
	 * The feature id for the '<em><b>Weightage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS__WEIGHTAGE = 1;

	/**
	 * The feature id for the '<em><b>Total Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS__TOTAL_MARKS = 2;

	/**
	 * The feature id for the '<em><b>Obtained Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS__OBTAINED_MARKS = 3;

	/**
	 * The number of structural features of the '<em>Marks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Marks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.CommentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 16;

	/**
	 * The feature id for the '<em><b>Comment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AssignmentImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 17;

	/**
	 * The feature id for the '<em><b>Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DUE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Total Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TOTAL_MARKS = 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.SubmissionImpl <em>Submission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.SubmissionImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getSubmission()
	 * @generated
	 */
	int SUBMISSION = 18;

	/**
	 * The feature id for the '<em><b>Submission ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__SUBMISSION_ID = 0;

	/**
	 * The feature id for the '<em><b>Submission time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__SUBMISSION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Obtained Marks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__OBTAINED_MARKS = 2;

	/**
	 * The number of structural features of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.PostImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPost()
	 * @generated
	 */
	int POST = 19;

	/**
	 * The feature id for the '<em><b>Post ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__POST_ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CREATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.AdminImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 20;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__BIRTH_DATE = USER__BIRTH_DATE;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__GENDER = USER__GENDER;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USERNAME = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORD = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>View Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___VIEW_COURSES = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_COURSES = USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Edit Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___EDIT_COURSES = USER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Delete Courses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DELETE_COURSES = USER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>View Students</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___VIEW_STUDENTS = USER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Students</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_STUDENTS = USER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Edit Students</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___EDIT_STUDENTS = USER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Delete Students</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DELETE_STUDENTS = USER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Teacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_TEACHER = USER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Teacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DELETE_TEACHER = USER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Edit Teacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___EDIT_TEACHER = USER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Assign Sections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ASSIGN_SECTIONS = USER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Delete Sections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DELETE_SECTIONS = USER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Assign Pre Requistes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ASSIGN_PRE_REQUISTES = USER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>View Feed Back</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___VIEW_FEED_BACK = USER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Star Feed Back</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___STAR_FEED_BACK = USER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Delete Feedback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___DELETE_FEEDBACK = USER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Mark Issued Book As Returned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___MARK_ISSUED_BOOK_AS_RETURNED = USER_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 18;


	/**
	 * Returns the meta object for class '{@link ClassDiagram.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see ClassDiagram.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see ClassDiagram.Book#getISBN()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_ISBN();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Book#getName()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see ClassDiagram.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Author();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see ClassDiagram.Book#getAmount()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Amount();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Book#getDescription()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Description();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Book_Issue <em>Book Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Issue</em>'.
	 * @see ClassDiagram.Book_Issue
	 * @generated
	 */
	EClass getBook_Issue();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book_Issue#getIssue_ID <em>Issue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue ID</em>'.
	 * @see ClassDiagram.Book_Issue#getIssue_ID()
	 * @see #getBook_Issue()
	 * @generated
	 */
	EAttribute getBook_Issue_Issue_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book_Issue#getIssue_Date <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see ClassDiagram.Book_Issue#getIssue_Date()
	 * @see #getBook_Issue()
	 * @generated
	 */
	EAttribute getBook_Issue_Issue_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book_Issue#getDue_Date <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see ClassDiagram.Book_Issue#getDue_Date()
	 * @see #getBook_Issue()
	 * @generated
	 */
	EAttribute getBook_Issue_Due_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book_Issue#getReturn_Date <em>Return Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Date</em>'.
	 * @see ClassDiagram.Book_Issue#getReturn_Date()
	 * @see #getBook_Issue()
	 * @generated
	 */
	EAttribute getBook_Issue_Return_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Book_Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Book_Issue#getStatus()
	 * @see #getBook_Issue()
	 * @generated
	 */
	EAttribute getBook_Issue_Status();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see ClassDiagram.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Course#getCourse_id <em>Course id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course id</em>'.
	 * @see ClassDiagram.Course#getCourse_id()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Course_id();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Course#getCourse_Name <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see ClassDiagram.Course#getCourse_Name()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Course_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Course#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Course#getDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see ClassDiagram.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Prerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prerequisites</em>'.
	 * @see ClassDiagram.Prerequisites
	 * @generated
	 */
	EClass getPrerequisites();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Prerequisites#getCourse_ID <em>Course ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course ID</em>'.
	 * @see ClassDiagram.Prerequisites#getCourse_ID()
	 * @see #getPrerequisites()
	 * @generated
	 */
	EAttribute getPrerequisites_Course_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Prerequisites#getPrerequisites_ID <em>Prerequisites ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prerequisites ID</em>'.
	 * @see ClassDiagram.Prerequisites#getPrerequisites_ID()
	 * @see #getPrerequisites()
	 * @generated
	 */
	EAttribute getPrerequisites_Prerequisites_ID();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see ClassDiagram.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Student#getStudent_ID <em>Student ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student ID</em>'.
	 * @see ClassDiagram.Student#getStudent_ID()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Student_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Student#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see ClassDiagram.Student#getProgram()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Program();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Student#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Student#getStatus()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Status();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#viewAttendance() <em>View Attendance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Attendance</em>' operation.
	 * @see ClassDiagram.Student#viewAttendance()
	 * @generated
	 */
	EOperation getStudent__ViewAttendance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#viewMarks() <em>View Marks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Marks</em>' operation.
	 * @see ClassDiagram.Student#viewMarks()
	 * @generated
	 */
	EOperation getStudent__ViewMarks();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#registerCourse() <em>Register Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Course</em>' operation.
	 * @see ClassDiagram.Student#registerCourse()
	 * @generated
	 */
	EOperation getStudent__RegisterCourse();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#withdrawCourse() <em>Withdraw Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Withdraw Course</em>' operation.
	 * @see ClassDiagram.Student#withdrawCourse()
	 * @generated
	 */
	EOperation getStudent__WithdrawCourse();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#giveFeedback() <em>Give Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Give Feedback</em>' operation.
	 * @see ClassDiagram.Student#giveFeedback()
	 * @generated
	 */
	EOperation getStudent__GiveFeedback();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#viewLibraryBooks() <em>View Library Books</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Library Books</em>' operation.
	 * @see ClassDiagram.Student#viewLibraryBooks()
	 * @generated
	 */
	EOperation getStudent__ViewLibraryBooks();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#issueBooks() <em>Issue Books</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Issue Books</em>' operation.
	 * @see ClassDiagram.Student#issueBooks()
	 * @generated
	 */
	EOperation getStudent__IssueBooks();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#viewTranscript() <em>View Transcript</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Transcript</em>' operation.
	 * @see ClassDiagram.Student#viewTranscript()
	 * @generated
	 */
	EOperation getStudent__ViewTranscript();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Student#PrintTranscript() <em>Print Transcript</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Transcript</em>' operation.
	 * @see ClassDiagram.Student#PrintTranscript()
	 * @generated
	 */
	EOperation getStudent__PrintTranscript();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ClassDiagram.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getUser_ID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see ClassDiagram.User#getUser_ID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_User_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ClassDiagram.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ClassDiagram.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getBirth_Date <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see ClassDiagram.User#getBirth_Date()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Birth_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see ClassDiagram.User#getGender()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Gender();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ClassDiagram.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ClassDiagram.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Address();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see ClassDiagram.User#getPhoneNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.User#getRegistrationDate <em>Registration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Date</em>'.
	 * @see ClassDiagram.User#getRegistrationDate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_RegistrationDate();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see ClassDiagram.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Section#getYearSection <em>Year Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Section</em>'.
	 * @see ClassDiagram.Section#getYearSection()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_YearSection();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Section#getClassroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classroom</em>'.
	 * @see ClassDiagram.Section#getClassroom()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Classroom();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Section#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ClassDiagram.Section#getCapacity()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Capacity();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see ClassDiagram.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Teacher#getTeacher_ID <em>Teacher ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teacher ID</em>'.
	 * @see ClassDiagram.Teacher#getTeacher_ID()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Teacher_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Teacher#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see ClassDiagram.Teacher#getProgram()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Program();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Teacher#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Teacher#getStatus()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Status();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Teacher#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see ClassDiagram.Teacher#getSalary()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Salary();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#viewmarks() <em>Viewmarks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Viewmarks</em>' operation.
	 * @see ClassDiagram.Teacher#viewmarks()
	 * @generated
	 */
	EOperation getTeacher__Viewmarks();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#editmarks() <em>Editmarks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Editmarks</em>' operation.
	 * @see ClassDiagram.Teacher#editmarks()
	 * @generated
	 */
	EOperation getTeacher__Editmarks();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#addHeading() <em>Add Heading</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Heading</em>' operation.
	 * @see ClassDiagram.Teacher#addHeading()
	 * @generated
	 */
	EOperation getTeacher__AddHeading();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#addSubcategory() <em>Add Subcategory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Subcategory</em>' operation.
	 * @see ClassDiagram.Teacher#addSubcategory()
	 * @generated
	 */
	EOperation getTeacher__AddSubcategory();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#addMarksEntry() <em>Add Marks Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Marks Entry</em>' operation.
	 * @see ClassDiagram.Teacher#addMarksEntry()
	 * @generated
	 */
	EOperation getTeacher__AddMarksEntry();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#addAttendance() <em>Add Attendance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Attendance</em>' operation.
	 * @see ClassDiagram.Teacher#addAttendance()
	 * @generated
	 */
	EOperation getTeacher__AddAttendance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#viewAttendance() <em>View Attendance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Attendance</em>' operation.
	 * @see ClassDiagram.Teacher#viewAttendance()
	 * @generated
	 */
	EOperation getTeacher__ViewAttendance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#editMarksEntry() <em>Edit Marks Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Marks Entry</em>' operation.
	 * @see ClassDiagram.Teacher#editMarksEntry()
	 * @generated
	 */
	EOperation getTeacher__EditMarksEntry();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#editSubcategory() <em>Edit Subcategory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Subcategory</em>' operation.
	 * @see ClassDiagram.Teacher#editSubcategory()
	 * @generated
	 */
	EOperation getTeacher__EditSubcategory();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Teacher#submitGrades() <em>Submit Grades</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit Grades</em>' operation.
	 * @see ClassDiagram.Teacher#submitGrades()
	 * @generated
	 */
	EOperation getTeacher__SubmitGrades();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.EducationHistory <em>Education History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education History</em>'.
	 * @see ClassDiagram.EducationHistory
	 * @generated
	 */
	EClass getEducationHistory();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EducationHistory#getEducation_ID <em>Education ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Education ID</em>'.
	 * @see ClassDiagram.EducationHistory#getEducation_ID()
	 * @see #getEducationHistory()
	 * @generated
	 */
	EAttribute getEducationHistory_Education_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EducationHistory#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see ClassDiagram.EducationHistory#getDegree()
	 * @see #getEducationHistory()
	 * @generated
	 */
	EAttribute getEducationHistory_Degree();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EducationHistory#getField_of_study <em>Field of study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field of study</em>'.
	 * @see ClassDiagram.EducationHistory#getField_of_study()
	 * @see #getEducationHistory()
	 * @generated
	 */
	EAttribute getEducationHistory_Field_of_study();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EducationHistory#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see ClassDiagram.EducationHistory#getInstitution()
	 * @see #getEducationHistory()
	 * @generated
	 */
	EAttribute getEducationHistory_Institution();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.EducationHistory#getGraduationYear <em>Graduation Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graduation Year</em>'.
	 * @see ClassDiagram.EducationHistory#getGraduationYear()
	 * @see #getEducationHistory()
	 * @generated
	 */
	EAttribute getEducationHistory_GraduationYear();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see ClassDiagram.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getPayment_ID <em>Payment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment ID</em>'.
	 * @see ClassDiagram.Payment#getPayment_ID()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see ClassDiagram.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getPayment_type <em>Payment type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment type</em>'.
	 * @see ClassDiagram.Payment#getPayment_type()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_type();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getPayment_Date <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see ClassDiagram.Payment#getPayment_Date()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Payment#getDescription()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Payment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Payment#getStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Status();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see ClassDiagram.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getFile_ID <em>File ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File ID</em>'.
	 * @see ClassDiagram.File#getFile_ID()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_File_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getFile_Name <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see ClassDiagram.File#getFile_Name()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_File_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getFile_Path <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see ClassDiagram.File#getFile_Path()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_File_Path();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getFile_type <em>File type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File type</em>'.
	 * @see ClassDiagram.File#getFile_type()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_File_type();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getFile_Size <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see ClassDiagram.File#getFile_Size()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_File_Size();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.File#getUpload_Date <em>Upload Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload Date</em>'.
	 * @see ClassDiagram.File#getUpload_Date()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Upload_Date();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see ClassDiagram.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Grade#getGrade_ID <em>Grade ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade ID</em>'.
	 * @see ClassDiagram.Grade#getGrade_ID()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Grade_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Grade#getGPA <em>GPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GPA</em>'.
	 * @see ClassDiagram.Grade#getGPA()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_GPA();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Grade#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see ClassDiagram.Grade#getComments()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Comments();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Attendance <em>Attendance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attendance</em>'.
	 * @see ClassDiagram.Attendance
	 * @generated
	 */
	EClass getAttendance();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Attendance#getAttendance_ID <em>Attendance ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attendance ID</em>'.
	 * @see ClassDiagram.Attendance#getAttendance_ID()
	 * @see #getAttendance()
	 * @generated
	 */
	EAttribute getAttendance_Attendance_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Attendance#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ClassDiagram.Attendance#getDate()
	 * @see #getAttendance()
	 * @generated
	 */
	EAttribute getAttendance_Date();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Attendance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ClassDiagram.Attendance#getStatus()
	 * @see #getAttendance()
	 * @generated
	 */
	EAttribute getAttendance_Status();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrollment</em>'.
	 * @see ClassDiagram.Enrollment
	 * @generated
	 */
	EClass getEnrollment();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Enrollment#getEnrollmentID <em>Enrollment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enrollment ID</em>'.
	 * @see ClassDiagram.Enrollment#getEnrollmentID()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_EnrollmentID();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see ClassDiagram.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Feedback#getFeedback_ID <em>Feedback ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback ID</em>'.
	 * @see ClassDiagram.Feedback#getFeedback_ID()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Feedback_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Feedback#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Feedback#getDescription()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Feedback#getCreation_time <em>Creation time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation time</em>'.
	 * @see ClassDiagram.Feedback#getCreation_time()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Creation_time();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Marks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marks</em>'.
	 * @see ClassDiagram.Marks
	 * @generated
	 */
	EClass getMarks();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Marks#getMarks_ID <em>Marks ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marks ID</em>'.
	 * @see ClassDiagram.Marks#getMarks_ID()
	 * @see #getMarks()
	 * @generated
	 */
	EAttribute getMarks_Marks_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Marks#getWeightage <em>Weightage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weightage</em>'.
	 * @see ClassDiagram.Marks#getWeightage()
	 * @see #getMarks()
	 * @generated
	 */
	EAttribute getMarks_Weightage();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Marks#getTotal_Marks <em>Total Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Marks</em>'.
	 * @see ClassDiagram.Marks#getTotal_Marks()
	 * @see #getMarks()
	 * @generated
	 */
	EAttribute getMarks_Total_Marks();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Marks#getObtained_Marks <em>Obtained Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obtained Marks</em>'.
	 * @see ClassDiagram.Marks#getObtained_Marks()
	 * @see #getMarks()
	 * @generated
	 */
	EAttribute getMarks_Obtained_Marks();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see ClassDiagram.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Comment#getComment_ID <em>Comment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment ID</em>'.
	 * @see ClassDiagram.Comment#getComment_ID()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Comment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Comment#getDescription()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Description();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see ClassDiagram.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Assignment#getAssignmentID <em>Assignment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment ID</em>'.
	 * @see ClassDiagram.Assignment#getAssignmentID()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_AssignmentID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Assignment#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see ClassDiagram.Assignment#getDueDate()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Assignment#getTotal_Marks <em>Total Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Marks</em>'.
	 * @see ClassDiagram.Assignment#getTotal_Marks()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Total_Marks();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Submission <em>Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submission</em>'.
	 * @see ClassDiagram.Submission
	 * @generated
	 */
	EClass getSubmission();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Submission#getSubmission_ID <em>Submission ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submission ID</em>'.
	 * @see ClassDiagram.Submission#getSubmission_ID()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Submission_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Submission#getSubmission_time <em>Submission time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submission time</em>'.
	 * @see ClassDiagram.Submission#getSubmission_time()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Submission_time();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Submission#getObtained_Marks <em>Obtained Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obtained Marks</em>'.
	 * @see ClassDiagram.Submission#getObtained_Marks()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Obtained_Marks();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see ClassDiagram.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Post#getPost_ID <em>Post ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post ID</em>'.
	 * @see ClassDiagram.Post#getPost_ID()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Post_ID();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Post#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ClassDiagram.Post#getDescription()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Description();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Post#getCreation_Date <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see ClassDiagram.Post#getCreation_Date()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Creation_Date();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see ClassDiagram.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Admin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ClassDiagram.Admin#getId()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Id();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Admin#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see ClassDiagram.Admin#getUsername()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Username();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Admin#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ClassDiagram.Admin#getPassword()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Password();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#viewCourses() <em>View Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Courses</em>' operation.
	 * @see ClassDiagram.Admin#viewCourses()
	 * @generated
	 */
	EOperation getAdmin__ViewCourses();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#addCourses() <em>Add Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Courses</em>' operation.
	 * @see ClassDiagram.Admin#addCourses()
	 * @generated
	 */
	EOperation getAdmin__AddCourses();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#EditCourses() <em>Edit Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Courses</em>' operation.
	 * @see ClassDiagram.Admin#EditCourses()
	 * @generated
	 */
	EOperation getAdmin__EditCourses();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#DeleteCourses() <em>Delete Courses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Courses</em>' operation.
	 * @see ClassDiagram.Admin#DeleteCourses()
	 * @generated
	 */
	EOperation getAdmin__DeleteCourses();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#viewStudents() <em>View Students</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Students</em>' operation.
	 * @see ClassDiagram.Admin#viewStudents()
	 * @generated
	 */
	EOperation getAdmin__ViewStudents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#addStudents() <em>Add Students</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Students</em>' operation.
	 * @see ClassDiagram.Admin#addStudents()
	 * @generated
	 */
	EOperation getAdmin__AddStudents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#editStudents() <em>Edit Students</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Students</em>' operation.
	 * @see ClassDiagram.Admin#editStudents()
	 * @generated
	 */
	EOperation getAdmin__EditStudents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#DeleteStudents() <em>Delete Students</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Students</em>' operation.
	 * @see ClassDiagram.Admin#DeleteStudents()
	 * @generated
	 */
	EOperation getAdmin__DeleteStudents();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#addTeacher() <em>Add Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Teacher</em>' operation.
	 * @see ClassDiagram.Admin#addTeacher()
	 * @generated
	 */
	EOperation getAdmin__AddTeacher();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#deleteTeacher() <em>Delete Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Teacher</em>' operation.
	 * @see ClassDiagram.Admin#deleteTeacher()
	 * @generated
	 */
	EOperation getAdmin__DeleteTeacher();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#editTeacher() <em>Edit Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Teacher</em>' operation.
	 * @see ClassDiagram.Admin#editTeacher()
	 * @generated
	 */
	EOperation getAdmin__EditTeacher();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#assignSections() <em>Assign Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Sections</em>' operation.
	 * @see ClassDiagram.Admin#assignSections()
	 * @generated
	 */
	EOperation getAdmin__AssignSections();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#deleteSections() <em>Delete Sections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Sections</em>' operation.
	 * @see ClassDiagram.Admin#deleteSections()
	 * @generated
	 */
	EOperation getAdmin__DeleteSections();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#AssignPreRequistes() <em>Assign Pre Requistes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Pre Requistes</em>' operation.
	 * @see ClassDiagram.Admin#AssignPreRequistes()
	 * @generated
	 */
	EOperation getAdmin__AssignPreRequistes();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#viewFeedBack() <em>View Feed Back</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Feed Back</em>' operation.
	 * @see ClassDiagram.Admin#viewFeedBack()
	 * @generated
	 */
	EOperation getAdmin__ViewFeedBack();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#starFeedBack() <em>Star Feed Back</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Star Feed Back</em>' operation.
	 * @see ClassDiagram.Admin#starFeedBack()
	 * @generated
	 */
	EOperation getAdmin__StarFeedBack();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#DeleteFeedback() <em>Delete Feedback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Feedback</em>' operation.
	 * @see ClassDiagram.Admin#DeleteFeedback()
	 * @generated
	 */
	EOperation getAdmin__DeleteFeedback();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.Admin#markIssuedBookAsReturned() <em>Mark Issued Book As Returned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark Issued Book As Returned</em>' operation.
	 * @see ClassDiagram.Admin#markIssuedBookAsReturned()
	 * @generated
	 */
	EOperation getAdmin__MarkIssuedBookAsReturned();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagramFactory getClassDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BookImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>ISBN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__ISBN = eINSTANCE.getBook_ISBN();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__NAME = eINSTANCE.getBook_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__AUTHOR = eINSTANCE.getBook_Author();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__AMOUNT = eINSTANCE.getBook_Amount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__DESCRIPTION = eINSTANCE.getBook_Description();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Book_IssueImpl <em>Book Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Book_IssueImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBook_Issue()
		 * @generated
		 */
		EClass BOOK_ISSUE = eINSTANCE.getBook_Issue();

		/**
		 * The meta object literal for the '<em><b>Issue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ISSUE__ISSUE_ID = eINSTANCE.getBook_Issue_Issue_ID();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ISSUE__ISSUE_DATE = eINSTANCE.getBook_Issue_Issue_Date();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ISSUE__DUE_DATE = eINSTANCE.getBook_Issue_Due_Date();

		/**
		 * The meta object literal for the '<em><b>Return Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ISSUE__RETURN_DATE = eINSTANCE.getBook_Issue_Return_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ISSUE__STATUS = eINSTANCE.getBook_Issue_Status();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.CourseImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_ID = eINSTANCE.getCourse_Course_id();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_Course_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DESCRIPTION = eINSTANCE.getCourse_Description();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.PrerequisitesImpl <em>Prerequisites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.PrerequisitesImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPrerequisites()
		 * @generated
		 */
		EClass PREREQUISITES = eINSTANCE.getPrerequisites();

		/**
		 * The meta object literal for the '<em><b>Course ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITES__COURSE_ID = eINSTANCE.getPrerequisites_Course_ID();

		/**
		 * The meta object literal for the '<em><b>Prerequisites ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREREQUISITES__PREREQUISITES_ID = eINSTANCE.getPrerequisites_Prerequisites_ID();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.StudentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Student ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_ID = eINSTANCE.getStudent_Student_ID();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__PROGRAM = eINSTANCE.getStudent_Program();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STATUS = eINSTANCE.getStudent_Status();

		/**
		 * The meta object literal for the '<em><b>View Attendance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___VIEW_ATTENDANCE = eINSTANCE.getStudent__ViewAttendance();

		/**
		 * The meta object literal for the '<em><b>View Marks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___VIEW_MARKS = eINSTANCE.getStudent__ViewMarks();

		/**
		 * The meta object literal for the '<em><b>Register Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___REGISTER_COURSE = eINSTANCE.getStudent__RegisterCourse();

		/**
		 * The meta object literal for the '<em><b>Withdraw Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___WITHDRAW_COURSE = eINSTANCE.getStudent__WithdrawCourse();

		/**
		 * The meta object literal for the '<em><b>Give Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___GIVE_FEEDBACK = eINSTANCE.getStudent__GiveFeedback();

		/**
		 * The meta object literal for the '<em><b>View Library Books</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___VIEW_LIBRARY_BOOKS = eINSTANCE.getStudent__ViewLibraryBooks();

		/**
		 * The meta object literal for the '<em><b>Issue Books</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___ISSUE_BOOKS = eINSTANCE.getStudent__IssueBooks();

		/**
		 * The meta object literal for the '<em><b>View Transcript</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___VIEW_TRANSCRIPT = eINSTANCE.getStudent__ViewTranscript();

		/**
		 * The meta object literal for the '<em><b>Print Transcript</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___PRINT_TRANSCRIPT = eINSTANCE.getStudent__PrintTranscript();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.UserImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_User_ID();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTH_DATE = eINSTANCE.getUser_Birth_Date();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__GENDER = eINSTANCE.getUser_Gender();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHONE_NUMBER = eINSTANCE.getUser_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Registration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__REGISTRATION_DATE = eINSTANCE.getUser_RegistrationDate();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.SectionImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Year Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__YEAR_SECTION = eINSTANCE.getSection_YearSection();

		/**
		 * The meta object literal for the '<em><b>Classroom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__CLASSROOM = eINSTANCE.getSection_Classroom();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__CAPACITY = eINSTANCE.getSection_Capacity();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.TeacherImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Teacher ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__TEACHER_ID = eINSTANCE.getTeacher_Teacher_ID();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__PROGRAM = eINSTANCE.getTeacher_Program();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__STATUS = eINSTANCE.getTeacher_Status();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__SALARY = eINSTANCE.getTeacher_Salary();

		/**
		 * The meta object literal for the '<em><b>Viewmarks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___VIEWMARKS = eINSTANCE.getTeacher__Viewmarks();

		/**
		 * The meta object literal for the '<em><b>Editmarks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___EDITMARKS = eINSTANCE.getTeacher__Editmarks();

		/**
		 * The meta object literal for the '<em><b>Add Heading</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___ADD_HEADING = eINSTANCE.getTeacher__AddHeading();

		/**
		 * The meta object literal for the '<em><b>Add Subcategory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___ADD_SUBCATEGORY = eINSTANCE.getTeacher__AddSubcategory();

		/**
		 * The meta object literal for the '<em><b>Add Marks Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___ADD_MARKS_ENTRY = eINSTANCE.getTeacher__AddMarksEntry();

		/**
		 * The meta object literal for the '<em><b>Add Attendance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___ADD_ATTENDANCE = eINSTANCE.getTeacher__AddAttendance();

		/**
		 * The meta object literal for the '<em><b>View Attendance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___VIEW_ATTENDANCE = eINSTANCE.getTeacher__ViewAttendance();

		/**
		 * The meta object literal for the '<em><b>Edit Marks Entry</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___EDIT_MARKS_ENTRY = eINSTANCE.getTeacher__EditMarksEntry();

		/**
		 * The meta object literal for the '<em><b>Edit Subcategory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___EDIT_SUBCATEGORY = eINSTANCE.getTeacher__EditSubcategory();

		/**
		 * The meta object literal for the '<em><b>Submit Grades</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___SUBMIT_GRADES = eINSTANCE.getTeacher__SubmitGrades();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.EducationHistoryImpl <em>Education History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.EducationHistoryImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEducationHistory()
		 * @generated
		 */
		EClass EDUCATION_HISTORY = eINSTANCE.getEducationHistory();

		/**
		 * The meta object literal for the '<em><b>Education ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_HISTORY__EDUCATION_ID = eINSTANCE.getEducationHistory_Education_ID();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_HISTORY__DEGREE = eINSTANCE.getEducationHistory_Degree();

		/**
		 * The meta object literal for the '<em><b>Field of study</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_HISTORY__FIELD_OF_STUDY = eINSTANCE.getEducationHistory_Field_of_study();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_HISTORY__INSTITUTION = eINSTANCE.getEducationHistory_Institution();

		/**
		 * The meta object literal for the '<em><b>Graduation Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_HISTORY__GRADUATION_YEAR = eINSTANCE.getEducationHistory_GraduationYear();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.PaymentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_Payment_ID();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Payment type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_TYPE = eINSTANCE.getPayment_Payment_type();

		/**
		 * The meta object literal for the '<em><b>Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_DATE = eINSTANCE.getPayment_Payment_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__DESCRIPTION = eINSTANCE.getPayment_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__STATUS = eINSTANCE.getPayment_Status();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.FileImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>File ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_ID = eINSTANCE.getFile_File_ID();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_NAME = eINSTANCE.getFile_File_Name();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_PATH = eINSTANCE.getFile_File_Path();

		/**
		 * The meta object literal for the '<em><b>File type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_TYPE = eINSTANCE.getFile_File_type();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_SIZE = eINSTANCE.getFile_File_Size();

		/**
		 * The meta object literal for the '<em><b>Upload Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__UPLOAD_DATE = eINSTANCE.getFile_Upload_Date();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.GradeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Grade ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__GRADE_ID = eINSTANCE.getGrade_Grade_ID();

		/**
		 * The meta object literal for the '<em><b>GPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__GPA = eINSTANCE.getGrade_GPA();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__COMMENTS = eINSTANCE.getGrade_Comments();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AttendanceImpl <em>Attendance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AttendanceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAttendance()
		 * @generated
		 */
		EClass ATTENDANCE = eINSTANCE.getAttendance();

		/**
		 * The meta object literal for the '<em><b>Attendance ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDANCE__ATTENDANCE_ID = eINSTANCE.getAttendance_Attendance_ID();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDANCE__DATE = eINSTANCE.getAttendance_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTENDANCE__STATUS = eINSTANCE.getAttendance_Status();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.EnrollmentImpl <em>Enrollment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.EnrollmentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getEnrollment()
		 * @generated
		 */
		EClass ENROLLMENT = eINSTANCE.getEnrollment();

		/**
		 * The meta object literal for the '<em><b>Enrollment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__ENROLLMENT_ID = eINSTANCE.getEnrollment_EnrollmentID();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.FeedbackImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Feedback ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__FEEDBACK_ID = eINSTANCE.getFeedback_Feedback_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__DESCRIPTION = eINSTANCE.getFeedback_Description();

		/**
		 * The meta object literal for the '<em><b>Creation time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__CREATION_TIME = eINSTANCE.getFeedback_Creation_time();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.MarksImpl <em>Marks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.MarksImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getMarks()
		 * @generated
		 */
		EClass MARKS = eINSTANCE.getMarks();

		/**
		 * The meta object literal for the '<em><b>Marks ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKS__MARKS_ID = eINSTANCE.getMarks_Marks_ID();

		/**
		 * The meta object literal for the '<em><b>Weightage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKS__WEIGHTAGE = eINSTANCE.getMarks_Weightage();

		/**
		 * The meta object literal for the '<em><b>Total Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKS__TOTAL_MARKS = eINSTANCE.getMarks_Total_Marks();

		/**
		 * The meta object literal for the '<em><b>Obtained Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKS__OBTAINED_MARKS = eINSTANCE.getMarks_Obtained_Marks();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.CommentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT_ID = eINSTANCE.getComment_Comment_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DESCRIPTION = eINSTANCE.getComment_Description();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AssignmentImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__ASSIGNMENT_ID = eINSTANCE.getAssignment_AssignmentID();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__DUE_DATE = eINSTANCE.getAssignment_DueDate();

		/**
		 * The meta object literal for the '<em><b>Total Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__TOTAL_MARKS = eINSTANCE.getAssignment_Total_Marks();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.SubmissionImpl <em>Submission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.SubmissionImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getSubmission()
		 * @generated
		 */
		EClass SUBMISSION = eINSTANCE.getSubmission();

		/**
		 * The meta object literal for the '<em><b>Submission ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__SUBMISSION_ID = eINSTANCE.getSubmission_Submission_ID();

		/**
		 * The meta object literal for the '<em><b>Submission time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__SUBMISSION_TIME = eINSTANCE.getSubmission_Submission_time();

		/**
		 * The meta object literal for the '<em><b>Obtained Marks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__OBTAINED_MARKS = eINSTANCE.getSubmission_Obtained_Marks();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.PostImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Post ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__POST_ID = eINSTANCE.getPost_Post_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__DESCRIPTION = eINSTANCE.getPost_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__CREATION_DATE = eINSTANCE.getPost_Creation_Date();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.AdminImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ID = eINSTANCE.getAdmin_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__USERNAME = eINSTANCE.getAdmin_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__PASSWORD = eINSTANCE.getAdmin_Password();

		/**
		 * The meta object literal for the '<em><b>View Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___VIEW_COURSES = eINSTANCE.getAdmin__ViewCourses();

		/**
		 * The meta object literal for the '<em><b>Add Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_COURSES = eINSTANCE.getAdmin__AddCourses();

		/**
		 * The meta object literal for the '<em><b>Edit Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___EDIT_COURSES = eINSTANCE.getAdmin__EditCourses();

		/**
		 * The meta object literal for the '<em><b>Delete Courses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DELETE_COURSES = eINSTANCE.getAdmin__DeleteCourses();

		/**
		 * The meta object literal for the '<em><b>View Students</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___VIEW_STUDENTS = eINSTANCE.getAdmin__ViewStudents();

		/**
		 * The meta object literal for the '<em><b>Add Students</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_STUDENTS = eINSTANCE.getAdmin__AddStudents();

		/**
		 * The meta object literal for the '<em><b>Edit Students</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___EDIT_STUDENTS = eINSTANCE.getAdmin__EditStudents();

		/**
		 * The meta object literal for the '<em><b>Delete Students</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DELETE_STUDENTS = eINSTANCE.getAdmin__DeleteStudents();

		/**
		 * The meta object literal for the '<em><b>Add Teacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_TEACHER = eINSTANCE.getAdmin__AddTeacher();

		/**
		 * The meta object literal for the '<em><b>Delete Teacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DELETE_TEACHER = eINSTANCE.getAdmin__DeleteTeacher();

		/**
		 * The meta object literal for the '<em><b>Edit Teacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___EDIT_TEACHER = eINSTANCE.getAdmin__EditTeacher();

		/**
		 * The meta object literal for the '<em><b>Assign Sections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ASSIGN_SECTIONS = eINSTANCE.getAdmin__AssignSections();

		/**
		 * The meta object literal for the '<em><b>Delete Sections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DELETE_SECTIONS = eINSTANCE.getAdmin__DeleteSections();

		/**
		 * The meta object literal for the '<em><b>Assign Pre Requistes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ASSIGN_PRE_REQUISTES = eINSTANCE.getAdmin__AssignPreRequistes();

		/**
		 * The meta object literal for the '<em><b>View Feed Back</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___VIEW_FEED_BACK = eINSTANCE.getAdmin__ViewFeedBack();

		/**
		 * The meta object literal for the '<em><b>Star Feed Back</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___STAR_FEED_BACK = eINSTANCE.getAdmin__StarFeedBack();

		/**
		 * The meta object literal for the '<em><b>Delete Feedback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___DELETE_FEEDBACK = eINSTANCE.getAdmin__DeleteFeedback();

		/**
		 * The meta object literal for the '<em><b>Mark Issued Book As Returned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___MARK_ISSUED_BOOK_AS_RETURNED = eINSTANCE.getAdmin__MarkIssuedBookAsReturned();

	}

} //ClassDiagramPackage
