<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies</title>
</head>
<body>
	<h1>Movies:</h1>
	<table>
		<thead>
			<tr>
				<th>Movie ID</th>
				<th>Movie Name</th>
				<th>Movie Rating</th>
				<th>Movie Review</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="m">
				<tr>
					<td>${m.id}</td>
					<td>${m.name}</td>
					<td>${m.rating}</td>
					<td>${m.review}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>