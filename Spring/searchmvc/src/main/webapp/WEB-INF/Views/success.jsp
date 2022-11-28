<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>successPage</title>
</head>
<body>
<h2>${student}</h2>

<hr>


<h3>Name is : ${student.name}</h3>
<h3>Student Id is : ${student.id}</h3>
<%-- <h3>Student DOB is : ${student.date}</h3>
<h3>Course are : ${student.courses}</h3> --%>
<h3>Student Gender is : ${student.gender}</h3>
<h3>Student Type is : ${student.type}</h3>

<hr>

<h4>Address , Street : ${student.address.street} & City : ${student.address.city}</h4>


</body>
</html>