package com.test;

import java.io.IOException;
import java.sql.*;


public class Login {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {}
    }

    protected void doPost() {
        boolean success = false;
        String username = "name"; //request.getParameter("username");
        String password = "pwd"; //request.getParameter("password");
        // Unsafe query which uses string concatenation
        String query = "select * from tbluser where username='" + username + "' and password = '" + password + "'";
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user", "user", "pwd");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                // Login Successful if match is found
                success = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {}
        }
        
    }
}