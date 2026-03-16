
public class Methods {
    public static int sum(int startingNumber, int endingNumber) {
        // declaring a variable 
        int sum = 0;
        for (int i = startingNumber; i <= endingNumber; i++)
            sum += i;
        return sum;
    }

    public static void main(String [] args) {
        System.out.println("The suum of numbers 1 to 40 is:" + sum(1,40));
        System.out.println("The sum of numbers 500 to 1000 is: " + sum(500, 1000));
        System.out.println("The sum of numbers 5000 to 6000 is: " + sum(5000,6000));
    }
}
===========================================================================================


import java.util.Scanner;

public class MethodsExample1 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int num1, num2;

        System.out.println("Enter your first number: ");
        num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        num2 = scan.nextInt();

        largeNumber(num1, num2);
        scan.close();
    }
     
        public static void largeNumber( int num1, int num2) {
        
        if (num1 > num2) {
            System.out.println("Larger number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Larger number is: " + num2);
        } else {
            System.out.println("They are both equal");
        }
        
    }

===========================================================================================

    public class Square {
	public static void main (String [] args) {
		double value = 10.5;
		double square_value = square(value);
		System.out.println("The square of: " + value + " is " + square_value);
	}
	
	
	private static double square(double num) {
		return Math.pow(num, 2);
	}
}
    
}   

