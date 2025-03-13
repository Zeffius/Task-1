package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Util {
    private static final String URL = "jdbc:postgresql://localhost:5433/";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    private Util () {}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    // реализуйте настройку соеденения с БД
}
