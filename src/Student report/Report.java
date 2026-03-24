// Sachin Bade | Student no. 5117566 | BIT504 ASSIGNMENT 1

// Report class

import java.util.Scanner;

public class Report {
	
	// displaying all the students in a table.
	public void displayAllStudentReport(Student[] student, int count) {
		System.out.println("\n\n***Student report***\n"); 
		System.out.println("ID\tName\t\tM\tA\tH\tS\tG\tE\tL\tFinal");
		System.out.println("=============================================================================================");
		for (int i = 0; i < count; i++) {
			
			System.out.println(student[i].getID() + "\t" + student[i].getName() + "\t" 
							+ student[i].getMathematics() + "\t" + student[i].getArt() + "\t" 
							+ student[i].getHistory() + "\t" + student[i].getScience() + "\t" 
							+ student[i].getGeography() + "\t" + student[i].getEconomics() + "\t" 
							+ student[i].getLiterature() + "\t" + student[i].getAverage());	
		}
	}
	
	
	// displaying students by searching their unique ID
	public void displayStudentById(Student[] student, int count, Scanner input) {
		
		boolean found = false;
		do {
			System.out.println("Please enter student's ID: ");
			String id = input.next();


			for (int i = 0; i < count; i++) {
				Student s = student[i];
				if (s.getID().equals(id)) {
					// report header
					System.out.println("\n\n***Student report***\n"); 
					System.out.println("ID\tName\t\tM\tA\tH\tS\tG\tE\tL\tFinal");
					System.out.println("=============================================================================================");
					System.out.println(student[i].getID() + "\t" + student[i].getName() + "\t" 
							+ student[i].getMathematics() + "\t" + student[i].getArt() + "\t" 
							+ student[i].getHistory() + "\t" + student[i].getScience() + "\t" 
							+ student[i].getGeography() + "\t" + student[i].getEconomics() + "\t" 
							+ student[i].getLiterature() + "\t" + student[i].getAverage());	
					found = true; 
					break;
					}
				}
				 if (!found) {
				 		System.out.println("\nThere are no students with that Student ID. Please try again.\n");
					}
			}while (!found);
	}
	
	
	
	// displaying top student for each course
	public void displayTopStudent(Student[] student, int count) {
		
		String[] courseName = {"Mathematics", "Art", "History", "Science", "Geography", "Economics", "Literature"};
		
		
		// header
		System.out.println("\n\n***Student report***\nTop student for each report"); 
		
		
		// looping through the course name
		for (int i =0; i < courseName.length; i++) {
			String subject = courseName[i];
			int maxMark = 0; 
			
			System.out.println("\n" + subject + ":");
			
			// finding max mark from each subject
			for (int j = 0; j < count; j++) {
				Student s = student[j];
				int mark = 0;
			
				if (subject.equals("Mathematics")) mark = s.getMathematics(); 
				else if (subject.equals("Art")) mark = s.getArt();
				else if (subject.equals("History")) mark = s.getHistory();
				else if (subject.equals("Science")) mark = s.getScience();
				else if (subject.equals("Geography")) mark = s.getGeography();
				else if (subject.equals("Economics")) mark = s.getEconomics();
				else if (subject.equals("Literature")) mark = s.getLiterature();
			
					Course c = new Course(subject, mark); 
					if (c.getMark() > maxMark) {
						maxMark = c.getMark();
					}
				}
			
			// printing students with max mark
			for (int j = 0; j < count; j++) {
				Student s = student[j];
				int mark = 0;
				
				if (subject.equals("Mathematics")) mark = s.getMathematics(); 
				else if (subject.equals("Art")) mark = s.getArt();
				else if (subject.equals("History")) mark = s.getHistory();
				else if (subject.equals("Science")) mark = s.getScience();
				else if (subject.equals("Geography")) mark = s.getGeography();
				else if (subject.equals("Economics")) mark = s.getEconomics();
				else if (subject.equals("Literature")) mark = s.getLiterature();
				
				Course c = new Course(subject, mark); 
				if (c.getMark() == maxMark) {
					System.out.println(s.getName() + " " + c.getMark());
				}	
			
			}
		}
	}
	
	// displaying class report
	public void displayClassReport(Student[] student, int count) {
		
		System.out.println("\n\n***Student report***\n");
		System.out.println("Total number of students: " + count + "\n");
		
		System.out.println("Average:\tMark\tGrade");
		
		String[] courseName = {"Mathematics", "Art", "History", "Science", "Geography", "Economics", "Literature"};
		for (int i = 0; i < courseName.length; i++) {
			String subject = courseName[i];
			int total = 0;
			
			for (int j = 0; j < count; j++) {
				Student s = student[j];
				int mark = 0;
			
				if (subject.equals("Mathematics")) mark = s.getMathematics();
				else if (subject.equals("Art")) mark = s.getArt();
				else if (subject.equals("History")) mark = s.getHistory();
				else if (subject.equals("Science")) mark = s.getScience();
				else if (subject.equals("Geography")) mark = s.getGeography();
				else if (subject.equals("Economics")) mark = s.getEconomics();
				else if (subject.equals("Literature")) mark = s.getLiterature();
				
				total += mark;
				
			}
				
				// calculating average 
				double average = total / (double) count;
				
				// get grade
				char grade = getGrade(average);
				
				System.out.println( subject + ":" + "\t" + (int) average + "\t" + grade);
					
		}
	}
	
	// Converting mark to grade
	
	public char getGrade(double mark) {
			if (mark >= 85) {
				return 'A';
			} else if ( mark >= 70) {
				return 'B';
			} else if (mark >= 60) {
				return 'C';
			} else if ( mark >= 50) {
				return 'D';
			} else {
				return 'E';
			}
	
	}
	
	
}
