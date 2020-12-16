<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>GK Software Solutions</h2>
	<h3>User Registration Page</h3>
	<form action="reg" method="POST">
		<table>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student Email</td>
				<td><input type="text" name="semail"></td>
			</tr>
			<tr>
				<td>Student Mobile</td>
				<td><input type="text" name="smobile"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registration"></td>
			</tr>
		</table>
	</form>
</body>
</html>