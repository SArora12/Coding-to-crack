package StudentExample;


import java.util.List;

public class Student {

	int rollNo;
	int age;
	String studName;
	String motherName;
	String fatherName;
	List<String> subjects;
	public Student(StudentBuilder builder) {
		
		this.rollNo = builder.rollNo;
		this.age = builder.age;
		this.studName =builder.studName;
		this.motherName = builder.motherName;
		this.fatherName = builder.fatherName;
		this.subjects = builder.subjects;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", studName=" + studName + ", motherName=" + motherName
				+ ", fatherName=" + fatherName + ", subjects=" + String.join(", ", subjects)+"]";
	}
	
	
}

