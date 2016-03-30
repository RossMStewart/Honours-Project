<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<c:forEach var="artist" items="${artistList}">
<p><a href="GetArtistDetails?method=doGet&param1=${artist.name}&param2=${artist.href}"> ${artist.name} </a></p>
</c:forEach>
<br>
<a href="Search.jsp">Search Again</a>
</body>
</html>