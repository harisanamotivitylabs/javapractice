package com.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionClass {
		public static Connection getConnect() throws SQLException, ClassNotFoundException 
		{		
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=null;	
			  con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/javapractice","root","root");  
			if(con!=null)
			{
				System.out.println("Connection Establishid..");
			}
			return con;
		}
}

	

