<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">
		<spring:message code="title1" />
	</h2>
	<h3 style="color: blue;">
		<spring:message code="title2" />
	</h3>
	<form:form method="POST" action="reg" commandName="user">
		<table border="1">
			<tr>
			<!-- code is key in properties file and path is command class attribute -->
				<td><spring:message code="uname" /></td>
				<td><form:input path="uName" /></td>
			</tr>
			<tr>
				<td><spring:message code="upwd" /></td>
				<td><form:input path="uPwd" /></td>
			</tr>
			<tr>
				<td><spring:message code="uemail" /></td>
				<td><form:input path="uEmail" /></td>
			</tr>
			<tr>
				<td><spring:message code="umobile" /></td>
				<td><form:input path="uMobile" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registration" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>