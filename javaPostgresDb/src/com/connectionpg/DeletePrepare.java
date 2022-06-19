package com.connectionpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeletePrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn;
		 PgDatabaseConnection pc= new PgDatabaseConnection();
		 conn = pc.getConnect();
		try {
			
			
			PreparedStatement ps=conn.prepareStatement("delete from student where stid=?;");
			ps.setInt(1, 101);
			int i=ps.executeUpdate();
			if(i!=0)
				System.out.println(i+"deleted record successfully..");
			else
				System.out.println(i+" delete record not success ..");
			
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}