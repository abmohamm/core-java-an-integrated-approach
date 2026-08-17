//connecting to a web-site and getting the details
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class DemoURLConnection {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		// TODO Auto-generated method stub
		String urlLink = null;
		InputStream inputStream = null;
		//accept URL of web-site from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.print("enter web-site URL : ");
		urlLink = bufferedReader.readLine();
		//pass the site urlLink to URI object and then prepare URL object
		URI uri = new URI(urlLink);
		URL url = uri.toURL();
		//open a connection with site on Internet
		URLConnection urlConnection = url.openConnection();
		//display the date
		System.out.println("Date : " + new Date(urlConnection.getDate()));
		//display the content type whether text or html
		System.out.println("Content-type : " + urlConnection.getContentType());
		//display the expiry date
		System.out.println("Expiry : " + urlConnection.getExpiration());
		//display last modified date
		System.out.println("Last modified : " + new Date(urlConnection.getLastModified()));
		//display how many bytes the index.html page has
		int size = urlConnection.getContentLength();
		System.out.println("Length of content : " + size);
		if(size == 0) {
			System.out.println("Content not available");
			return;
		} else {
			int ch;
			inputStream = urlConnection.getInputStream();
			//display the content of the index.html page
			ch = inputStream.read();
			while(ch != -1) {
				System.out.print((char)ch);
				ch = inputStream.read();
			}
		}
	}

}
