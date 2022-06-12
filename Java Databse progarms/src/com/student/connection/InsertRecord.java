
package com.student.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.dbconnection.ConnectionClass;


public class InsertRecord {

	public static void main(String[] args) {
		try {
			Connection con=ConnectionClass.getConnect();
			Statement stm=con.createStatement();
			int i=stm.executeUpdate("insert into student values(106,'blackman','eee','marvel',38)");
			 System.out.println(i+" record inserted..successfully...");
		   con.close();
		    }	
			catch(Exception e)
	       	{
			System.out.println(e);	
	        }
	}
	}