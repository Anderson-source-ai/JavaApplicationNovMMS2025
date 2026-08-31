package school.model;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String title;
    public Course(String title) { this.title = title; }
    public String getTitle() { return title; }
}

class Department {
    private String name;
    private List<String> students = new ArrayList<>();

    public Department(String name) { this.name = name; }
    public void addStudent(String studentName) { students.add(studentName); }
}

class StudentReceipt {
    private double amount;
    public StudentReceipt(double amount) { this.amount = amount; }
    public double getAmount() { return amount; }
}

public class Part11_Relationships {
    private StudentReceipt receipt;

    public Part11_Relationships(double feeAmount) {
        this.receipt = new StudentReceipt(feeAmount);
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Department dept = new Department("Computer Science");
        dept.addStudent("Frank White");

        Part11_Relationships studentPayment = new Part11_Relationships(500.0);
        System.out.println("Assigned Course: " + course.getTitle());
        System.out.println("Payment Created: $" + studentPayment.receipt.getAmount());
    }
}