<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<link rel="stylesheet" type="text/css" href="Stylesheet.css">
</head>
<body>
<form action="/GetArtists" method="GET">
<fieldset id="input_data">
<legend>Search for Artist</legend>   
    <input type="text" name="artist" value="Enter Artist Name" required>
    <br>
    <br>
    <input type="submit" value="Submit" />
</fieldset>
</form>
</body>
</html>