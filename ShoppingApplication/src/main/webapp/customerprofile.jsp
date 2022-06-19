
<%@ page language="java" import="java.sql.*" import="com.shopping.in.*"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerprofile</title>

</head>

<body align="center" bgcolor="lightgray">
<h1>CUSTOMER PROFILE</h1>
<br><br><br>
<a href="customerhome.html" >HOME</a>&emsp;&emsp;&emsp;
<a href="customerlogin.html" >LOGOUT</a>&emsp;&emsp;&emsp;

<table border="1" width="30%" heght="500" cellpadding="20">

<tr><th>CustomerId</th><th>CustomerName</th><th>Gender</th><th>Mail</th><th>Mobile</th></tr>
<%

Connection con=ConnectionClass.getconnection();
con=ConnectionClass.getconnection();
PreparedStatement ps=con.prepareStatement("select * from costomerregister where custid=?; " );
int id=(Integer)session.getAttribute("custid");
 ps.setInt(1,id);
 ResultSet rs=ps.executeQuery();

while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td><td><%=rs.getString("name") %></td><td><%=rs.getString("gender") %></td><td><%=rs.getString("mail") %></td><td> <%=rs.getInt("mobile") %></td></tr>

<% }%>

</table>

</body>
</html>