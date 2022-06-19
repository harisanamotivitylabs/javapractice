package com.employeemanage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeeRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
response.setContentType("text/html");
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String mail=request.getParameter("mail");
		String passwordin=request.getParameter("psw");
		String department=request.getParameter("department");
		Connection con=null;
		try {
		
		con=ConnectionDb.getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into employeeregister(name,gender,mobile,mail,password,department) values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, gender);
		ps.setInt(3, mobile);
		ps.setString(4,mail );
		ps.setString(5,passwordin );
		ps.setString(6,department );
		int i=ps.executeUpdate();
		PrintWriter out=response.getWriter();
		if(i!=0)
		{
			
			response.sendRedirect("employeelogin.html");
		}
		else
		{
			response.sendRedirect("employeeregister.html");
		}
				
		}
		catch (SQLException e) {
		
		    System.out.println(e);
	       }
		
	}

}
