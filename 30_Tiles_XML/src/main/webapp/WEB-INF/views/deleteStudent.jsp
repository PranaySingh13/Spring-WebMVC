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
<br><br>
<form:form method="POST" action="delete" commandName="student">
		<table style="margin-left: auto;margin-right: auto;" border="1">
			<tr>
				<td>Student Id:</td>
				<td><form:input path="sId" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Delete" /></td>
			</tr>
		</table>
</form:form>			
</body>
</html>