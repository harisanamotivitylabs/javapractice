<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<form action="ApplyLeave" method="post"   >

     <table align="center" >
       <tr>
            <td>FULL NAME </td><td>  :   <input type="text" name="name" placeholder="Enter  Name"/></td>
        </tr>      
        <tr>
             <td>MOBILE NUMBER </td><td>  :   <input type="NUMBER" name="mobile" placeholder="Enter Mobile Number"/></td>
          </tr>
           <tr>
           <td>GENDER </td><td>  :   <input type="radio" name="gender" value="male" />MALE<input type="radio" name="gender" value="female" />FEMALE</td>
           </tr>
           <tr>
           <td>EMAIL </td><td>  :   <input type="email" name="mail" placeholder="Enter Email id"/></td>
           </tr>
         
        <tr>
       <td>DEPARTMENT  </td><td>  :   <select name="department">
       <option>--SELECT--</option>
       <option value="leavedept">leaveDepartment</option>
       <option value="tester">Admin</option>
       <option value="QA">QA</option>
       <option value="salseforce">salesforce</option>
      </select></td>
    </tr>
           <tr>
           <td>FROM DATE  </td><td>  :   <input type="date" name="fdate" /></td>
           </tr>
           <tr>
           <td>LAST DATE  </td><td>  :   <input type="date" name="ldate" /></td>
           </tr>
           <tr>
           <td>NUMBER OF DAYS  </td><td>  :   <input type="NUMBER" name="days" /></td>
           </tr>
    <tr>
     <td> </td><td><input type="submit" value="applyleave"  /></td>
    </tr>
   </table>
                  
  </form>

</body>
</html>