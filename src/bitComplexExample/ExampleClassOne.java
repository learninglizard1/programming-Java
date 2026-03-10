package bitComplexExample;

public class ExampleClassOne {
	// class variables
	private String className;
	private int classNumber;
	// class constructor
	public ExampleClassOne(String myName, int myNumber) {
		this.className = myName;
		this.classNumber = myNumber;
	}
	
	// class methods
	public void sayMyClassName() {
		System.out.println("My Class Name is: " + this.className);
	}
	public void sayMyClassNumber() {
		System.out.println("My Class Number is: " + this.classNumber);
	}

}
