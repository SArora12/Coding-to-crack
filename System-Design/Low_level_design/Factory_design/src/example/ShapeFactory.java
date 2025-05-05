package example;

class ShapeFactory{
    Shape getObject(String input){
        switch(input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
            return new Rectangle();
            case "TRIANGLE":
            return new Triangle();
            default:
            	return null;
        }
    }
}