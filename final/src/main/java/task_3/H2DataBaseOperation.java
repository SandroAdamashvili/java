package task_3;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class H2DataBaseOperation implements CrudOperations{

    public H2DataBaseOperation() {
        try (Connection connection = getConnection("jdbc:h2:./test;AUTO_SERVER=TRUE")) {
            Statement statement = connection.createStatement();

            String createTableSQL = """
                    CREATE TABLE IF NOT EXISTS students (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255) NOT NULL
                    )
                    """;

            statement.executeUpdate(createTableSQL);

            System.out.println("Table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertNewStudent(String name, String courseName) {
        String sql = "INSERT INTO students (name, courseName) VALUES (?, ?)";
        try (Connection conn = getConnection("jdbc:h2:./test;AUTO_SERVER=TRUE");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, courseName);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
