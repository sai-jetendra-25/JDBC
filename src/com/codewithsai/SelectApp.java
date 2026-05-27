package com.codewithsai;

import java.sql.*;


public class SelectApp {
     public static void main(String[] args) throws Exception {
        //Connetions
        String url = "jdbc:mysql://localhost:3306/JDBCLearning";
        String user = "root";
        String password = "root";
        //Connetions
        Connection con = DriverManager.getConnection(url, user, password);
        Statement s=con.createStatement();
        System.out.println("Connected successfully!");
        // SELECTING dataBase JdbcLearning
    ResultSet rs = s.executeQuery("SELECT * FROM Student");


while(rs.next()) {

    System.out.println(rs.getInt("Id") + " " + rs.getString("Sname") + " " + rs.getInt("Age") + " " + rs.getString("city"));
        }

rs.close();
s.close();
con.close();

        }
    }
