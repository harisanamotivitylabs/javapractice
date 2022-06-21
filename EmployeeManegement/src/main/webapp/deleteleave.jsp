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
int leaveid=Integer.parseInt(request.getParameter("leaveid"));


   Connection con=null;
try{
  con=ConnectionDb.getDbConnection();
  

   PreparedStatement ps=con.prepareStatement(" delete from leaveportal where serialno =? " );
   ps.setInt(1,leaveid);
   
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