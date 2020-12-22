<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">GK Software Solutions</h2>
	<h3 style="color: blue;">User Hello Form</h3>
	<form action="hello" method="POST">
		<table border="2">
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="uName"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Say Hello"></td>
			</tr>
		</table>
	</form>
</body>
</html>