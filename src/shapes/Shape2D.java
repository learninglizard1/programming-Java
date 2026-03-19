//Shape2D Class
public class Shape2D extends Shape {
	private int sides;
	private int x;
	private int y;
	public Shape2D() {
		super();
	}
	public Shape2D(String name) {
		super(name);
	}
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