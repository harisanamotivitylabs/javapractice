package com.connectionpg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PgDatabaseConnection {
	public  Connection getConnect()
	{
		
		String url = "jdbc:postgresql://localhost/psqldatabase";
		String user="postgres";
		String password="system";
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user,password);
			if(conn!=null)
			{
				System.out.println("pg data base connection succesfully");
			}
			else {
				System.out.println("pg data base connection not succesfully");
			}
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		return conn;


	}

}
