//Server - to send strings
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//Create a server socket with some port number
		ServerSocket serverSocket = new ServerSocket(777);
		//let the server wait till a client accepts connection
		Socket socket = serverSocket.accept();
		System.out.println("<===== Connection established =====>");
		//attach output stream to the server socket
		OutputStream outputStream = socket.getOutputStream();
		//attach print stream to send data to the socket
		PrintStream printStream = new PrintStream(outputStream);
		
		//send 2 strings to the client
//		String str = "Hello Client";
		
		// connecting input-stream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		System.out.print("Enter data to send from Server : ");
		String str = bufferedReader.readLine();
		while(str != null) {
			printStream.println(str);
			str = bufferedReader.readLine();
		}
		printStream.println("Bye");
		
		//close connection by closing streams and sockets
		System.out.println("<===== Closing connection =====>");
		printStream.close();
		socket.close();
		serverSocket.close();
	}

}
