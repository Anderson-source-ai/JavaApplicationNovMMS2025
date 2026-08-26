package school.repository;

public class Part4_Arrays {
    private String[] studentNames = new String[10];
    private int count = 0;

    public void addStudent(String name) {
        if (count < studentNames.length) {
            studentNames[count++] = name;
        }
    }
}