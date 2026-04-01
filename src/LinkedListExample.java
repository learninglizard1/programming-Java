import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
	public static void main (String [] args) {
		// Creates a new linked list that holds strings
		LinkedList<String> names = new LinkedList<>();
		
		try (Scanner scanner = new Scanner(System.in)) {
			String answer = "";
			String food = "";
			
			System.out.println("Do you want to enter a food item?");
			answer = scanner.nextLine();
			
			do  {
					if (answer.equals("yes")){
						System.out.println("Enter a food item:");
						food = scanner.nextLine();
						names.add(food);
						System.out.println("Do you want to enter a food item?");
						answer = scanner.nextLine();
						}
									
					else if (answer.equals ("no")) {
						return;
					}else
						System.out.println("Please answer using 'yes' or 'no'.");	
						System.out.println("Do you want to enter a food item?");
						answer = scanner.nextLine();
				
				} while (!answer.equals ("no"));
			
			for (String name: names)
				System.out.println(name);

			scanner.close();
		}
	}
}
