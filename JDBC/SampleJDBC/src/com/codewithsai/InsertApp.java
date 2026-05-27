package com.codewithsai;

import java.sql.*;

public class InsertApp {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "root";
        // Connetions
        Connection con = DriverManager.getConnection(url, user, password);
        Statement s=con.createStatement();
        System.out.println("Connected successfully!");
        // INSERT into the dataBase JdbcLearning
       int rs= s.executeUpdate("INSERT INTO Student Values(1,'Ravi',17,'Hyderabad')");
       if(rs==0){
        System.out.println("Failed to insert");
       }
       else {
        System.out.println("Data Insertd");
       }

        s.close();
        con.close();
    }
}