package school.service;

class SchoolMember {
    public void displayRole() {
        System.out.println("General School Member");
    }
}

class StudentMember extends SchoolMember {
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

class TeacherMember extends SchoolMember {
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

public class Part10_Polymorphism {
    public static void main(String[] args) {
        SchoolMember m1 = new StudentMember();
        SchoolMember m2 = new TeacherMember();

        m1.displayRole();
        m2.displayRole();
    }
}