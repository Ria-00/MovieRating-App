<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Welcome to PVRLite</h1>

	<%-- 	<form>
		<button class="button button2" formaction="addj.html">Add</button>
		<button class="button button2" formaction="updj.html">Update</button>
		<button class="button button2" formaction="delj.html">Delete</button>
		<button class="button button2" formaction="viewj.html">View</button>
	</form> --%>

	<a href="/MovieApp/movie/insert"><button>Add</button></a>
	<a href="/MovieApp/movie/delete"><button>Delete</button></a>
	<a href="/MovieApp/movie/update"><button>Update</button></a>
	<a href="/MovieApp/movie/view"><button>Display</button></a>




</body>
</html>
