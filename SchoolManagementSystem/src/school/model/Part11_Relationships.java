package school.model;

import java.util.ArrayList;
import java.util.List;

public class Part11_Relationships {
    private String departmentName;
    private List<Part6_StudentOOP> students = new ArrayList<>();

    public Part11_Relationships(String departmentName) {
        this.departmentName = departmentName;
    }

    public void addStudent(Part6_StudentOOP student) {
        students.add(student);
    }
}