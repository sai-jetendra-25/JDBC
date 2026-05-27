package com.optimisejdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertApp1 {
    public static void main(String[] args) {
        try ( Connection con=DBconnection.getConnetion();
            PreparedStatement ps=con.prepareStatement("INSERT INTO Student(Id, Sname,Age,city) VALUES (?,?,?,?)")){
            ps.setInt(1,2);
            ps.setString(2,"ram");
            ps.setInt(3,20);
            ps.setString(4,"Hyd");
            int row=ps.executeUpdate();
            if(row>0){
                System.out.println("Data Inserted ");
            }
            else {
                System.out.println("Data failed to Insert");
            }

            
            
        } catch (SQLException e) {
            System.out.println("SQLError:"+e.getErrorCode());
            System.out.println("SQL STATUS:"+e.getSQLState());
            System.out.println("ERROR Message:"+e.getMessage());
        }
    }
}


