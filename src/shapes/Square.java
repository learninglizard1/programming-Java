// Modified Square Class
public class Square extends Shape2D{
	private double length;
	public Square() {
		super("Square");
		setSides(4);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getPerimeter() {
		return getSides() * this.length;
	}
	public double getArea() {
		return this.length * this.length;
	}
}