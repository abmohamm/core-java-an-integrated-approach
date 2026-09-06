//Understanding the borders
/*
 * BevelBorder
 * EtchedBorder
 * LineBorder
 * MatteBorder
 * CompoundBorder
 * EmptyBorder
 */
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class BorderDemo extends JFrame {
	
	//vars
	JButton raisedBevelBorderedButton, loweredBevelBorderedButton, raisedEtchedBorderedButton, loweredEtchedBorderedButton,
			lineBorderedButton, matteBorderedButton, compoundBorderedButton, emptyBorderedButton;
	
	Border border = null;
	
	BorderDemo() {
		
		//create content pane - container
		Container container = this.getContentPane();
		
		//set a layout for content pane
		container.setLayout(new FlowLayout());
		
		//create push buttons
		raisedBevelBorderedButton = new JButton("Raised Bevel Border");
		loweredBevelBorderedButton = new JButton("Lowered Bevel Border");
		raisedEtchedBorderedButton = new JButton("Raised Etched Border");
		loweredEtchedBorderedButton = new JButton("Lowered Etched Border");
		lineBorderedButton = new JButton("Line Border");
		matteBorderedButton = new JButton("Matte Border");
		compoundBorderedButton = new JButton("Compound Border");
		emptyBorderedButton = new JButton("Empty Border");
		
		//set raised bevel border for raisedBevelBorderedButton with highlighting color : RED, shadow color : GREEN
		border = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.GREEN);
		raisedBevelBorderedButton.setBorder(border);
		
		//set lowered bevel border for loweredBevelBorderedButton with highlighting color : RED, shadow color : GREEN
		border = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.RED, Color.GREEN);
		loweredBevelBorderedButton.setBorder(border);
		
		//set raised etched border for raisedEtchedBorderedButton with highlighting color : RED, shadow color : GREEN
		border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GREEN);
		raisedEtchedBorderedButton.setBorder(border);
		
		//set lowered etched border for loweredEtchedBorderedButton with highlighting color : RED, shadow color : GREEN
		border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GREEN);
		loweredEtchedBorderedButton.setBorder(border);
		
		//set line border for lineBorderedButton with color : RED and width 5 px
		border = BorderFactory.createLineBorder(Color.RED, 3);
		lineBorderedButton.setBorder(border);
		
		//set matte border for matteBorderedButton with color : RED and top, left, bottom, right widths as 5, 10, 15,20 px
		border = BorderFactory.createMatteBorder(5, 10, 15, 20, Color.RED);
		matteBorderedButton.setBorder(border);
		
		//set compound border for compoundBorderedButton without any borders inside or outside edges
		border = BorderFactory.createCompoundBorder();
		compoundBorderedButton.setBorder(border);
		
		//set empty border for emptyBorderedButton without any any space for border
		border = BorderFactory.createEmptyBorder();
		emptyBorderedButton.setBorder(border);
				
		
		//add the raisedBevelBorderedButton to the container
		container.add(raisedBevelBorderedButton);
		
		//add the loweredBevelBorderedButton to the container
		container.add(loweredBevelBorderedButton);
		
		//add the raisedEtchedBorderedButton to the container
		container.add(raisedEtchedBorderedButton);
		
		//add the loweredEtchedBorderedButton to the container
		container.add(loweredEtchedBorderedButton);
		
		//add the lineBorderedButton to the container
		container.add(lineBorderedButton);
		
		//add the matteBorderedButton to the container
		container.add(matteBorderedButton);
		
		//add the compoundBorderedButton to the container
		container.add(compoundBorderedButton);
		
		//add the compoundBorderedButton to the container
		container.add(emptyBorderedButton);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create a frame
		BorderDemo borderDemo = new BorderDemo();
		
		//set the title and size for frame
		borderDemo.setTitle("Borders");
		borderDemo.setSize(500, 400);
		
		//to open a maximized frame
		borderDemo.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		//display the frame
		borderDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		borderDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
