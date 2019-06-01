package TrainingAllInOne;
import javax.persistence.*;
@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Student_ID")
	private Integer studentId;
	
	@Column(name="Student_CLASS")
	private String studentClass;
	
	public Student() {
		super();
	}

	public Student(String studentClass) {
		super();
		this.studentClass = studentClass;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentClass=" + studentClass + ", contact=" + contact + "]";
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@OneToOne(mappedBy="student",cascade=CascadeType.ALL)
	private Contact contact;
	
}
