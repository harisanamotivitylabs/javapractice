<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*" import="com.employeemanage.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<% 
int id=Integer.parseInt(request.getParameter("employeeid"));
int total=Integer.parseInt(request.getParameter("totalleave"));
int reqleave=Integer.parseInt(request.getParameter("requestleave"));
String status;
String name=(String)session.getAttribute("mname");
if(total>=reqleave&&reqleave<=2)
{
	total=total-reqleave;
	status="accepted";
	
	
}
else
{
	status="rejected";
}
   Connection con=null;
try{
  con=ConnectionDb.getDbConnection();
  

   PreparedStatement ps=con.prepareStatement(" update leaveportal set managername=?, status=?,total_leaves=? where employeeid= ? and status='pending' ;" );
   ps.setString(1, name);
   ps.setString(2,status);
   ps.setInt(3,total);
   ps.setInt(4,id);
int x=ps.executeUpdate();
if(x!=0)
{
	
	response.sendRedirect("leaverequest.jsp");
	
}
 %>
 
 <%   
     
   }
  finally
  {
	con.close();
  }
%>
</body>
</html>