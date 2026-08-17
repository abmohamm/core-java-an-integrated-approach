//Server - to send text information from File
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoFileServer {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//var
		int ch;		
		FileReader fileReader = null;
		//Create a server socket with some port number
		ServerSocket serverSocket = new ServerSocket(777);
		//let the server wait till a client accepts connection
		Socket socket = serverSocket.accept();
		System.out.println("<===== Connection established =====>");
		//attach output stream to the server socket
		OutputStream outputStream = socket.getOutputStream();
		//attach print stream to send data to the socket
		PrintStream printStream = new PrintStream(outputStream);
	
		// connecting input-stream to a keyboard
		InputStreamReader streamReader = new InputStreamReader(System.in);
		//	To accept data from the keyboard
		BufferedReader bufferedReader = new BufferedReader(streamReader);
		
		System.out.print("Enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/filewritertest.txt
		String fileName = bufferedReader.readLine();
		
		//check if file exists or not
		try {
			fileReader = new FileReader(fileName);
			//To improve speed of execution
			//bufferedReader = new BufferedReader(fileReader);
		} catch(FileNotFoundException fileNotFoundException) {
			System.out.println("File not found!!!");
			return;
		}
		
		System.out.println(fileName + " contents to send from Server : ");
		
		//read from fileReader till the end of file
		ch = fileReader.read();
		while(ch != -1) {
			printStream.print((char)ch);
			ch = fileReader.read();
		}
		printStream.println("\n");
		printStream.println("Bye");
		
		//close connection by closing streams and sockets
		System.out.println("<===== Closing connection =====>");
		printStream.close();
		socket.close();
		serverSocket.close();
		fileReader.close();	}

}