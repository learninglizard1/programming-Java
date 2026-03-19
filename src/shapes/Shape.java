import java.awt.Color;
public class Shape {
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
	
	public void setLineColour (Color lineColour) {
		this.lineColour = lineColour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}