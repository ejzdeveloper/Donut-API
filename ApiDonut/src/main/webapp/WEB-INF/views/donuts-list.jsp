<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
	ul{
		list-style-type:none;
	}
</style>
</head>
<body>
  <h1 class="text-primary">Donuts</h1>
	<ul>
		<li><c:forEach items="${donuts}" var="donuts">
						<a href="/details/${donuts.id}">${donuts.id}) ${donuts.name}</a><br><br>
				</c:forEach>
		</li>
	</ul>
</body>
</html>