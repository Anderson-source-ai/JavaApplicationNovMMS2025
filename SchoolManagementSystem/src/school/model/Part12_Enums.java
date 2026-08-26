package school.model;

public class Part12_Enums {
    public enum Gender { MALE, FEMALE }
    public enum StudentLevel { ND1, ND2, HND1, HND2 }

    private Gender gender;
    private StudentLevel level;

    public Part12_Enums(Gender gender, StudentLevel level) {
        this.gender = gender;
        this.level = level;
    }
}