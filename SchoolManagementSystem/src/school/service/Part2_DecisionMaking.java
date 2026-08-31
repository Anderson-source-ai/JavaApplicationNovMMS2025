package school.service;

import java.util.Scanner;

public class Part2_DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Level Code (1-ND1, 2-ND2, 3-HND1, 4-HND2): ");
        int levelCode = scanner.nextInt();

        System.out.print("Enter Exam Score (0-100): ");
        double score = scanner.nextDouble();

        
        boolean isAgeValid = age >= 16;
        if (isAgeValid) {
            System.out.println("Age Check: Passed (Eligible for admission)");
        } else {
            System.out.println("Age Check: Failed (Must be at least 16 years old)");
        }

        
        char grade;
        if (score >= 0 && score <= 100) { 
            if (score >= 70) {
                grade = 'A';
            } else if (score >= 60) {
                grade = 'B';
            } else if (score >= 50) {
                grade = 'C';
            } else if (score >= 45) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        } else {
            System.out.println("Invalid score entered!");
            grade = 'I'; 
        }

        
        String levelName;
        switch (levelCode) {
            case 1:
                levelName = "ND1";
                break;
            case 2:
                levelName = "ND2";
                break;
            case 3:
                levelName = "HND1";
                break;
            case 4:
                levelName = "HND2";
                break;
            default:
                levelName = "Invalid Level";
                break;
        }

        
        String status = (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') ? "PASSED" : "FAILED";

        
        System.out.println("\n--- DECISION RESULTS ---");
        System.out.println("Level Selected : " + levelName);
        System.out.println("Score Entered  : " + score);
        System.out.println("Assigned Grade : " + grade);
        System.out.println("Course Status  : " + status);

        scanner.close();
    }
}