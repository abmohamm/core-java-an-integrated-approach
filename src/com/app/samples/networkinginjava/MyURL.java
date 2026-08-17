//URL - retrieve different parts of URL supplied
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class MyURL {

	public static void main(String[] args) throws URISyntaxException {
		
		// TODO Auto-generated method stub
		String urlLink = null;
		URI uri = null;
		URL url = null;
		//accept URL of web-site from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		try {
			System.out.print("enter URL : ");
			urlLink = bufferedReader.readLine();
			uri = new URI(urlLink);
			url = uri.toURL();
			System.out.println("URL entered : " + urlLink);
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("File : " + url.getFile());
			System.out.println("Port : " + url.getPort());
			System.out.println("Path : " + url.getPath());
			System.out.println("Extenal form : " + url.toExternalForm());
		} catch (IOException exception) {
			// TODO Auto-generated catch block
			//recommended to use loggers instead of exposing exceptions stack trace
			exception.printStackTrace();
		}
		
		
		
		
		
	}

}
