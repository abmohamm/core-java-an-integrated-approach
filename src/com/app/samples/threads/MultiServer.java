//A server with 2 threads to contact multiple clients
package com.app.samples.threads;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer implements Runnable {

	static ServerSocket serverSocket;
	static Socket clientSocket;
	PrintStream printStream;
	
	String name = null;
	
	public void run() {

		// TODO Auto-generated method stub
		//find thread name
		name = Thread.currentThread().getName();
		for(;;) {	//server runs continuously
			try {
				System.out.println("Thread " + name + " ready to accept...");
				clientSocket = serverSocket.accept();
				System.out.println("Thread " + name + " accepted a connection");
				//for sending message
				printStream = new PrintStream(clientSocket.getOutputStream());
				printStream.println("Thread " + name + " contacted You");
				
				//close connection
				printStream.close();
				clientSocket.close();
				//do not close serverSocket
			} catch(IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		MultiServer multiServer = new MultiServer();
		
		//create server socket with 999 as port number
		serverSocket = new ServerSocket(999);
		
		//create 2 threads
		Thread t1 = new Thread(multiServer, "One");
		Thread t2 = new Thread(multiServer, "Two");
		
		//start the threads
		t1.start();
		t2.start();
	}

}
