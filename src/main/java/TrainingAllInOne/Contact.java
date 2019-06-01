package TrainingAllInOne;

import javax.persistence.*;
@Entity
@Table(name="ContactDetails")
public class Contact {
    @Column(name="Student_City")
    private String studentCity;
    @Id
    @Column(name="Student_CellNo")
    private Integer studentCellNo;
    


	@Override
	public String toString() {
		return "Contact [studentCity=" + studentCity + ", studentCellNo=" + studentCellNo + "]";
	}

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Student_ID")
    Student student;

	public String getStudentCity() {
		return studentCity;
	}
 public Contact() {}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Integer getStudentCellNo() {
		return studentCellNo;
	}

	public void setStudentCellNo(Integer studentCellNo) {
		this.studentCellNo = studentCellNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Contact(String studentCity, Integer studentCellNo, Student student) {
		super();
		this.studentCity = studentCity;
		this.studentCellNo = studentCellNo;
		this.student = student;
	}
    
    
 
}
