package com.student.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbconnection.ConnectionClass;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Connection con=ConnectionClass.getConnect();
			Statement stm=con.createStatement();
			int i=stm.executeUpdate("update student set age=age+1 ;");
			 System.out.println(i+" records updated..successfully...");
		   con.close();
		    }	
			catch(Exception e)
	       	{
			System.out.println(e);	
	        }
	}

	
	}


