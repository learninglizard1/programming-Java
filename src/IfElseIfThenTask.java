import java.util.Scanner;

public class IfElseIfThenTask {

    public static void main(String[] args) {

        float marks = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        marks = scanner.nextFloat();

        if (marks > 100 || marks < 0) {
            System.out.println("You have entered marks that are out of the range of [0 to 100].\nPlease enter marks within this range to calculate your grade!");
        } else {
            if (marks < 95) {
                if (marks < 90) {
                    if (marks < 85) {
                        if (marks < 80) {
                            if (marks < 75) {
                                if (marks < 70) {
                                    if (marks < 60) {
                                        if (marks < 50) {
                                            if (marks < 41) {
                                                System.out.println("Your grade for marks " + marks + " is D");
                                            } else {
                                                System.out.println("Your grade for marks " + marks + " is C–");
                                            }
                                        } else {
                                            System.out.println("Your grade for marks " + marks + " is C");
                                        }
                                    } else {
                                        System.out.println("Your grade for marks " + marks + " is C+");
                                    }
                                } else {
                                    System.out.println("Your grade for marks " + marks + " is B–");
                                }
                            } else {
                                System.out.println("Your grade for marks " + marks + " is B");
                            }
                        } else {
                            System.out.println("Your grade for marks " + marks + " is B+");
                        }
                    } else {
                        System.out.println("Your grade for marks " + marks + " is A–");
                    }
                } else {
                    System.out.println("Your grade for marks " + marks + " is A");
                }
            } else {
                System.out.println("Your grade for marks " + marks + " is A+");
            }
        }

        scanner.close();
    }
}