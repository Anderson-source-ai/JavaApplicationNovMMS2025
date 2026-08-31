package school.service;

import java.util.*;

class StudentRecord implements Comparable<StudentRecord> {
    String name;
    double gpa;

    public StudentRecord(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(StudentRecord other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

public class Part17_Sorting {
    public static void main(String[] args) {
        List<StudentRecord> students = new ArrayList<>();
        students.add(new StudentRecord("Leo", 3.2));
        students.add(new StudentRecord("Mona", 3.9));

        Collections.sort(students);
        System.out.println("Sorted by GPA (Descending): " + students);
    }
}