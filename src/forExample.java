import java.util.Scanner;

public class forExample {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		String [] animals = new String[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter animal name: ");
			animals [i] = scanner.next();
		}
		
		
		for (int j = 0; j < 5; j++) {
			System.out.println("Animal " + j + " name is " + animals[j]);		}
	}
}
============================================================================================

	import java.util.Scanner;

public class ForExample1 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter your first number: ");
		int num = scanner.nextInt();		
		
		System.out.println("Enter your second number: ");
		int num2 = scanner.nextInt();
		
		for(int i = num ; i <= num2; i++) {
			System.out.println(i);
		}
 
	}
	
}

============================================================================================
public class ForExample3 {
 
	public static void main(String[] args) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		
		for(int i = days.length - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}
	}
	
}
