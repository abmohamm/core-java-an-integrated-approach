//Client that sends data to Server and receives data from Server
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TwowayClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// TODO Auto-generated method stub
		//create client socket
		Socket clientSocket = new Socket("192.168.0.119", 888);
		
		//to send data to the Server
		OutputStream outputStream = clientSocket.getOutputStream();
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		
		//to receieve data coming from Server
		InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//to read data from the keyboard
		InputStreamReader keyboardStreamReader = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(keyboardStreamReader);
		
		String keyboardInput, serverInput;
		keyboardInput = keyboard.readLine();
		while(!(keyboardInput = keyboard.readLine()).equals("exit")) {
			dataOutputStream.writeBytes(keyboardInput + "\n");	//send to Server
			serverInput = bufferedReader.readLine();	//receive from Server
			System.out.println(serverInput);	
		}
		
		//close the connection
		dataOutputStream.close();
		bufferedReader.close();
		keyboard.close();
		clientSocket.close();
	}

}
