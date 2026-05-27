package com.codewithsai;

import java.sql.*;

public class DeleteApp {
      public static void main(String[] args) throws Exception {
        //Connetions
        String url = "jdbc:mysql://localhost:3306/JDBCLearning";
        String user = "root";
        String password = "root";
        //Connetions
        Connection con = DriverManager.getConnection(url, user, password);
        Statement s=con.createStatement();
        System.out.println("Connected successfully!");
        // DELETE from dataBase JdbcLearning
       int r= s.executeUpdate("DELETE FROM Student WHERE ID=2");
       if(r==0){
        System.out.println("Deletion Failed");

       }
       else {
        System.out.println("deletion Successful!");
       }
       s.close();
       con.close();
    
}
}
