package StudentExample;

public class Director {
	StudentBuilder studentbuilder;
	
	Director(StudentBuilder studentbuilder){
		this.studentbuilder=studentbuilder;
	}
	
	public Student createStudent() {
		if(studentbuilder instanceof EngineeringStudent) {
			return createEngineeringStud();
		}
		else {
			return createMBAStudent();
		}
	}
	
	public Student createEngineeringStud() {
		return studentbuilder.setRollno(1).setAge(23).setName("Simran").setStubjects().build();
	}
	public Student createMBAStudent() {
		return studentbuilder.setRollno(2).setAge(32).setMotherName("Renu").setStubjects().build();
	}
	
}
