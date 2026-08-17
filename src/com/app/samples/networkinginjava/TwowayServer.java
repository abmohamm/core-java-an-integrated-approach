//Server that receives data from Client and sends data to Client
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TwowayServer {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//Create server socket
		ServerSocket serverSocket = new ServerSocket(888);
		//connect it to client socket
		Socket socket = serverSocket.accept();
		
		System.out.println("<===== Connection established =====>");
		
		//attach output stream to the server socket
		OutputStream outputStream = socket.getOutputStream();
		//attach print stream to send data to the socket at client
		PrintStream printStream = new PrintStream(outputStream);
		
		//to receive data coming from the client
		InputStream inputStream = socket.getInputStream();
		//To read data from the client
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		//to read data from the keyboard
		InputStreamReader keyboardStreamReader = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(keyboardStreamReader);
		
		System.out.println("Enter data to send from Server : ");
		String keyboardInput, clientInput;
		while(true) {	//server executes continuously
			//repeat as long as client does not send null string
			while((clientInput = bufferedReader.readLine()) != null) {
				System.out.println(clientInput);
				keyboardInput = keyboard.readLine();
				printStream.println(keyboardInput);	//send to client
			}
			//close the connection
			printStream.close();
			bufferedReader.close();
			keyboard.close();
			serverSocket.close();
			socket.close();
			System.exit(0);	//terminate application
		}
	}

}
