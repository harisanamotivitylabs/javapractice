package com.preparestatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbconnection.ConnectionClass;
public class SelectPrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con=ConnectionClass.getConnect();
			
			PreparedStatement ps=con.prepareStatement("select * from student;");
			ResultSet rs=ps.executeQuery();
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
