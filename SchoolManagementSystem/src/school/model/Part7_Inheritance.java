package school.model;

class Person {
    protected String id;
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}

public class Part7_Inheritance extends Person {
    private String level;

    public Part7_Inheritance(String id, String name, String level) {
        super(id, name);
        this.level = level;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Student | Level: " + level);
    }

    public static void main(String[] args) {
        Part7_Inheritance student = new Part7_Inheritance("STU101", "Charlie Brown", "ND1");
        student.displayInfo();
    }
}