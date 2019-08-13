<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>

</head>
<body>
	<div class="container">
		<h1 class="text-primary">Donuts</h1>
		
			<h3>Name: </h3>${name.name}
			<h3>Calories: </h3>${calories.calories}
			<h3>Extras: </h3><c:forEach items="${extras}" var="extras">
						${extras.extras} |
				</c:forEach>
				
				<br><br>
				<a href="/">Home</a>
</body>
</html>