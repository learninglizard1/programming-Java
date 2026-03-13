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
