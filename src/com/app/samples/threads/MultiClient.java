//A client that receives the  messages from the server - MultiServer
package com.app.samples.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiClient {

	static Socket clientSocket;
	static InputStreamReader inputStreamReader;
	static BufferedReader bufferedReader;
	static String dataFromServer;
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// TODO Auto-generated method stub
		//create Client socket with port number - 999
		clientSocket = new Socket("192.168.0.119", 999);
		
		//to accept data from server
		inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
		bufferedReader = new BufferedReader(inputStreamReader);
		
		//receive data as long as server does not close client socket
		dataFromServer = bufferedReader.readLine();
		while(dataFromServer != null) {
			System.out.println(dataFromServer);
			dataFromServer = bufferedReader.readLine();
		}
		
		//close the connection
		bufferedReader.close();
		clientSocket.close();
		
	}

}
