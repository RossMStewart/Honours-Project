package com.spotify.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

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
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
		List<JsonObject> albumList = (List<JsonObject>)request.getAttribute("albumList");
		
		String artisthref = (String)request.getAttribute("artisthref");
		String artistname = (String)request.getAttribute("artistname");
		
		
	    URL url = new URL(""+artisthref+"/related-artists");
		
	    try (InputStream is = url.openStream();
			       JsonReader rdr = Json.createReader(is)) {
			 
			      JsonObject obj = rdr.readObject();
			      JsonArray artists = obj.getJsonArray("artists");
			      List<JsonObject> relartistList = artists.getValuesAs(JsonObject.class); 	  
			      
			      
			      
			      request.setAttribute("artistname", artistname);			      
			      request.setAttribute("albumList", albumList);
			      request.setAttribute("relartistList", relartistList);
				  request.getRequestDispatcher("/ArtistDetails.jsp").forward(request, response);
				  
			      }
	    }
			      
	    
			    
	    
	    	    			     			      			      			      			 			    
    
	  
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
