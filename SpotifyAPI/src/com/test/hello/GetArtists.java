package com.test.hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetArtistDetails
 */
public class GetArtists extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetArtists() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		String getartist = request.getParameter("artist");
		String artist = (java.net.URLEncoder.encode(getartist));
		URL url = new URL("https://api.spotify.com/v1/search?q="+ artist +"&type=artist");
		  try (InputStream is = url.openStream();
		       JsonReader rdr = Json.createReader(is)) {
		 
		      JsonObject obj = rdr.readObject();
		      JsonObject artists = obj.getJsonObject("artists");
		      JsonArray items = artists.getJsonArray("items");
		      for (JsonObject result : items.getValuesAs(JsonObject.class)) {	  
		      JsonString name = result.getJsonString("name");
		      int popularity = result.getInt("popularity");
		      
		      request.setAttribute("name", name);
		      request.setAttribute("popularity", popularity);
			  request.getRequestDispatcher("/Artists.jsp").forward(request, response);
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
