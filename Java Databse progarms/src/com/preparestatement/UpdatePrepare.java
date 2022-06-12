package com.preparestatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbconnection.ConnectionClass;
public class UpdatePrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con=ConnectionClass.getConnect();
			
			PreparedStatement ps=con.prepareStatement("update student set age=age+2 ;");
			int i=ps.executeUpdate();
			if(i!=0)
				System.out.println(i+"upadated record successfully..");
			else
				System.out.println(i+" upadated record not success ..");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}