// Rectangle class

public class Rectangle extends Shape2D{
	private double length;
	private double width;
	
	public Rectangle() {
		super("Rectangle");
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
	
	public double  getArea() {
		 return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
}