import java.util.Scanner;
public class HelloWorldExample {
	public static void main(String [] args) {
		String  fname, lname;
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		fname = scanner.next();
		
		System.out.println("Please enter your last name: ");
		lname = scanner.next();
		
		System.out.println("Please enter your age: ");
		num1 = scanner.nextInt();
		
		System.out.println("Please enter your favourite number: ");
		num2 = scanner.nextInt();
		
		
		System.out.println("Hello, " + fname + " " + lname + ".\n" 
							+ "You are " + num1 + " years old.\n"
							+ "Your favourite number is " + num2 + ".");
		
		scanner.close();
		
	}
}