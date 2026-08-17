//Client - to receive strings
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DemoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// TODO Auto-generated method stub
		//create client socket with same port number
		Socket clientSocket = new Socket("192.168.0.119", 777);
		//to read data coming from server, attach InputStream to the socket
		InputStream inputStream = clientSocket.getInputStream();
		//to read data from clientSocket into client, use BufferedReader
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		//receive strings
		String stringFromServer;
		System.out.println("From Server : ");
		stringFromServer = bufferedReader.readLine();
		while(stringFromServer != null) {
			System.out.println(stringFromServer);
			stringFromServer = bufferedReader.readLine();
		}
		
		//close connection by closing the streams and sockets
		bufferedReader.close();
		clientSocket.close();		
	}

}
