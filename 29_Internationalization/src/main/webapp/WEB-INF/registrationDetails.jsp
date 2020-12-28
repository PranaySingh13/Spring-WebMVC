<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
		<spring:message code="title3" />
	</h3>
	<table border="1">
		<tr>
			<td><spring:message code="uname" /></td>
			<td>${user.uName}</td>
		</tr>
		<tr>
			<td><spring:message code="upwd" /></td>
			<td>${user.uPwd}</td>
		</tr>
		<tr>
			<td><spring:message code="uemail" /></td>
			<td>${user.uEmail}</td>
		</tr>
		<tr>
			<td><spring:message code="umobile" /></td>
			<td>${user.uMobile}</td>
		</tr>
	</table>
</body>
</html>