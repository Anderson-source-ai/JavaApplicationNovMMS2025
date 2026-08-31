package school.service;

import java.util.Scanner;

public class Part5_Methods {

    
    private String registeredName;
    private double registeredScore;

    
    public void registerStudent(String name, double score) {
        this.registeredName = name;
        this.registeredScore = score;
        System.out.println("Student " + name + " successfully registered!");
    }

    
    public void displayStudent() {
        System.out.println("Registered Record -> Name: " + registeredName + " | Score: " + registeredScore);
    }

    
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return scores.length > 0 ? sum / scores.length : 0.0;
    }

    
    public static char calculateGrade(double score) {
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        if (score >= 45) return 'D';
        return 'F';
    }

    
    public static void displayResult(String name, double average) {
        char grade = calculateGrade(average);
        System.out.println("\n--- RESULT FOR " + name + " ---");
        System.out.println("Average Score : " + average);
        System.out.println("Final Grade   : " + grade);
    }

    public static void displayResult(String name, double average, char grade) {
        System.out.println("\n--- DETAILED RESULT FOR " + name + " ---");
        System.out.println("Average Score : " + average);
        System.out.println("Assigned Grade: " + grade);
    }

    
    public static boolean searchStudent(String[] studentList, String targetName) {
        for (String name : studentList) {
            if (name.equalsIgnoreCase(targetName)) {
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Part5_Methods manager = new Part5_Methods();
        manager.registerStudent("Alice Johnson", 82.5);
        manager.displayStudent();

        
        double[] aliceScores = {85.0, 78.0, 90.5};
        double avg = calculateAverage(aliceScores);

        
        displayResult("Alice Johnson", avg);
        displayResult("Alice Johnson", avg, calculateGrade(avg));

       
        String[] campusStudents = {"Alice Johnson", "Bob Smith", "Charlie Brown"};
        System.out.print("\nEnter student name to search: ");
        String query = scanner.nextLine();

        boolean found = searchStudent(campusStudents, query);
        if (found) {
            System.out.println("Result: Student '" + query + "' exists in the records.");
        } else {
            System.out.println("Result: Student '" + query + "' was not found.");
        }

        
    }
}