package com.prototype.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START example]
@SuppressWarnings("serial")
public class Servlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    PrintWriter out = resp.getWriter();
    out.println("Hello, world!!!");
    
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
		out.println(output);
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
