package bitComplexExample;

public class Main {
	public static void main(String args[]) {
		// create ex1 object from ExampleClassOne
		ExampleClassOne ex1 = new ExampleClassOne("Zanadu", 5);
		// calling methods of ex1
		ex1.sayMyClassName();
		ex1.sayMyClassNumber();
		
		//create ex2 object from ExampleClassTwo
		ExampleClassTwo ex2 = new ExampleClassTwo();
		double shortSide = 5.26;
		// calling ex2
		double longSide = ex2.getGoldenRectangle(shortSide);
		System.out.println("Golden ratio for " + shortSide + " is " + longSide);
	}

}
