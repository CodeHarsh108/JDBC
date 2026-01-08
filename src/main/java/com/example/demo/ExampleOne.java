package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleOne {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/movie_db";
        String user = "root";
        String password = "Hrsptl646@mysql";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Successful");
        con.close();
    }
}
