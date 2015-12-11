/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototype.project;

/**
 *
 * @author Ross
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//import org.json.JSONObject;

public class GetArtistAlbums {


	//"https://api.spotify.com/v1/artists/0OdUWJ0sBjDrqHygGUXeCF"
	public static void main(String[] args) {
            
            
            //System.out.println(artist);

	  try {
//String artist = ("0OdUWJ0sBjDrqHygGUXeCF");
              String artistid = ("1Yox196W7bzVNZI7RBaPnf");
              URL url = new URL("https://api.spotify.com/v1/artists/" + artistid + "/albums");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("/n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

	}

}
