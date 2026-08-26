package school.model;

public class Part1_StudentRegistration {
    private String studentId;
    private String firstName;
    private String lastName;

    public Part1_StudentRegistration(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}