package com.employeemanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	
	public static Connection getDbConnection()
	{
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  
		Connection con=null;	
		  try {
			con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/employemanagement","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		
		return con;
	}
	
}


