import java.util.Stack;
import java.util.Scanner;

public class NewLearning {
	
	public static void main(String [] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Stack<String> jobs= new Stack<>();
			
			int option = 0;
			String task = "";
			
			do {
				System.out.println("Please select from the given option.");
				System.out.println("1.Have you completed your previous task?");
				System.out.println("2.Would you like to add a new task?");
				System.out.println("3.Exit");
				
				option = scanner.nextInt();
				scanner.nextLine();
				
					if (option == 1) {
						if (!jobs.isEmpty()) {
							System.out.println("That's great. Let me remove that task from the option.\n\n");
							jobs.pop();
						} else {
							System.out.println("No tasks to remove, you have completed all your task.\n\n");
							}
						} 
					else if (option == 2) {
						System.out.println("what task would you like to add?");
						task = scanner.nextLine();
						jobs.push(task);	
						} 
					else if (option == 3) {
						if (jobs.isEmpty()) {
							System.out.println("Thank you for your hard work.");
							}
						else {
							System.out.println("You still have some task to complete. Please return or complete later.");
							System.out.println(jobs);
							}
						}
					else {
						System.out.println("Please enter a number between 1 and 3.");
						}
				}while(option != 3);		
		}			
	}
}
