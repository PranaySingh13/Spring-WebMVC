<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><br><br>
	<h1 style="color: red;">GK Software Solutions</h1>
	<h3 style="color: blue;">Student Add Form</h3>
	<form method="post" action="add">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student Address:</td>
				<td><input type="text" name="saddr"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add"></td>
			</tr>
		</table>
	</form>
</body>
</html>