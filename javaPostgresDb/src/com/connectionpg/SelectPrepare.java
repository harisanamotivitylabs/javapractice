package com.connectionpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn;
		 PgDatabaseConnection pc= new PgDatabaseConnection();
		 conn = pc.getConnect();
		try {
			
			
			PreparedStatement ps=conn.prepareStatement("select * from student;");
			ResultSet rs=ps.executeQuery();
			 while(rs.next())
			  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
				}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
