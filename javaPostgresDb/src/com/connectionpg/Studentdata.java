package com.connectionpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Studentdata {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Scanner sc= new Scanner(System.in);
			Connection conn;
			 PgDatabaseConnection pc= new PgDatabaseConnection();
			 conn = pc.getConnect();
			try {
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("welcome student Portal");
			System.out.println("-----Our services -----");
			System.out.println(" 1.Show Data ");
			System.out.println(" 2.Insert Data ");
			System.out.println(" 3.Update Data ");
			System.out.println(" 4.Delete Data ");
			System.out.println(" Enter what service you want..?? ");
			int choice=sc.nextInt();
			while(choice<=4)
			{
				switch(choice)
				{
			case 1:
				{
					try {
				
				PreparedStatement ps=conn.prepareStatement("select * from student;");
				ResultSet rs=ps.executeQuery();
				System.out.println("employe details are..");
				 while(rs.next())
				  {
					 
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));	
				  }
				
			      }
				 catch(Exception e)
				  {
					System.out.println(e);
				  }
				}
				break;
			case 2:
			   {         System.out.println("enter detalis to register ...");
				   try {
					  
					   System.out.println("enter empid");
					   int id=sc.nextInt();
					   System.out.println("enter empname");
					   String name=sc.next();
					   System.out.println("enter empsalary");
					   int esalary=sc.nextInt();
					   System.out.println("enter emp address");
					   String address=sc.next();
		
						PreparedStatement ps=conn.prepareStatement("insert into employeedata values(?,?,?,?)");
						ps.setInt(1, id);
						ps.setString(2, name);
						ps.setInt(3,esalary);
						ps.setString(4, address);
						int i=ps.executeUpdate();
						if(i!=0)
							System.out.println(i+"inserted record successfully..");
						else
							System.out.println(i+" inserted record not success ..");
								
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
			     }
			    break;
			case 3:	
			   {
				   try {
					   System.out.println("update data only applicaple salary and address and mandetory to enter");
					   System.out.println("enter empid");
					   int id=sc.nextInt();
					   System.out.println("enter salary");
					   int esalary=sc.nextInt();
					   System.out.println("enter emp address");
					   String address=sc.next();
						
						PreparedStatement ps=conn.prepareStatement("update employeedata set esalary=?,address=? where empid=?;");
						ps.setInt(1, esalary);
						ps.setString(2,address);
						ps.setInt(3, id);
						int i=ps.executeUpdate();
						if(i!=0)
							System.out.println(i+"upadated record successfully..");
						else
							System.out.println(i+" upadated record not success ..");	
						
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
			   }
			   break;
			case 4:	
			   {
				   try {
					   System.out.println("enter empid");
					   int id=sc.nextInt();
				   PreparedStatement ps=conn.prepareStatement("delete from employeedata where empid=?;");
					ps.setInt(1, id);
					int i=ps.executeUpdate();
					if(i!=0)
						System.out.println(i+"deleted record successfully..");
					else
						System.out.println(i+" delete record not success ..");		
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			   }
			   default :
				   System.out.println("enter valid option");
			}
				
				System.out.println("if you want continue with service please select option");
				choice=sc.nextInt();
				
		}
			//System.out.println("invalid option your disconnected with database");
			//con.close();

	}
}
	