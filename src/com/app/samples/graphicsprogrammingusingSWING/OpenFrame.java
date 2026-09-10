//this is another class which creates another frame to display file contents
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OpenFrame extends JFrame {

	//text-area to display file contens
	JTextArea textArea;
	
	//to display components that are larger than the visible screen or window area
	JScrollPane scrollPane;
	
	//container to hold components
	Container container;
	
	//bufferedReader to read from a file
	BufferedReader bufferedReader;
	
	//catch the file-name
	OpenFrame(String fileName) {
		
		//create content pane
		container = this.getContentPane();
		
		//set borderlayout to container
		container.setLayout(new BorderLayout());
		
		//create a text area with 500 rows and 500 characters per row
		textArea = new JTextArea();
		
		// Make text area read-only
        textArea.setEditable(false);
        
        scrollPane = new JScrollPane(textArea);
		
		//add to content pane
		container.add(scrollPane, BorderLayout.CENTER);
		
		//to read file line by line
		String fileLine = "";
		StringBuilder fileLines = new StringBuilder();
		
		try {
			//create bufferedReader to read from File
			bufferedReader = new BufferedReader(new FileReader(fileName));
			
			//read line by line and add to fileLines
			fileLine = bufferedReader.readLine();
			
			while(fileLine != null) {
				fileLines.append(fileLine).append("\n");
				fileLine = bufferedReader.readLine();
			}
			
			textArea.setText(fileLines.toString());
			
			//close the file
			bufferedReader.close();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
