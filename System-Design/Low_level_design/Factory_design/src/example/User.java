package example;

public class User {

	public static void main(String[] args) {
		
		  
		        ShapeFactory sf = new ShapeFactory();
		        Shape shape = sf.getObject("TRIANGLE");
		        shape.draw(); 
		    }

	

}
