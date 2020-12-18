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
			<td>User Name:</td>
			<td>${user.uName}</td>
		</tr>
		<tr>
			<td>User Password:</td>
			<td>${user.uPassword}</td>
		</tr>
		<tr>
			<td>User Age:</td>
			<td>${user.uAge}</td>
		</tr>
		<tr>
			<td>User Date Of Birth:</td>
			<td>${user.uDob}</td>
		</tr>
		<tr>
			<td>User Email Id:</td>
			<td>${user.uEmailId}</td>
		</tr>
		<tr>
			<td>User Mobile:</td>
			<td>${user.uMobile}</td>
		</tr>
	</table>
</body>
</html>