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
 * Servlet implementation class AlbumDetails
 */
public class AlbumDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlbumDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String getalbumid = request.getParameter("param1");
		
		URL url = new URL("https://api.spotify.com/v1/albums/"+getalbumid+"/tracks");
		
		try (InputStream is = url.openStream();
                JsonReader rdr = Json.createReader(is)) {
           
               JsonObject obj = rdr.readObject();
               
               JsonArray items = obj.getJsonArray("items");                
               List<JsonObject> trackList = items.getValuesAs(JsonObject.class);
               
               String albumname = request.getParameter("param2");                
               String albumimage = request.getParameter("param3");
                
               
               request.setAttribute("trackList", trackList); 
               request.setAttribute("albumname", albumname);
               request.setAttribute("albumimage", albumimage);                                                                       
               request.getRequestDispatcher("/AlbumDetails.jsp").forward(request, response);
               
              
     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
