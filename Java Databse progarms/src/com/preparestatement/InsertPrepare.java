package com.preparestatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbconnection.ConnectionClass;
public class InsertPrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con=ConnectionClass.getConnect();
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, 109);
			ps.setString(2, "captain");
			ps.setString(3,"cse");
			ps.setString(4, "swis");
			ps.setInt(5,28 );
			int i=ps.executeUpdate();
			
			if(i!=0)
				System.out.println(i+"inserted record successfully..");
			else
				System.out.println(i+" inserted record not success ..");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}