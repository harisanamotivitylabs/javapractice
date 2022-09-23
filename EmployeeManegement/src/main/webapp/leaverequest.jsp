<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*" import="com.employeemanage.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<br><br>
<a href="managerhome.jsp"  >BACK TO HOME</a> <h2 align="center">MANAGER LEAVE REQUESTS</h2>
<table border="1" width="300px" height="50px" cellpadding="20">
  <tr><th>leave No</th><th>Employee Name</th><th>Mail</th><th>Mobile</th><th>Department</th><th> Reasion </th><th>FROM DATE</th><th>TO DATE</th><th>RemainingLeaves</th><th>Manager Name</th><th>Leave Status</th></tr>
<% 
   Connection con=null;
try{
  con=ConnectionDb.getDbConnection();

   PreparedStatement ps=con.prepareStatement(" select * from leaveportal where department=? ; " );
  String did=(String)session.getAttribute("leavedept");
   ps.setString(1,did);
   ResultSet rs=ps.executeQuery();

  while(rs.next()){
	 
	  %>
	 
  <tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getString(5) %></td><td> <%=rs.getInt(4) %></td><td><%=rs.getString(6) %></td>
  <td><%=rs.getString(11) %></td><td><%=rs.getString(8) %><td><%=rs.getString(9) %><td><%=rs.getInt(7) %></td><td><%=rs.getString(12) %></td><td><%=rs.getString(13) %></td><td><a href="accept.jsp?totalleave=<%=rs.getString(7) %>&requestleave=<%=rs.getString(10) %>&employeeid=<%=rs.getInt(3) %>">accept/regect</a></td>
  <td><a href="deleteleave.jsp?leaveid=<%=rs.getInt(1) %>">Delete</a></tr>

  <%   
     }
   }
  finally
  {
	con.close();
  }
%>

</table>
</body>
</html>