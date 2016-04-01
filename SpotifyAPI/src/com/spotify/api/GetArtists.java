package com.spotify.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
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
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String getartist = request.getParameter("artist");
		String artist = (java.net.URLEncoder.encode(getartist));
		URL url = new URL("https://api.spotify.com/v1/search?q="+ artist +"&type=artist");
		  try (InputStream is = url.openStream();
		       JsonReader rdr = Json.createReader(is)) {
		 
		      JsonObject jsonObj = rdr.readObject();
		      
		      JsonObject artists = jsonObj.getJsonObject("artists");
		      JsonArray items = artists.getJsonArray("items");
		      List<JsonObject> artistList = items.getValuesAs(JsonObject.class); 
		    	 		    	  		        		              		    	  
		    	  
		    	  	     	       		      		      		      		    
		     request.setAttribute("artistList", artistList);		   		    
			 request.getRequestDispatcher("/Artists.jsp").forward(request, response);
			   
		  	}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
