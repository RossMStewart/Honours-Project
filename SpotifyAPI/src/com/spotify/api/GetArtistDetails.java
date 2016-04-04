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

/**
 * Servlet implementation class GetArtistDetails
 */
public class GetArtistDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetArtistDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String getartistid = request.getParameter("param3");
	    //String encodeartistname = (java.net.URLEncoder.encode(getartistname));
	    
	    URL url = new URL("https://api.spotify.com/v1/artists/"+ getartistid +"/albums?market=GB");
		
	    
	    try (InputStream is = url.openStream();
			       JsonReader rdr = Json.createReader(is)) {
			 
			      JsonObject obj = rdr.readObject();
			     
			      JsonArray items = obj.getJsonArray("items");			      
			      List<JsonObject> albumList = items.getValuesAs(JsonObject.class);
			      
			      
			      String artistname = request.getParameter("param1");
			      String artisthref = request.getParameter("param2");
			      String artistid = request.getParameter("param3");
			      
			     
			      request.setAttribute("albumList", albumList);	
			      request.setAttribute("artistname", artistname);
			  	  request.setAttribute("artistid", artistid);	    	   			       			      			
			      request.setAttribute("artisthref", artisthref);
				  request.getRequestDispatcher("/ViewArtistDetails").forward(request, response);
				 
			    
	    }
		
		
	  }
	    
	    
	    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
