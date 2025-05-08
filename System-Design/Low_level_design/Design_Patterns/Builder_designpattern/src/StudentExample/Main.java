package StudentExample;

public class Main {
	
	public static void main(String args[]) {
		Director dir1=new Director(new EngineeringStudent());
		Director dir2=new Director(new MBAstudent());
		
		Student engStud=dir1.createStudent();
		Student mbaStud=dir2.createStudent();
		
		System.out.println(engStud.toString());
		System.out.println(mbaStud.toString());

	}
	
}
