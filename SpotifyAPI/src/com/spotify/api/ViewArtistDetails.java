package com.spotify.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

import com.spotify.api.GetArtistDetails;

/**
 * Servlet implementation class GetRelatedArtists
 */
public class ViewArtistDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewArtistDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		JsonString albumname = (JsonString)request.getAttribute("albumname");
		
		String artistid = (String)request.getAttribute("artistid");
		String artistname = (String)request.getAttribute("artistname");
		
	    URL url = new URL(""+artistid+"/related-artists");
		
	    try (InputStream is = url.openStream();
			       JsonReader rdr = Json.createReader(is)) {
			 
			      JsonObject obj = rdr.readObject();
			      JsonArray artists = obj.getJsonArray("artists");
			      for (JsonObject result : artists.getValuesAs(JsonObject.class)) {	  
			      JsonString relartname = (result.getJsonString("name")); 
			      JsonString relartistid = (result.getJsonString("href"));
			      
			      request.setAttribute("relartistid", relartistid);
			      request.setAttribute("artistname", artistname);
			      request.setAttribute("albumname", albumname);
			      request.setAttribute("relartname", relartname);
				  request.getRequestDispatcher("/ArtistDetails.jsp").forward(request, response);
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
