package com.example.demo;

import java.sql.*;

public class ExampleOne {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/movie_db";
        String user = "root";
        String password = "Hrsptl646@mysql";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Successful");

        Statement stmt = con.createStatement();
        ResultSet rs1 = stmt.executeQuery("SELECT * FROM users");

        while(rs1.next()){
            int id = rs1.getInt("id");
            String name = rs1.getString("username");
            System.out.println(id + " : " + name);
        }

    }
}
