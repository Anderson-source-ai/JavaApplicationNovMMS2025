public class ClassWork1{
    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.printName();
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student Name: " + this.name);
    }
}