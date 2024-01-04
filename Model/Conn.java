/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kinae
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/mysqlgl";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    Connection con = null;
    Statement s = null;

   public Conn() {
    try {
        Class.forName("org.mariadb.jdbc.Driver");
        con = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        s = con.createStatement();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}

    public static void close(Connection connection, Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
