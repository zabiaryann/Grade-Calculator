package defaultPackage;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     // 1. Initialize any variables and objects you need (i.e. a scanner, some
     // counters for a total running sum, and a number tracking the # of scores inputted
        int sumScore = 0;
        int scoreCount = 0;
        

		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
        while (true) {
            System.out.print("Enter a score (or a negative number to stop): ");
            int score = scanner.nextInt();
            
            if (score < 0) {
                break; // Exit the loop when a negative number is entered
            } else if (score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                continue; // Skip this iteration and ask for input again
            }
            
            sumScore += score;
            scoreCount++;
        }
        
    	// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
        
        if (scoreCount > 0) {
            double average = (double) sumScore / scoreCount;
            System.out.println("Average grade: " + average);
            
            if (average > 90) {
                System.out.println("Excellent Work!");
            } else if (average > 80) {
                System.out.println("Good Job!");
            } else if (average > 70) {
                System.out.println("Keep it up!");
            } else {
                System.out.println("Let's work hard to get those grades up!");
            }
        } else {
            System.out.println("No scores entered.");
        }
        
        scanner.close();
    }
}
