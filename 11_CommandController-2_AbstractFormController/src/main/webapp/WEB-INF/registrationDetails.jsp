<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>GK Software Solutions</h2>
	<h3>Student Registration Details</h3>
	<table>
		<tr>
			<td>Student Id</td>
			<td>${student.sid}</td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td>${student.sname}</td>
		</tr>
		<tr>
			<td>Student Email</td>
			<td>${student.semail}</td>
		</tr>
		<tr>
			<td>Student Mobile</td>
			<td>${student.smobile}</td>
		</tr>
	</table>
</body>
</html>