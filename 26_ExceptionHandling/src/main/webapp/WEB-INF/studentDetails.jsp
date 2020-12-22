<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">Student Registration Details</h3>
	<table border="2">
		<tr>
			<td>Student Id:</td>
			<td>${student.sid}</td>
		</tr>
		<tr>
			<td>Student Name:</td>
			<td>${student.sname}</td>
		</tr>
		<tr>
			<td>Student Marks:</td>
			<td>${student.smarks}</td>
		</tr>
		<tr>
			<td>Student Email Id:</td>
			<td>${student.semail}</td>
		</tr>
		<tr>
			<td>Student Mobile No:</td>
			<td>${student.smobile}></td>
		</tr>
	</table>
</body>
</html>