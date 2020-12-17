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
	<h3 style="color: blue;">User Registration Details</h3>
	<table border="1">
		<tr>
			<td>First Name: </td>
			<td>${user.uFirstName}</td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td>${user.uLastName}</td>
		</tr>
		<tr>
			<td>Qualification: </td>
			<td>${user.uQualification}</td>
		</tr>
		<tr>
			<td>Designation: </td>
			<td>${user.uDesignation}</td>
		</tr>
		<tr>
			<td>Email Id: </td>
			<td>${user.uEmailId}</td>
		</tr>
		<tr>
			<td>Mobile: </td>
			<td>${user.uMobile}</td>
		</tr>
	</table>
	<h3>
		<a href="welcomepage">Welcome Page</a>
	</h3>
</body>
</html>