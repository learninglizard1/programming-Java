import java.util.Calendar;
import java.util.Random;

public class Calendar {
	public static void main (String [] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Current date: " + cal.getTime() + "\n\n");
		
		System.out.println("Generating random number between 30 to 300......");
		
		Random rnd = new Random();
		int randomInt = rnd.nextInt(30, 301);
		
		System.out.println("Random days: " + randomInt +  " \n\n");
		
		cal.add(Calendar.DAY_OF_MONTH, randomInt);
		
		System.out.println("New date after adding " + randomInt + " days on current date: " + cal.getTime() +  " \n\n");
				
		System.out.println("Generating random double value between 100 and 1000...");
		double randomDouble = rnd.nextDouble(100,1000);
		
		System.out.println(randomDouble);
	}
	
}
