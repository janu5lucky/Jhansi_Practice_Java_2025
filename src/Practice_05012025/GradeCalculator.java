package Practice_05012025;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score : ");

    	int score = input.nextInt();// Replace with your numerical score
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 35 && score < 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
    }
}

