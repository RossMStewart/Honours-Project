<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href="Search.jsp">Search Again</a>
<p>Artist Name: ${artistname} </p>
<c:forEach var="albumlist" items="${albumList}">
<c:forEach var="image" items="${albumlist.images}" end="0">
<p>Album Name: ${albumlist.name}</p>
<p><img src="${image.url}" width="300" height="300"></p><br/>
</c:forEach>
</c:forEach>
<c:forEach var="relartist" items="${relartistList}">
<p>Related Artist: <a href="GetRelatedArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.href}">${relartist.name} </a></p>
</c:forEach>
<a href="Search.jsp">Search Again</a>
</body>
</html>