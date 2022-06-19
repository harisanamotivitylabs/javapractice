package com.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TicketRaise")
public class TicketRaise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TicketRaise() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		String mail=request.getParameter("mail");
		String query=request.getParameter("query");
		
		
		String url = "jdbc:postgresql://localhost/shoppingquerys";
		String user="postgres";
		String password="system";

		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection(url, user,password);
			PreparedStatement ps=con.prepareStatement("insert into customerquery(name,gender,mobile,mail,query) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setInt(3, mobile);
			ps.setString(4,mail );
			ps.setString(5, query);
			int i=ps.executeUpdate();
			
				out.println("<html><body bgcolor='gray' align='center'><h1>");
			out.println("registerd successfully");
			out.println("</h1></html>");
			
					} catch (SQLException e) {
			
			System.out.println(e);
		}
		
		
		
		
	}

}
