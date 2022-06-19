<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*" import="com.employeemanage.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>profile</title>
</head>
<body>

<li><a href="employeelogin.html" target="secction" >APPLY FOR LEAVE</a>
<li><a href="employeelogin.html" target="secction" >EMPLOYEE LOGOUT</a>
<% 
   Connection con=null;
try{
  con=ConnectionDb.getDbConnection();

   PreparedStatement ps=con.prepareStatement(" select * from employeeregister where employeeid= ? ; " );
   int id=(int)session.getAttribute("managerid");
   ps.setInt(1,id);
   ResultSet rs=ps.executeQuery();

  while(rs.next()){
	  %>
  <h2>EMPLOYEE PROFILE</h2> 	  
  <table border="1" width="300px" height="300px" cellpadding="20">
  <tr><th>CustomerId</th><th>EMPLOYEE NAME</th><th>Gender</th><th>Mail</th><th>Mobile</th><th>Department</th></tr>
  <tr><td><%=rs.getInt(1) %></td><td><%=rs.getString(2) %></td><td><%=rs.getString(3) %></td><td><%=rs.getString(5) %></td><td> <%=rs.getInt(4) %></td><td><%=rs.getString(7) %></td></tr>

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