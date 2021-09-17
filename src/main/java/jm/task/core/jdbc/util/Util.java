package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String HOST = "jdbc:mysql://localhost:3306/users?useSSL=false";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "Rootroot";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
