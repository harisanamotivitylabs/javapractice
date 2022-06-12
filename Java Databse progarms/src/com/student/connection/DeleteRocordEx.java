package com.student.connection;

import java.sql.Connection;
import java.sql.Statement;

import com.dbconnection.ConnectionClass;

public class DeleteRocordEx {

	public static void main(String[] args) {
		try {
			Connection con=ConnectionClass.getConnect();
			Statement stm=con.createStatement();
			int i=stm.executeUpdate("delete from student where stud_id=106;");
			if(i!=0)
			 System.out.println(i+" record deleted..successfully...");
			else
				 System.out.println(i+" no such record not found...");
		   con.close();
		    }	
			catch(Exception e)
	       	{
			System.out.println(e);	
	        }
	}

}
