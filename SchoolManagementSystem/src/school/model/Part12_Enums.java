package school.model;

enum Gender { MALE, FEMALE }
enum StudentLevel { ND1, ND2, HND1, HND2 }

public class Part12_Enums {
    private String name;
    private Gender gender;
    private StudentLevel level;

    public Part12_Enums(String name, Gender gender, StudentLevel level) {
        this.name = name;
        this.gender = gender;
        this.level = level;
    }

    public void display() {
        System.out.println("Name: " + name + " | Gender: " + gender + " | Level: " + level);
    }

    public static void main(String[] args) {
        Part12_Enums student = new Part12_Enums("Grace Hopper", Gender.FEMALE, StudentLevel.HND2);
        student.display();
    }
}