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
	<h3 style="color: blue;">User Registration Page</h3>
	<form:form method="POST" commandName="user">
		<table>
			<tr>
				<td>Email Id: </td>
				<td><form:input type="text" path="uEmailId"/></td>
			</tr>
			<tr>
				<td>Mobile: </td>
				<td><form:input type="text" path="uMobile"/></td>
			</tr>
			<tr>
			<!-- 
				a) _finish: Finish the wizard form.
				b) _cancel: Cancel the wizard form.
				c) _targetx: Move to the target page, where x is the zero-based page index.
			 -->
				<td colspan="2">
					<input type="submit" name="_target1" value="Previous">
					<input type="submit" name="_finish" value="Finish">
					<input type="submit" name="_cancel" value="Cancel">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>