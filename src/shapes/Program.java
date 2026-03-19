
public class Program {
	public static void main (String [] args) {
		
		// creating class objects
		
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		circle.setRadius(4.56);
		
		System.out.println("This is a: " + circle.getName());
		System.out.println("The area of a circle is: " + circle.getArea());
		System.out.println("The diameter of a circle is: " + circle.getDiameter());
		System.out.println("The circumference of a circle is: " + circle.getCircumference());
		System.out.println("The coordinates of a circle is: " + " x = " +circle.getX() + " and y = " + circle.getY()+  "\n\n");
		
		square.setLength(8.75);
		
		System.out.println("This is a: " + square.getName()); 
		System.out.println("The area of a square is: " + square.getArea());
		System.out.println("The perimeter of a square is:  " + square.getPerimeter() + "\n\n");
		
		
		rectangle.setSides(4);
		rectangle.setLength(8.75);
		rectangle.setWidth(3.97);
		
		System.out.println("This is a: " + rectangle.getName());
		System.out.println("The area of a rectangle is: " + rectangle.getArea());
		System.out.println("The perimeter of a rectangle is: " + rectangle.getPerimeter());
	}	
}