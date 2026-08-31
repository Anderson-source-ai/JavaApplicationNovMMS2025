package school.model;

import java.util.Scanner;

public class Part1_StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Birth Year (YYYY): ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Level (e.g. ND1, ND2): ");
        String level = scanner.nextLine();

        // String manipulation and arithmetic calculations
        String fullName = firstName + " " + lastName;
        int currentYear = 2026;
        int age = currentYear - birthYear;
        String status = "Active / Registered";

        
        System.out.println("\n=================================");
        System.out.println("  STUDENT REGISTRATION SUMMARY   ");
        System.out.println("=================================");
        System.out.println("Student ID     : " + id);
        System.out.println("Full Name      : " + fullName);
        System.out.println("Gender         : " + gender);
        System.out.println("Age            : " + age + " years old");
        System.out.println("Email          : " + email);
        System.out.println("Phone          : " + phone);
        System.out.println("Department     : " + department);
        System.out.println("Level          : " + level);
        System.out.println("Status         : " + status);
        System.out.println("=================================");

        
    }
}