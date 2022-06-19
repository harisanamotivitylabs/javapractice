package com.shopping.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpolyeLogin")
public class EmpolyeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmpolyeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		
		String mail=request.getParameter("mail");
		String passwordin=request.getParameter("psw");
		
		Connection con=null;
		try {
		
		con=ConnectionClass.getconnection();
		PreparedStatement ps=con.prepareStatement( " select * from employeregister where mail= ? and password= ?; ");
		
		ps.setString(1,mail );
		ps.setString(2,passwordin );

		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			response.sendRedirect("./employehome.html");
		}
		else
		{
			response.sendRedirect("./employlogin.html");
		}
		
				}
		catch (SQLException e) {
		
		    System.out.println(e);
	       }
		
		
	}

}
