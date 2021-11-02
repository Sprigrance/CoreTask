package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=FALSE";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnectionWithJDBC() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Не удалось установить соединение с БД");
        }
        return connection;
    }
}
