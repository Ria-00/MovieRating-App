<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Movie</title>
</head>
<body>
<h1>New Movie</h1>
<br>
<br>
<form:form action="insert-process" method="post" modelAttribute="movie">
<label for="id"> Movie Id:</label>
		<form:input type="text" path="id" />
		<br>
		<br>
		<label for="name">Name:</label>
		<form:input type="text" path="name" />
		<br>
		<br>
		<label for="rating">Rate:</label>
		<form:select path="rating"> <form:options items='${movie.rateOptions}'/></form:select>
		<br>
		<br>
		<label>Review:</label>
		<br>
		<form:textarea path="review" rows="5" cols="30" />
		<br>
		<br>
		<input type="submit" value="Submit">
</form:form>

</body>
</html>