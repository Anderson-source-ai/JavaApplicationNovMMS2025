package school.service;

enum UserRole { ADMIN, TEACHER, STUDENT }

public class Part25_Security {
    public static boolean canEnterGrades(UserRole role) {
        return role == UserRole.ADMIN || role == UserRole.TEACHER;
    }

    public static void main(String[] args) {
        System.out.println("Can Student edit grades? " + canEnterGrades(UserRole.STUDENT));
        System.out.println("Can Teacher edit grades? " + canEnterGrades(UserRole.TEACHER));
    }
}