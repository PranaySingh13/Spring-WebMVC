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
	<form:form method="POST" action="add" commandName="student">
		<table style="margin-left: auto;margin-right: auto;" border="1">
			<tr>
				<td>Student Id:</td>
				<td><form:input path="sId" /></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><form:input path="sName" /></td>
			</tr>
			<tr>
				<td>Student Address:</td>
				<td><form:input path="sAddress" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>