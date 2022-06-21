<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body align="center" bgcolor="cyan">
<h1>APPLY LEAVE PORTAL</h1>
<form action="ApplyLeave" method="post" name="f1">

   NAME :<input type="text" name="name" id="name"/><br><br>
 
   DEPARTMENT   : <select name="department">
               <option>--SELECT--</option>
               <option value="leavedept">leaveDepartment</option>
               <option value="tester">Admin</option>
               <option value="QA">QA</option>
               <option value="salseforce">salesforce</option></select><br><br>
               
   FROM DATE:<input type="date" name="fdate" id="fdate"/><br><br>

   TO DATE:<input type="date" name="tdate" id="tdate"  onchange="fun1()"/><br><br>

   NO OF DAYS:<input type="text" id="day" name="day"  /><br><br>

   RESION :<textarea name="reasion" id="resion"  rows="3" cols="30"></textarea><br><br>

        <input type="submit" value="applyleave" />
  
  <script >
function fun1()
{
var fd=document.getElementById("fdate").value;
var td=document.getElementById("tdate").value;
var date1 = new Date(fd);
var date2 = new Date(td);
  
var Difference_In_Time = date2.getTime() - date1.getTime();
  
var Days = Difference_In_Time / (1000 * 3600 * 24);


 document.getElementById("day").value=Days;
 

}

</script>
</form>
</body>
</html>