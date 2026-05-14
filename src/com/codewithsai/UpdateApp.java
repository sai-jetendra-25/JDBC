package com.codewithsai;

import java.sql.*;

public class UpdateApp {
          public static void main(String[] args) throws Exception {
        //Connetions
        String url = "jdbc:mysql://localhost:3306/JDBCLearning";
        String user = "root";
        String password = "root";
        //Connetions
        Connection con = DriverManager.getConnection(url, user, password);
        Statement s=con.createStatement();
        System.out.println("Connected successfully!");
        // UPDATE the dataBase JdbcLearning
       int r= s.executeUpdate("UPDATE Student SET ID=2 where ID=3");
       if(r==0){
        System.out.println("Update Failed");

       }
       else {
        System.out.println("Update Successful!");
       }
       s.close();
       con.close();
    
}
}

    

