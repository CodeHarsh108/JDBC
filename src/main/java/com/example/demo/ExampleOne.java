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

        String sql = "SELECT name from actors WHERE nationality = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "British");
        ResultSet rs2 = ps.executeQuery();
        while (rs2.next()){
            System.out.println(rs2.getString("name"));
        }


    }
}
