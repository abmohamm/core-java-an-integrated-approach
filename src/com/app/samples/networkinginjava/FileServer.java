//A Server that sends a file content to the Client
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//create ServerSocket
		ServerSocket serverSocket = new ServerSocket(8888);
		
		//make the Server wait till a Client accepts connection
		Socket socket = serverSocket.accept();
		System.out.println("<===== Connection established =====>");
		
		//to accept fileName from Client
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader clientInput = new BufferedReader(inputStreamReader);
		
		//to send file contents to the Client
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
		//read the fileName from Client
		String fileName = clientInput.readLine();
		
		System.out.println("File name : " + fileName);
		
		FileReader fileReader = null;
		BufferedReader fileBufferedReader = null;
		boolean flag;
		
		//create File class object with fileName
		File file =  new File(fileName);
		
		//test if file exists or not
		if(file.exists()) {
			flag = true;
		} else {
			flag = false;
		}
		
		//if file exists, send "Yes" to Client, else send "No"
		if(flag == true) {
			dataOutputStream.writeBytes("Yes" + "\n");
		} else {
			dataOutputStream.writeBytes("No" + "\n");
		}
		
		if(flag == true) {
			
			//attach file to FileReader to read data
			fileReader = new FileReader(fileName);
			
			//attach fileReader to fileBufferedReader
			fileBufferedReader = new BufferedReader(fileReader);
			
			String str;
			
			//read from fileBufferedReader and write to DataOutputStream
			str = fileBufferedReader.readLine();
			
			System.out.println("File data : ");
			while(str != null) {
				dataOutputStream.writeBytes(str + "\n");
				System.out.println(str);
				str = fileBufferedReader.readLine();
			}
			
			fileBufferedReader.close();
			dataOutputStream.close();
			clientInput.close();
			fileReader.close();
			socket.close();
			serverSocket.close();
		}
		
	}

}
