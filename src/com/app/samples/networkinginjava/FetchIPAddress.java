//Knowing IPAddress of a website
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FetchIPAddress {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String website = null;
		InetAddress ipAddress = null;
		//accept name of web-site from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		try {
			System.out.print("enter a web-site name : ");
			website = bufferedReader.readLine();
			//getByName() method accepts web-site name and returns it's IPAddress
			ipAddress = InetAddress.getByName(website);
			System.out.print("IPAddress is : " + ipAddress);			
		} catch (IOException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
	}

}
