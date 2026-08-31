package school.repository;

public class Part24_DatabaseRelationships {
    public static String getJoinQuery() {
        return "SELECT s.id, s.name, d.department_name " +
               "FROM students s " +
               "JOIN departments d ON s.department_id = d.id";
    }

    public static void main(String[] args) {
        System.out.println("Relational SQL Join Query:\n" + getJoinQuery());
    }
}