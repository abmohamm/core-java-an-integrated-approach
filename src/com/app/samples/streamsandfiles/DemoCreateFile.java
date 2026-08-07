//Creating a text file using FileOutputStream
package com.app.samples.streamsandfiles;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCreateFile {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		char ch;
		//attach keyboard to DataInputStream
		DataInputStream dataInputStream = new DataInputStream(System.in);
		
		//attach myFile to FileOutputStream
//		FileOutputStream fileOutputStream = new FileOutputStream("myfile.txt");
		
		/*below code appends the new data at the end of already existing data in myfile.txt 
		instead of replacing old data with new data	*/
		FileOutputStream fileOutputStream = new FileOutputStream("src/com/app/samples/streamsandfiles/myfile.txt", true);
		
		System.out.println("Enter text (@ at the end): ");
		
		//read characters from dataInputStream into ch. Then write them to fileOutputStream.
		//repeat this as long as the read character is not @
		ch = (char)dataInputStream.read();
		while(ch != '@') {
			fileOutputStream.write(ch);
			ch = (char)dataInputStream.read();
		}
		
		//close the file
		System.out.println("<===== closing the file =====>");
		dataInputStream.close();
		fileOutputStream.close();
	}

}
