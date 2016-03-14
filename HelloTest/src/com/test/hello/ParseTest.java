package com.test.hello;

import java.awt.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;








/**
 * Servlet implementation class SpotifyTest
 */
public class ParseTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParseTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param out 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		URL url = new URL("https://api.spotify.com/v1/artists/0OdUWJ0sBjDrqHygGUXeCF");
		  try (InputStream is = url.openStream();
		       JsonReader rdr = Json.createReader(is)) {
		 
		      JsonObject obj = rdr.readObject();
		      JsonArray results = obj.getJsonArray("images");
		      for (JsonObject result : results.getValuesAs(JsonObject.class)) {
		          int height = (result.getInt("height"));
		          request.setAttribute("height", height);
				  request.getRequestDispatcher("/Hello.jsp").forward(request, response);
				  return;
		     }
		 }
    }
	

		             
		         
		    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
