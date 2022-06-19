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
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;


@WebServlet("/ApplyLeave")
public class ApplyLeave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ApplyLeave() {
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
		String department=request.getParameter("department");
		String fdate=request.getParameter("fdate");
		String ldate=request.getParameter("ldate");
		
		int days=Integer.parseInt(request.getParameter("days"));
		 HttpSession session = request.getSession();
		int id=(Integer)session.getAttribute("employeeid");
		Connection con=null;
		try {
		
		con=ConnectionDb.getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into leaveportal(name,employeeid,mobile,mail,department,fdate,ldate,days,managername,status) values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.setInt(3, mobile);
		ps.setString(4,mail );
		ps.setString(5, department);
		ps.setString(6,fdate );
		ps.setString(7,ldate );
		ps.setInt(8, days);
		ps.setString(9,"none" );
		ps.setString(10,"pending" );
		int i=ps.executeUpdate();
		PrintWriter out=response.getWriter();
		if(i!=0)
		{
			
			response.sendRedirect("leavedetails.jsp");
		}
		else
		{
			response.sendRedirect("applyleave.jsp");
		}
				
		}
		catch (SQLException e) {
		
		    System.out.println(e);
	       }

	}

}
