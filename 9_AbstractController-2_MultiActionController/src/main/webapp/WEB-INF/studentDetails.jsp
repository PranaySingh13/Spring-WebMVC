<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<br>
	<h1 style="color: red;">GK Software Solutions</h1>
	<h3 style="color: blue;">Student Details</h3>
	<table border="1">
		<tr>
			<td>Student Id:</td>
			<td>${stud.sid}</td>
		</tr>
		<tr>
			<td>Student Name:</td>
			<td>${stud.sname}</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td>${stud.saddr}</td>
		</tr>
	</table>
	<h3>
		<a href="home">Home Page</a>
	</h3>
</body>
</html>