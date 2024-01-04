package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/mysqlgl";
            String user = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the database!");
                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
