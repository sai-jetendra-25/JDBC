package com.optimisejdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectApp1 {
	public static void main(String[] args) {
		try(Connection con=DBconnection.getConnetion();
				PreparedStatement ps=con.prepareStatement("SELECT*FROM student")){
			ResultSet rs=ps.executeQuery();
			System.out.println("Id | Sname | Age | city|");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+"  "+rs.getString("Sname")+"  "+rs.getInt("Age")+"  "+rs.getString("city")+"  ");
			}
					
				} catch (SQLException e) {
					System.out.println("SQLError:"+e.getErrorCode());
		            System.out.println("SQL STATUS:"+e.getSQLState());
		            System.out.println("ERROR Message:"+e.getMessage());
					
					e.printStackTrace();
				}
				
	}

}
