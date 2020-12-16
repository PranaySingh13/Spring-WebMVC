<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-left: auto;margin-right: auto;">
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">User Registration Form</h3>
	<form:form method="POST" action="reg" commandName="user">
		<table style="background-color: yellow;">
			<tr>
				<td>User Name: </td>
				<td><form:input path="uName" size="20" value="User Name"/></td>
			</tr>
			<tr>
				<td>Password: </td>
				<td>
					<form:password path="uPassword" value="abc123" showPassword="false" />
				</td>
			</tr>
			<tr>
				<td>Are You Married: </td>
				<td>
					<form:checkbox path="maritalStatus1" />
				</td>
			</tr>
			<tr>
				<td>Are You Single: </td>
				<td>
					<form:checkbox path="maritalStatus2" value="Single" />
				</td>
			</tr>
			<tr>
				<td>User Qualifications: </td>
				<td>
					<form:checkboxes path="uQualifications" items="${qual_List}" />
				</td>
			</tr>
			<tr>
				<td>User Gender: </td>
				<td>
					<form:radiobutton path="uGender" value="Male" />Male
					<form:radiobutton path="uGender" value="Female" />Female
				</td>
			</tr>
			<tr>
				<td>User Work Location: </td>
				<td>
					<form:radiobuttons path="uWorkLocation" items="${uWorkLocation_List}"/>
				</td>
			</tr>
			<tr>
				<td>User Skill Set: </td>
				<td>
					<form:select path="uSkillSet" multiple="true">
						<form:option value="C">C</form:option>
						<form:option value="Java">Java</form:option>
						<form:option value="Python">Python</form:option>
						<form:option value="Oracle">Oracle</form:option>
						<form:option value="AWS">AWS</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>User Hobbies: </td>
				<td>
					<form:select path="uHobbies" items="${uHobbies}" multiple="true"/>
				</td>
			</tr>
			<tr>
				<td>User Profession: </td>
				<td>
					<form:select path="uProfession" multiple="false">
						<form:options items="${uProfession}"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>User Address: </td>
				<td>
					<form:textarea path="uAddress"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registration"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>