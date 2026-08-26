package school.model;

public class Part6_StudentOOP {
    private String studentId;
    private String name;
    private double gpa;

    public Part6_StudentOOP(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}