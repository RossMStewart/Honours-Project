<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
<link rel="stylesheet" type="text/css" href="Stylesheet.css">
</head>
<body>
<p><a id="search_again" href="Search.jsp">Search Again</a></p>
<h2>Please click on an artist name below.</h2>
<div class="center">

<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" end="2">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>

<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="3" end="5">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>

<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="6" end="8">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.href}&param3=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>

<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="9" end="11">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.href}&param3=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>

<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="12" end="14">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.href}&param3=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>
<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="15" end="17">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.href}&param3=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>
<ul id="artistresults">
<c:forEach var="artistlist" items="${artistList}" begin="18" end="19">
<li><a href="GetArtistDetails?method=doGet&param1=${artistlist.name}&param2=${artistlist.href}&param3=${artistlist.id}"> ${artistlist.name} </a></li>
</c:forEach>
</ul>
<br>
</div>
</body>
</html>