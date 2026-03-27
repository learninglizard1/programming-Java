// Abstract and polymophism example
// Shape class
import java.awt.Color;

public abstract class Shape {
	private String name;
	private boolean filled;
	private Color fillColour;
	private Color lineColour;
	public Shape() {
		setShapeSettings();
	}
	public Shape(String name) {
		this.name = name;
		setShapeSettings();
	}
	public void setShapeSettings() {
		filled = false;
		fillColour = null;
		lineColour = Color.BLACK;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Color getFillColour() {
		return fillColour;
	}
	public void setFillColour(Color fillColour) {
		this.fillColour = fillColour;
	}
	public Color getLineColour() {
		return lineColour;
	}
	public void setLineColour(Color lineColour) {
		this.lineColour = lineColour;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}


// Shape2D class
public abstract class Shape2D extends Shape {
	private int sides;
	private int x;
	private int y;
	public Shape2D() {
		super();
	}
	public Shape2D(String name) {
		super(name);
	}
	
	// Declaring the abstract method: Signature only
	
	public abstract void drawShape();

	public abstract double getArea();
	
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}


// Circle class
public final class Circle extends Shape2D{
	private double radius;
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	public void drawShape() {
		// overriding the method from the parent class
		System.out.println("Drawing the Circle Shape");
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getDiameter() {
		return 2 * this.radius;
	}
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
}


// Square class
public final class Square extends Shape2D{
	private double length;
	public Square(double length) {
		super("Square");
		setSides(4);
		this.length = length;
	}
	
	public void drawShape() {
		System.out.println("Drawing the Square Shape.");
		
	}
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return this.length * this.length;
	}




}



// Rectangle class
public final class Rectangle extends Shape2D{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public void drawShape() {
		System.out.println("Drawing the Rectangle Shape.");
	}
	
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
}

// main shapes class
public class ShapesProgram {
    public static void main(String[] args) {
        // Creating Circle class object and assigning it to Shape2D
        Shape2D myShape = new Circle(8.9);
        System.out.println("Name of shape is " + myShape.getName());
        myShape.drawShape();
        System.out.println("Area of shape " + myShape.getName() + " is " + myShape.getArea());
        
        System.out.println();
        System.out.println();
        // creating square class object and assigning it to Shape2D reference
        myShape = new Square(4.5);
        System.out.println("Name of shape is " + myShape.getName());
        myShape.drawShape();
        System.out.println("Area of shape " + myShape.getName() + " is " + myShape.getArea());
        
        System.out.println();
        System.out.println();
        // creating Rectangle class object and assigning it to Shape2D reference
        myShape = new Rectangle(4.5, 8.6);
        System.out.println("Name of shape is " + myShape.getName());
        myShape.drawShape();
        System.out.println("Area of shape " + myShape.getName() + " is " + myShape.getArea());
    }
}
