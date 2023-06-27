<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Movie</title>
</head>
<body>

<h1>Delete Movie</h1>
<br>
<br>
<form:form action="delete-process" method="post" modelAttribute="movie">
<label for="id"> Movie Id:</label>
		<form:input type="text" path="id" />
		<br>
		<br>
		<input type="submit" value="Submit">
</form:form>

</body>
</html>