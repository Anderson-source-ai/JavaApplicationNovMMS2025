package school.service;

import java.util.Scanner;

public class Part3_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCourses = 0;

        
        do {
            System.out.print("Enter total number of courses to process (must be > 0): ");
            totalCourses = scanner.nextInt();
            if (totalCourses <= 0) {
                System.out.println("Invalid input. Try again.");
            }
        } while (totalCourses <= 0);

        double totalScore = 0;
        double highest = -1;
        double lowest = 101;
        int passed = 0;
        int failed = 0;

        
        for (int i = 1; i <= totalCourses; i++) {
            double score;

            
            while (true) {
                System.out.print("Enter score for Course " + i + " (0-100): ");
                score = scanner.nextDouble();

                if (score < 0 || score > 100) {
                    System.out.println("Score must be between 0 and 100! Please re-enter.");
                    continue; 
                }
                break; 
            }

            
            totalScore += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;

            if (score >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        
        double averageScore = totalScore / totalCourses;

        
        char overallGrade;
        if (averageScore >= 70) overallGrade = 'A';
        else if (averageScore >= 60) overallGrade = 'B';
        else if (averageScore >= 50) overallGrade = 'C';
        else if (averageScore >= 45) overallGrade = 'D';
        else overallGrade = 'F';

        
        for (int row = 0; row < 1; row++) {
            System.out.println("\n---------------------------------");
            for (int col = 0; col < 1; col++) {
                System.out.println("     RESULT PROCESSING REPORT    ");
            }
            System.out.println("---------------------------------");
        }

        
        System.out.println("Total Score    : " + totalScore);
        System.out.println("Average Score  : " + averageScore);
        System.out.println("Highest Score  : " + highest);
        System.out.println("Lowest Score   : " + lowest);
        System.out.println("Courses Passed : " + passed);
        System.out.println("Courses Failed : " + failed);
        System.out.println("Overall Grade  : " + overallGrade);

        scanner.close();
    }
}