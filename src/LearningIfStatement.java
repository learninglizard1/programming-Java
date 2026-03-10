import java.util.Scanner;

public class LearningIfStatement{
	
	public static void main (String [] args) {
		
		float marks = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your marks: ");
		marks = input.nextFloat();
		
		if (marks < 0 || marks >100 ) {
			System.out.println("You have entered marks out of range of [0 too 100]. /n"
					+ "Please enter marks within this range to calculate your grade!");
		}
		
		
		if (marks >= 95) {
			System.out.println("Your grade is A+.");
		}
		
		if (marks >= 90 && marks <=94) {
			System.out.println("Your grade is A.");
		}
		
		if (marks >= 85 && marks <= 89) {
			System.out.println("Your grade is A-.");
		}
		
		if (marks >= 80 && marks <=84) {
			System.out.println("Your grade is B+.");
		}
		
		if (marks >= 75 && marks <= 79) {
			System.out.println("Your grade is B.");
		}
		
		if (marks >= 70 && marks <= 74) {
			System.out.println("Your grade is B-.");
		}
		
		if (marks >= 60 && marks <= 69) {
			System.out.println("Your grade is C+.");
		}
		
		if (marks >= 50 && marks <= 59) {
			System.out.println("Your grade is C.");
		}
		
		if (marks >= 41 && marks <= 49) {
			System.out.println("Your grade is C-.");
		}
		
		if (marks <= 40) {
			System.out.println("Your grade is D.");
		}
		
		input.close();
		
	}
}