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
<br><br><br>
	<h1 style="color: red;">GK Software Solutions</h1>
	<h3 style="color: blue;">Student Edit Form</h3>
	<form method="post" action="update">
		<table>
			<tr>
				<td>Student Id:</td>
				<td>${stud.sid} <input type="hidden" name="sid" value="${stud.sid}"></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" name="sname" value="${stud.sname}"></td>
			</tr>
			<tr>
				<td>Student Address:</td>
				<td><input type="text" name="saddr" value="${stud.saddr}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>