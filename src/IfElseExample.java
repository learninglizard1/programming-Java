import java.util.Scanner;

public class IfElseExample {
	
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);

	int num;
	
	System.out.println("Please enter a number: ");
	num = scan.nextInt();
	
	if ( num % 2 == 0) {
		System.out.println("The number is even.");
	} else {
		System.out.println("The number is odd.");
	}
	
	scan.close();
	}
}