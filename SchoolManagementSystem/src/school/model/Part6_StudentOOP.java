package school.model;

public class Part6_StudentOOP {
    private String studentId;
    private String name;
    private double gpa;
    private static int studentCount = 0;

    public Part6_StudentOOP(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        studentCount++;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }

    public static int getStudentCount() {
        return studentCount;
    }

    public void displayDetails() {
        System.out.println("ID: " + this.studentId + " | Name: " + this.name + " | GPA: " + this.gpa);
    }

    public static void main(String[] args) {
        Part6_StudentOOP s1 = new Part6_StudentOOP("STU001", "Alice Johnson", 3.8);
        Part6_StudentOOP s2 = new Part6_StudentOOP("STU002", "Bob Smith", 2.9);

        s1.displayDetails();
        s2.displayDetails();
        System.out.println("Total Students Enrolled: " + Part6_StudentOOP.getStudentCount());
    }
}