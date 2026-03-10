import java.util.Scanner;

public class UserInputTask {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean bool;
		
		System.out.println("Please answer using True or Flase. \n\nHumans can grow upto 10000m tall.");
		bool = scan.nextBoolean();
		
		
		String firstName, lastName;
		
		System.out.println("Please enter your first name: ");
		firstName = scan.next();
		
		System.out.println("Please enter your last name: ");
		lastName =  scan.next();
		
		int num;
		System.out.println("Please enter a number: ");
		num = scan.nextInt();		
		
		int num2;
		System.out.println("Please enter an integer number: ");
		num2 = scan.nextInt();
	
		int intnum;
		intnum = (int) Math.pow(num2, 2);
		System.out.println("The square of " + num2 + " is: " + intnum + "\n\n");
		
		long num3;
		System.out.println("Please enter a long number: ");
		num3 = scan.nextLong();
		
		float num4;
		System.out.println("Please enter a float value: ");
		num4 = scan.nextFloat();
		
		
		double num5;
		System.out.println("Please enter a double value: ");
		num5 = scan.nextDouble();
		
		double intnum2;
		intnum2= Math.pow(num5, 2);
		System.out.println("The square of " + num5 + " is: " + intnum2);
		
	}
}
