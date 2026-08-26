package school.repository;

public class Part24_DatabaseRelationships {
    public String getJoinQuery() {
        return "SELECT s.id, s.name, d.department_name " +
               "FROM students s JOIN departments d ON s.dept_id = d.id";
    }
}