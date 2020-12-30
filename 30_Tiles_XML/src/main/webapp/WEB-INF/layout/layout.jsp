<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 100%; height: 650px;">
		<tr height="20%">
			<td colspan="2" align="center" bgcolor="maroon">
				<tiles:insertAttribute name="header" />
			</td>
		</tr>
		<tr height="60%">
			<td width="20%" bgcolor="lightyellow">
				<tiles:insertAttribute name="menu" />
			</td>
			<td width="80%" bgcolor="lightblue">
				<tiles:insertAttribute name="body" />
			</td>
		</tr>
		<tr height="20%">
			<td colspan="2" align="center" bgcolor="orange">
				<tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>
</body>
</html>