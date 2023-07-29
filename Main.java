package defaultPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScores = 0;
        int scoreCount = 0;
        
        while (true) {
            System.out.print("Enter a score (or a negative number to stop): ");
            int score = scanner.nextInt();
            
            if (score < 0) {
                break; // Exit the loop when a negative number is entered
            } else if (score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                continue; // Skip this iteration and ask for input again
            }
            
            totalScores += score;
            scoreCount++;
        }
        
        if (scoreCount > 0) {
            double average = (double) totalScores / scoreCount;
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

