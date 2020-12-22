<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">Student Registration Form</h3>
	<form:form method="POST" action="reg" commandName="student">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><form:input path="sid" /></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><form:input path="sname" /></td>
			</tr>
			<tr>
				<td>Student Marks:</td>
				<td><form:input path="smarks" /></td>
			</tr>
			<tr>
				<td>Student Email Id:</td>
				<td><form:input path="semail" /></td>
			</tr>
			<tr>
				<td>Student Mobile No:</td>
				<td><form:input path="smobile" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registration" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>