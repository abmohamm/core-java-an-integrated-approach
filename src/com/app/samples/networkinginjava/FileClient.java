//FileClient - receiving a file content
package com.app.samples.networkinginjava;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// TODO Auto-generated method stub
		//Create Client socket
		Socket clientSocket = new Socket("192.168.0.119", 8888);
		
		//to accept fileName from keyboard
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println("enter file name : ");
		//fileName - src/com/app/samples/streamsandfiles/buffer_file.txt
		//fileName - src/com/app/samples/streamsandfiles/filewritertest.txt
		//fileName - src/com/app/samples/streamsandfiles/myfile.txt
		//fileName - src/com/app/samples/streamsandfiles/strings_into_file.txt
		String fileName = bufferedReader.readLine();
		
		//send fileName to the Server using DataOutputStream
		OutputStream outputStream = clientSocket.getOutputStream();
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		dataOutputStream.writeBytes(fileName + "\n");
		
		//to read data coming from the Server
		InputStreamReader serverOutputStreamReader = new InputStreamReader(clientSocket.getInputStream());
		BufferedReader serverOutputReader = new BufferedReader(serverOutputStreamReader);
		
		String str;
		
		//read first line from Server into str
		str = serverOutputReader.readLine();
		
		if(str.equals("Yes")) {
			//read and display  file contents coming from Server
			while(str != null) {
				str = serverOutputReader.readLine();
				System.out.println(str);
			}
			
			//close connection by closing the streams
			bufferedReader.close();
			dataOutputStream.close();
			serverOutputReader.close();
			clientSocket.close();
		} else {
			System.out.println("File not found!!!");
		}
	}

}
