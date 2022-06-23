package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcPractice {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcpractice",
        "postgres", "postgres");
        System.out.println(conn);
    }
    
}
