package com.optimisejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String url="jdbc:mysql://localhost:3306/jdbcLearning";
    private static final String user="root";
  private static final String pass="root";
  public static  Connection getConnetion()throws SQLException{
    return DriverManager.getConnection(url, user, pass);

  }

}
