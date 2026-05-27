package com.optimisejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApp1 {
public static void main(String[] agrs) {
	try(Connection con=DBconnection.getConnetion();
			PreparedStatement ps=con.prepareStatement("DELETE FROM Student Where id=?")){
		  ps.setInt(1,2);
		  int row=ps.executeUpdate();
		  if(row>0) {
			  System.out.println("Data deleted");
		  }
		  else {
			  System.out.println("Failed to delete");
		  }
		
	} catch (SQLException e) {
		System.out.println("Error status:"+e.getSQLState());
		System.out.println("Error Message:"+e.getMessage());
		e.printStackTrace();
	}
}
}
