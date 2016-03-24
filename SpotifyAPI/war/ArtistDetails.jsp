<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<p>Artist Name: ${artistname} </p>
<p>Album Name: ${albumname} </p> <br>
<p>Related Artist: <a href="GetRelatedArtistDetails?method=doGet&param1=${relartname}&param2=${relartistid}">${relartname} </a></p>
<a href="Search.jsp">Search Again</a>
</body>
</html>