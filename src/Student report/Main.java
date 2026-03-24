// Sachin Bade | Student no. 5117566 | BIT504 ASSIGNMENT 1

//  Main class
import java.util.Scanner; //scanner
import java.io.File; // file reader
import java.io.FileNotFoundException; // handling file error

public class Main {
	public static void main (String [] args) {
		
		// students data
		Student[] student = new Student[20];
		int count = 0;
		
		// reading file 
		try (Scanner myReader = new Scanner(new File("src/Students.txt"))){
			
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String[] data  = line.split(",");
				
				String id = data[0].trim();
				String firstName = data[1].trim();
				String lastName = data[2].trim();
				
				int m = Integer.parseInt(data[3].trim());
				int a = Integer.parseInt(data[4].trim());
				int h = Integer.parseInt(data[5].trim());
				int s = Integer.parseInt(data[6].trim());
				int g = Integer.parseInt(data[7].trim());
				int e = Integer.parseInt(data[8].trim());
				int l = Integer.parseInt(data[9].trim());
				
				student[count] = new Student(id, firstName, lastName, m, a, h, s, g, e, l);
				count++;
			}
		} catch (FileNotFoundException e) { // handling error 
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
				
		
		// scanner for users to input a number between 1 to 5.
		Scanner input = new Scanner (System.in);
		int num;
		
			//  main menu
		do {
			System.out.println("\n\n***Main Menu***\n");
			System.out.println("1. Display all students.");
			System.out.println("2. Display individual student information.");
			System.out.println("3. Display top student for each course.");
			System.out.println("4. Display class report");
			System.out.println("5. Exit.\n\n");
	
			System.out.println("Please enter a number between 1 to 5 to select an option: ");
			num = input.nextInt();
			
			if (num < 1 || num > 5) {
				System.out.println("Invalid input. Please try again.\n\n\n");
			} else {
				System.out.println("You have selected number: " + num);
				System.out.println();
				
				// Displaying all the students in a table
				if (num == 1) {
					Report fullStudentReport = new Report();
						fullStudentReport.displayAllStudentReport(student, count);
									
				// Displaying individual student from their unique student ID.
				} else if (num == 2) {
					Report singleStudentReport = new Report();
					singleStudentReport.displayStudentById(student, count, input);
					
				// display top student report
				} else if (num ==3) { 
					Report topStudentReport = new Report();
					topStudentReport.displayTopStudent(student,count);
				
				// display class report
				} else if (num == 4) {
					Report classReport = new Report();
					classReport.displayClassReport(student, count);
					
				// exit
				}else {
					System.out.println("Thank you for visiting. Exiting...");
					System.exit(0);
				}
			}
			
		} while (num != 5); // Repeat until user exits/ enters number 5
		
		
		// closing input scanner
		input.close();
	}

}
