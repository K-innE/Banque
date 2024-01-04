/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author kinae
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.mariadb.jdbc.Statement;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/mysqlgl";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    

    Connection con = null;

   public static Connection connect() throws SQLException {
    try {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    } catch (ClassNotFoundException e) {
        throw new SQLException("MariaDB JDBC Driver not found", e);
    }
}


    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
