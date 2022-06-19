package com.connectionpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertPrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn;
		 PgDatabaseConnection pc= new PgDatabaseConnection();
		 conn = pc.getConnect();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, 109);
			ps.setString(2, "captain");
			ps.setInt(3,18);
			ps.setString(4, "swis");
			
			int i=ps.executeUpdate();
			if(i!=0)
				System.out.println(i+"inserted record successfully..");
			else
				System.out.println(i+" inserted record not success ..");
			
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
 
