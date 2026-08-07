//Creating a text file using BufferedOutputStream
package com.app.samples.streamsandfiles;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		//attach keyboard to DataInputream
		DataInputStream dataInputStream = new DataInputStream(System.in);
		
		//attach buffer_file to FileOutputStream in append mode
		FileOutputStream fileOutputStream = new FileOutputStream("src/com/app/samples/streamsandfiles/buffer_file.txt", true);
		
		//attach fileOutputStream to BufferedOutputStream
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);
		
		System.out.println("enter text (@ at the end): ");
		
		//read characters from dataInputStream into ch. Then write them into bufferedOutputStream
		//repeat this as long as the read character is not @
		
		ch = (char)dataInputStream.read();
		while(ch != '@') {
			bufferedOutputStream.write(ch);
			ch = (char)dataInputStream.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		dataInputStream.close();
		bufferedOutputStream.close();
		
	}

}
