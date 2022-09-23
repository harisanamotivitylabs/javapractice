<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patients Data Screen</title>
</head>
<body>

	<div align="center">
	
		<h1>Patients List</h1>
		
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>BloodGroup</th>
			<th>Description</th>
			<th>Age</th>
			<th>Action</th>
			

			<c:forEach var="patients" items="${listPatients}">
				<tr>

					<td>${patients.name}</td>
					<td>${patients.email}</td>
					<td>${patients.address}</td>
					<td>${patients.telephone}</td>
					<td>${patients.bloodgroup}</td>
					<td>${patients.description}</td>
					<td>${patients.age}</td>
					<td><a href="editPatients?id=${patients.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deletePatients?id=${patients.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Patients Register <a href="newPatients">here</a>
		</h4>
	</div>
</body>
</html>