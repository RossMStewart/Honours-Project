<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
<link rel="stylesheet" type="text/css" href="Stylesheet.css">
</head>
<body>
<!-- Search Again link directs the user back to the Search page. -->
<p><a id="search_again" href="Search.jsp">Search Again</a></p>
<!-- Artist name -->
<h1>${artistname} </h1>
<div id="albumlistheader">
<!-- Artist albums section -->
<h1 id=albumheader>Albums</h1>
</div>

<div class="center">
<!-- Displays the album covers in rows of three -->
<c:forEach var="albumlist" items="${albumList}" end="2">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="3" end="5">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="6" end="8">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="9" end="11">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="12" end="14">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="15" end="17">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

<c:forEach var="albumlist" items="${albumList}" begin="18" end="19">
<c:forEach var="image" items="${albumlist.images}" end="0">
<ul id="albums">
<div class="img-with-text">
<li><a href="AlbumDetails?method=doGet&param1=${albumlist.id}&param2=${albumlist.name}&param3=${image.url}"><img src="${image.url}" width="300" height="300"></a></li>
<li>${albumlist.name}</li>
</div>
</ul>
</c:forEach>
</c:forEach>

<br>
<br>

</div>

<!-- Related artists section -->
<h1 id="relatedheader">Related Artists</h1>

<div class="center">
<!-- Displays related artist names in rows of three -->
<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" end="2">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="3" end="5">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="6" end="8">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="9" end="11">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="12" end="14">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="15" end="17">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

<ul id="artistresults">
<c:forEach var="relartist" items="${relartistList}" begin="18" end="19">
<li><a href="GetArtistDetails?method=doGet&param1=${relartist.name}&param2=${relartist.id}">${relartist.name} </a></li>
</c:forEach>
</ul>

<br>
<br>

</div>
<!-- Search Again link directs the user back to the Search page. -->
<p id="search_again"><a href="Search.jsp">Search Again</a></p>

</body>
</html>