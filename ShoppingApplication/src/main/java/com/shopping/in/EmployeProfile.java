package com.shopping.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeProfile")
public class EmployeProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmployeProfile() {
        super();
        
        }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		String mail=request.getParameter("mail");
		
		Connection con=null;
		try {
		
		con=ConnectionClass.getconnection();
		PreparedStatement ps=con.prepareStatement("select * from employeregister where mail= ? ; ");
		
		ps.setString(1,mail );
		
     ResultSet rs=ps.executeQuery();
		
     ResultSetMetaData rsmd=rs.getMetaData();
    PrintWriter out=response.getWriter();
    out.print("<table width=55% border=1 align='center'>");

    out.print("<center><h1>Result:"+mail+"</h1></center>");;
    
     while(rs.next())
        {
    	
        out.print("<tr>");
        out.println("<td>"+rsmd.getColumnName(1)+"</td>");
        out.println("<td>"+rs.getInt(1)+"</td></tr>");

        out.println("<tr><td>"+rsmd.getColumnName(2)+"</td>");
        out.println("<td>"+rs.getString(2)+"</td></tr>");

        out.println("<tr><td>"+rsmd.getColumnName(3)+"</td>");
        out.println("<td>"+rs.getString(3)+"</td></tr>");

        out.println("<tr><td>"+rsmd.getColumnName(4)+"</td>");
        out.println("<td>"+rs.getInt(4)+"</td></tr>");  
        
        out.println("<tr><td>"+rsmd.getColumnName(5)+"</td>");
        out.println("<td>"+rs.getString(5)+"</td></tr>"); 
        
        out.println("<tr><td>"+rsmd.getColumnName(6)+"</td>");
        out.println("<td>"+rs.getString(6)+"</td></tr>");  
        
        out.println("<tr><td>"+rsmd.getColumnName(7)+"</td>");
        out.println("<td>"+rs.getString(7)+"</td></tr>");  

     }
     out.print("</table>");
	}
		catch (SQLException e) {
		
	    System.out.println(e);
       }

}
}
