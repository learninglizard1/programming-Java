import java.util.Scanner;

public class Learning1 {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			do  {
				System.out.println("Enter your " + (i+1) + " grade:");
				num[i] = scanner.nextInt();
				
				if (num[i] < 0 || num [i] > 100) {
					System.out.println("Invalid input");
				}
			}while (num[i] < 0 || num[i] > 100);
				
			} 
			System.out.println("***Score \t\t Grade \t\t Remarks***");
		
			for (int  i =0; i < num.length; i++) {
		if (num[i] >= 90) {
			System.out.println("\t" +num[i] + "\t\tA \t\t Excellent");
		} else if (num[i] >= 75) {
			System.out.println("\t" +num[i] + "\t\tB \t\t Very good");
		} else if (num [i] >= 60) {
			System.out.println("\t" +num[i] + "\t\tC \t\t Good");
		} else if (num [i] >= 40) {
			System.out.println("\t" +num[i] + "\t\tD \t\t Not bad");
		} else {
			System.out.println("\t" + num[i] + "\t\tE \t\t Try harder");
		}

		}
			
		scanner.close();	
	}
}
