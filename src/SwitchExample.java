import java.util.Scanner;
 
public class SwitchExample {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dayNumber;
		String dayText = "";
		System.out.println("Enter the number of a day: ");
		dayNumber = scanner.nextInt();
		
		switch(dayNumber) {
			case 1: {
				dayText = "Monday";
				break;
			}
			case 2: {
				dayText = "Tuesday";
				break;
			}
			case 3: {
				dayText = "Wednesday";
				break;
			}
			case 4: {
				dayText = "Thursday";
				break;
			}
			case 5: {
				dayText = "Friday";
				break;
			}
			case 6: {
				dayText = "Saturday";
				break;
			}
			case 7: {
				dayText = "Sunday";
				break;
			}
			default: {
				System.out.println("Invalid input");
				break;
			}
		}
		if(dayText != null && !dayText.isEmpty()) {	// Only show output if a day was found
			System.out.println("The day is " + dayText);
		}
		scanner.close();
	}
	
}