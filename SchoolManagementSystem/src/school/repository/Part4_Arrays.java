package school.repository;

import java.util.Scanner;

public class Part4_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to register? ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] studentNames = new String[totalStudents];
        double[] studentScores = new double[totalStudents];

        
        double[][] courseMarks = new double[totalStudents][2];

        
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\n--- Entering details for Student " + (i + 1) + " ---");
            System.out.print("Enter Student Name: ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter Test 1 Mark: ");
            courseMarks[i][0] = scanner.nextDouble();

            System.out.print("Enter Test 2 Mark: ");
            courseMarks[i][1] = scanner.nextDouble();
            scanner.nextLine(); 

            
            studentScores[i] = (courseMarks[i][0] + courseMarks[i][1]) / 2.0;
        }

        
        System.out.println("\n=================================");
        System.out.println("       REGISTERED STUDENTS       ");
        System.out.println("=================================");
        double totalSum = 0;
        int highestIdx = 0;
        int lowestIdx = 0;

        for (int i = 0; i < totalStudents; i++) {
            System.out.println(studentNames[i] + " | Final Score: " + studentScores[i]);
            totalSum += studentScores[i];

            if (studentScores[i] > studentScores[highestIdx]) highestIdx = i;
            if (studentScores[i] < studentScores[lowestIdx]) lowestIdx = i;
        }

        double averageScore = totalStudents > 0 ? totalSum / totalStudents : 0;

        System.out.println("---------------------------------");
        System.out.println("Average Score  : " + averageScore);
        System.out.println("Top Student    : " + studentNames[highestIdx] + " (" + studentScores[highestIdx] + ")");
        System.out.println("Lowest Student : " + studentNames[lowestIdx] + " (" + studentScores[lowestIdx] + ")");

        
        System.out.print("\nEnter student name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < totalStudents; i++) {
            if (studentNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student Found! " + studentNames[i] + " has score: " + studentScores[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student '" + searchName + "' not found.");
        }

        
        for (int i = 0; i < totalStudents - 1; i++) {
            for (int j = 0; j < totalStudents - i - 1; j++) {
                if (studentScores[j] < studentScores[j + 1]) {
                    
                    double tempScore = studentScores[j];
                    studentScores[j] = studentScores[j + 1];
                    studentScores[j + 1] = tempScore;

                    
                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;
                }
            }
        }

        System.out.println("\n--- Students Sorted by Rank (Highest to Lowest) ---");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println((i + 1) + ". " + studentNames[i] + " - " + studentScores[i]);
        }

        
    }
}