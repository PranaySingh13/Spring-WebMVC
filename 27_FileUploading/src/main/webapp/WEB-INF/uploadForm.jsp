<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">File Upload Form</h2>
	<form action="upload" method="POST" enctype="multipart/form-data">
		<table>
			<tr>
				<td>File 1</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td>File 2</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td>File 3</td>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Upload"></td>
			</tr>
		</table>
	</form>
</body>
</html>