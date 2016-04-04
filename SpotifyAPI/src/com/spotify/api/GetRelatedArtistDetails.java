package com.spotify.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

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
 * Servlet implementation class GetRelatedArtistDetails
 */
public class GetRelatedArtistDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetRelatedArtistDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String getrelartistname = request.getParameter("param1");
	    String encoderelartistname = (java.net.URLEncoder.encode(getrelartistname));
	    String getrelartistid = request.getParameter("param3");
	    URL url = new URL("https://api.spotify.com/v1/artists/"+ getrelartistid +"/albums?market=GB" );
		//out.print(artdetails);
	    
	    try (InputStream is = url.openStream();
			       JsonReader rdr = Json.createReader(is)) {
			 
			      JsonObject obj = rdr.readObject();
			      //JsonObject artists = obj.getJsonObject("albums");
			      JsonArray items = obj.getJsonArray("items");
			      for (JsonObject result : items.getValuesAs(JsonObject.class)) {	  
			      JsonString albumname = (result.getJsonString("name")); 
			      
			      String artistname = request.getParameter("param1");
			     
			  	  request.setAttribute("artistname", artistname);	    	   			       			      			
			      request.setAttribute("albumname", albumname);
			      request.setAttribute("artistid", getrelartistid);
				  request.getRequestDispatcher("/GetArtistDetails").forward(request, response);
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
