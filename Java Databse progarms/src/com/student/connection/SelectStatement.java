package com.student.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.dbconnection.ConnectionClass;
public class SelectStatement {
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try {
			Connection con=ConnectionClass.getConnect();
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from student;");
			  while(rs.next())
			  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
			  }
			con.close();
		    }	
			catch(Exception e)
	       	{
			System.out.println(e);	
	        }
     }
 }