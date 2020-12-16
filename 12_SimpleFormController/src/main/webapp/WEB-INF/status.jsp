<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-left: auto;margin-right: auto;">
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">User Registration Status</h3>
<table border="1" style="background-color: yellow;">
	<tr>
		<td>User Name: </td>
		<td>${user.uName}</td>
	</tr>
	<tr>
		<td>User Password: </td>
		<td>${user.uPassword}</td>
	</tr>
	<tr>
		<td>Are You Married: </td>
		<td>${user.maritalStatus1}</td>
	</tr>
	<tr>
		<td>Are You Single: </td>
		<td>${user.maritalStatus2}</td>
	</tr>
	<tr>
		<td>User Qualifications: </td>
		<td>
			<c:forEach var="qual" items="${user.uQualifications}">
				<c:out value="${qual}"/><br>
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td>User Gender: </td>
		<td>${user.uGender}</td>
	</tr>
	<tr>
		<td>User Work Location: </td>
		<td>${user.uWorkLocation}</td>
	</tr>
	<tr>
		<td>User Skill Set: </td>
		<td>
			<c:forEach var="skill" items="${user.uSkillSet}">
				<c:out value="${skill}"/><br>
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td>User Hobbies: </td>
		<td>
			<c:forEach var="hobbies" items="${user.uHobbies}">
				<c:out value="${hobbies}"/><br>
			</c:forEach>
		</td>
	</tr>
	<tr>
		<td>User Profession: </td>
		<td>${user.uProfession}</td>
	</tr>
	<tr>
		<td>User Address: </td>
		<td>${user.uAddress}</td>
	</tr>
</table>
<h3>
	<a href="reg">User Registration Form</a>	
</h3>
</body>
</html>