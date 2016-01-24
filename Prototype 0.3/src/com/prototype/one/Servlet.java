package com.prototype.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START example]
@SuppressWarnings("serial")
public class Servlet extends HttpServlet {
	public static final String HTML_START="<html><head><title>Spotify Data</title>"
			 + "<link rel=stylesheet type=text/css href=Stylesheet.css><body>";
    public static final String HTML_END="</head></body></html>";
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    PrintWriter out = resp.getWriter();
    out.println(HTML_START + "<h1>Spotify Web API Data</h1>"+HTML_END);
    
    try {
        String artist = ("Megadeth");
        URL url = new URL("https://api.spotify.com/v1/search?q=" + artist + "&type=artist&limit=1");
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.setRequestProperty("Accept", "application/json");

	if (conn.getResponseCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(
		(conn.getInputStream())));
	
  //Displays the JSON data.
	String output;
	while ((output = br.readLine()) != null) {
    out.println(HTML_START + "<h3 style=color:blue;>"+ output +"</h3>"+HTML_END);
	}
	
	
	conn.disconnect();

} catch (MalformedURLException e) {

	e.printStackTrace();
	out.println(e.getMessage());

} catch (IOException e) {

	e.printStackTrace();
	out.println(e.getMessage());
   }

  }



}
