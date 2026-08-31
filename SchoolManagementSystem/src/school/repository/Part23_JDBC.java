package school.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Part23_JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "STU200");
            stmt.setString(2, "Paul");
            System.out.println("Database PreparedStatement prepared successfully.");
        } catch (Exception e) {
            System.out.println("JDBC Connection notice: Setup server to execute.");
        }
    }
}