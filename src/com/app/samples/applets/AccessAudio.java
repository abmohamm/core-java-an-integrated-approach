//An applet to play sound files
package com.app.samples.applets;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccessAudio extends Applet implements ActionListener {

	//label
	Label label;
	
	//text-field
	TextField inputFile;
	
	//buttons to play/stop audio file
	Button play, stop, clickedButton;
	
	//audio clip to load from memory
	AudioClip audioClip;
	
	//file-name
	String fileName;
	
	public void init() {
		
		//create a label
		label = new Label("Enter .au or .wav filename : ", Label.RIGHT);
		
		//a text-field to receive the filename - src/com/app/samples/applets/file_example_WAV_1MG.wav
		inputFile = new TextField(15);
		
		//two buttons to play and stop
		play = new Button("play");
		stop = new Button("stop");
		
		//add the components to applet frame
		add(label);
		add(inputFile);
		add(play);
		add(stop);
		
		//add action listeners to buttons
		play.addActionListener(this);
		stop.addActionListener(this);
	}

	//method is called when a button is clicked
	public void actionPerformed(ActionEvent actionEvent) {
		
		// TODO Auto-generated method stub
		//get the filename from text-field
		fileName = inputFile.getText();
		
		//remove any spaces from fileName
		fileName = fileName.trim();
		
		//pass the fileName to AudioClip object
		audioClip = getAudioClip(getDocumentBase(), fileName);
		
		//know which button is clicked
		clickedButton = (Button)actionEvent.getSource();
		
		//if play is clicked then play else stop
		if(clickedButton == play) {
			audioClip.play();
		} else {
			audioClip.stop();
		}
	}

}
