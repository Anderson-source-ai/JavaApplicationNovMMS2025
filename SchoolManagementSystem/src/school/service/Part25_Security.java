package school.service;

public class Part25_Security {
    public enum Role { ADMIN, TEACHER, STUDENT }

    public boolean canEditGrades(Role role) {
        return role == Role.ADMIN || role == Role.TEACHER;
    }
}