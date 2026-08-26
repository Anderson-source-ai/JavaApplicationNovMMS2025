package school.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Part23_JDBC {
    public void saveToDatabase(String id, String name) throws Exception {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, "root", "password");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();
        }
    }
}