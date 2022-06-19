<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.sql.*" import="com.employeemanage.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int id=Integer.parseInt(request.getParameter("employeeid"));
int total=Integer.parseInt(request.getParameter("totalleave"));
int reqleave=Integer.parseInt(request.getParameter("requestleave"));
String status;
String name=(String)session.getAttribute("mname");
if(total>=reqleave)
{
	status="accepted";
	total=total-reqleave;
}
else
{
	status="rejected";
}
   Connection con=null;
try{
  con=ConnectionDb.getDbConnection();
  

   PreparedStatement ps=con.prepareStatement(" update leaveportal set managername=?, status=?,total_leaves=? where employeeid= ? ; " );
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