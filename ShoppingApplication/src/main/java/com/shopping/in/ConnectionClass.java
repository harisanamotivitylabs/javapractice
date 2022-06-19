package com.shopping.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
  public static Connection getconnection()
{
	String url = "jdbc:postgresql://localhost/shopingapp";
	String user="postgres";
	String password="system";
	Connection con=null;

	try {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		 con = DriverManager.getConnection(url, user,password);
     }
	 catch (SQLException e) {
		
		System.out.println(e);
	}
	return con;
}
}