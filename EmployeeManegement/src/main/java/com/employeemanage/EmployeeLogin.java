package com.employeemanage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeeLogin() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
			
			
			String mail=request.getParameter("mail");
			String passwordin=request.getParameter("psw");
			HttpSession hs=request.getSession();
			Connection con=null;
			try {
			
			con=ConnectionDb.getDbConnection();
			PreparedStatement ps=con.prepareStatement( " select * from employeeregister where mail=? and password=? ; ");
			
			ps.setString(1,mail );
			ps.setString(2,passwordin );
			

			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				hs.setAttribute("employeeid",rs.getInt(1));
				hs.setAttribute("mobile",rs.getInt(4));
				hs.setAttribute("mail", rs.getString("mail"));
				response.sendRedirect("employeehome.html");
				
			}
			else
			{
				response.sendRedirect("employeelogin.html");
			}
			
		 }
			catch (SQLException e)
			 {
			
			    System.out.println(e);
		       }
		
		
	}

}
