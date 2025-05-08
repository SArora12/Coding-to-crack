package StudentExample;

import java.util.List;



public abstract class StudentBuilder {
	int rollNo;
	int age;
	String studName;
	String motherName;
	String fatherName;
	List<String> subjects;
	
	
	public StudentBuilder setRollno(int rollNo) {
		this.rollNo=rollNo;
		return this;
	}
	public StudentBuilder setAge(int age) {
		this.age=age;
		return this;
	}
	public StudentBuilder setName(String studName) {
		this.studName=studName;
		return this;
	}
	public StudentBuilder setMotherName(String motherName) {
		this.motherName=motherName;
		return this;
	}
	public StudentBuilder setFatherName(String fatherName) {
		this.fatherName=fatherName;
		return this;
	}
	abstract public StudentBuilder setStubjects();
	
	public Student build() {
		return new Student(this);
	}
	
}