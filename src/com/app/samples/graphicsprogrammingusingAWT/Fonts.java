//Knowing the available fonts
package com.app.samples.graphicsprogrammingusingAWT;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Locale;

public class Fonts {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//get the local graphics environment information into GraphicsEnvironment object
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//from environment, get available font family names into fonts[]
		String availableFonts[] = environment.getAvailableFontFamilyNames();
		
		System.out.println("Available fonts on this system are : " + Locale.getDefault() + "\n");
		
		//retrieve one by one the font names from fonts[] and display
		for(int i = 0; i < availableFonts.length; i++) {
			System.out.println(availableFonts[i]);
			if(i != availableFonts.length - 1) {
				System.out.println("<=================>");
			}
		}
		
		
	}

}
