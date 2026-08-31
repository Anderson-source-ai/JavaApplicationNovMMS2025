package school.model;

import java.io.Serializable;

public class Part22_Serialization implements Serializable {
    private static final long serialVersionUID = 1L;
    private String studentId;
    private String name;

    public Part22_Serialization(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public static void main(String[] args) {
        Part22_Serialization object = new Part22_Serialization("STU99", "Olivia");
        System.out.println("Object instance created ready for serialization: " + object.name);
    }
}