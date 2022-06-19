package com.shopping.in;

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


@WebServlet("/EmployeRegister")
public class EmployeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EmployeRegister() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String mail=request.getParameter("mail");
		String passwordin=request.getParameter("psw");
		String department=request.getParameter("department");
		Connection con=null;
		try {
		
		con=ConnectionClass.getconnection();
		PreparedStatement ps=con.prepareStatement("insert into employeregister(name,gender,mobile,mail,password,department) values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, gender);
		ps.setInt(3, mobile);
		ps.setString(4,mail );
		ps.setString(5,passwordin );
		ps.setString(6, department);
		int i=ps.executeUpdate();
		PrintWriter out=response.getWriter();
		if(i!=0)
		{
			
			response.sendRedirect("./employlogin.html");
		}
		else
		{
			response.sendRedirect("./employregister.html");
		}
				}
		catch (SQLException e) {
		
		    System.out.println(e);
	       }
		
			
	}

}
