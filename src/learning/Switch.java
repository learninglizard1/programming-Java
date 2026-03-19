import java.util.Scanner;

public class Switch {
	
	public static void main (String [] args ) {
	
		Scanner scan = new Scanner(System.in);
	
		int dayNumber = 0;
		String dayText = "";
	
		System.out.println("Please enter a day of the week in words.");
		dayText = scan.next();
	
		switch (dayText) {
		case "Monday" : {
			dayNumber = 1;
			break;
		}
		
		case "Tuesday": {
			dayNumber = 2;
			break;
		}
		case "Wednesday": {
			dayNumber = 3;
			break;
		}
		case "Thursday": {
			dayNumber = 4;
			break;
		}
		case "Friday": {
			dayNumber = 5;
			break;
		}
		case "Saturday": {
			dayNumber = 6;
			break;
		}
		case "Sunday": {
			dayNumber = 7;
			break;
		}
		default: {
			System.out.println("Invalid input");
			break;
		}
		}
		if ( dayNumber > 0 ) {
			System.out.println("The number is " + dayNumber);
		}
		scan.close();
			
		}
	}
	
