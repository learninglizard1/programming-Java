
// Modified Circle Class
public class Circle extends Shape2D{
	private double radius;
	public Circle() {
		super("Circle");
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