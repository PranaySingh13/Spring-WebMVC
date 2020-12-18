<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	font-family: cursive;
	font-style: italic;
	font-weight: bolder;
	font-size: large;
}
</style>
</head>
<body>
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">User Registration Page</h3>
	<form:form method="POST" action="reg" commandName="user">
		<table>
			<tr>
				<td>User Name:</td>
				<td><form:input path="uName" /></td>
				<td><form:errors path="uName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Password:</td>
				<td><form:input path="uPassword" /></td>
				<td><form:errors path="uPassword" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Age:</td>
				<td><form:input path="uAge" /></td>
				<td><form:errors path="uAge" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Date Of Birth:</td>
				<td><form:input path="uDob" /></td>
				<td><form:errors path="uDob" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Email Id:</td>
				<td><form:input path="uEmailId" /></td>
				<td><form:errors path="uEmailId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>User Mobile:</td>
				<td><form:input path="uMobile" /></td>
				<td><form:errors path="uMobile" cssClass="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registration"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>