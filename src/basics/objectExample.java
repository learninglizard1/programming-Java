public class Square {
	public double side;
	public String name;

	
	public void setSide(double side) {
		this.side = side;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getSide() {
		return side;
	}
	
	public String getName() {
		return name;
	}
	
	public double calcualteArea() {
		return this.side * this.side;
	}
	
	
	public double calculatePerimeter() {
		return 4 * this.side;
	}
	
	
}


public class Program {
	public static void main (String [] args) {
		Square s1 = new Square();
		Square s2= new Square();
		s1.setSide(5);
		s2.setSide(10);
		
		System.out.println(s1.getSide());
		System.out.println(s2.getSide());
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println("The area of the s1 is :" + s1.calcualteArea());
		System.out.println("The area of the s2 is: " + s2.calcualteArea() + "\n\n");
		
		System.out.println("The permeter of s1 is: " + s1.calculatePerimeter());
		System.out.println("The perimeter of s2 is: " + s2.calculatePerimeter());
		
	}
}
