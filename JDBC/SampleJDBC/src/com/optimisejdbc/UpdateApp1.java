package com.optimisejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateApp1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try( Connection con=DBconnection.getConnetion();
				PreparedStatement ps=con.prepareStatement("UPDATE Student SET city=? Where id=?")){
			ps.setString(1,"Delhi");
			ps.setInt(2,2);
			
			int row=ps.executeUpdate();
			if(row>0) {
					System.out.println("Data Updated ");
					
			}
			else {
				
				System.out.println("Failed to Update");
			}
			
			
		}catch(SQLException e) {
			System.out.println("Error Status:"+e.getSQLState());
			System.out.println("Error Message :"+e.getMessage());
			
		}

	}

}
