<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Album Details</title>
<link rel="stylesheet" type="text/css" href="Stylesheet.css">
</head>
<body>
<!--  Go Back link allows the user to go back to the previous page -->
<script> document.write('<a id="go_back" href="' + document.referrer + '">Go Back</a>'); </script>
<div class="center">
<h1>${albumname}</h1>
<img src="${albumimage}" width="300" height="300" align="middle">
</div>
<!-- Album tracks section -->
<div id="albumlistheader">
<h1 id=albumheader>Tracks</h1>
</div>

<div class="center">
<!-- Displays a list of tracks from the selected album -->
<c:forEach var="tracklist" items="${trackList}">
<p>${tracklist.track_number}: ${tracklist.name}</p>
</c:forEach>



</div>

</body>
</html>