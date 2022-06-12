package com.preparestatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbconnection.ConnectionClass;
public class DeletePrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con=ConnectionClass.getConnect();
			
			PreparedStatement ps=con.prepareStatement("delete from student where stud_id=?;");
			ps.setInt(1, 104);
			int i=ps.executeUpdate();
			if(i!=0)
				System.out.println(i+"deleted record successfully..");
			else
				System.out.println(i+" delete record not success ..");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
