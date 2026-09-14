//BoxLayout demo
package com.app.samples.graphicsprogramminglayoutmanagers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame {
	
	//container to hold components
	Container container;
	
	BoxLayoutDemo() {
		
		//create content-pane
		container = this.getContentPane();
	
		//set flow-layout
		container.setLayout(new FlowLayout());
		
		//add each panel(holds group of components) to container
		container.add(new BoxLayoutPanelOne());
		container.add(new BoxLayoutPanelTwo());
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		BoxLayoutDemo boxLayoutDemo = new BoxLayoutDemo();
		
		//set title and size
		boxLayoutDemo.setTitle("Box Layout");
		boxLayoutDemo.setSize(400, 400);
		
		//to open a maximized frame
		boxLayoutDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		boxLayoutDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		boxLayoutDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

//box-layout panel - arranging components along X_AXIS
class BoxLayoutPanelOne extends JPanel {
	
	//buttons
	JButton submit, next;
	
	//create box-layout
	BoxLayout boxLayout;
	
	BoxLayoutPanelOne() {
		
		//create box-layout object to arrange components along X_AXIS
		boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
		
		//set layout to JPanel
		this.setLayout(boxLayout);
		
		//create buttons and add them to panel using box-layout
		submit = new JButton("submit");
		next = new JButton("next");
		
		this.add(submit);
		this.add(next);
	}
}

//box-layout panel - arranging components along Y_AXIS
class BoxLayoutPanelTwo extends JPanel {
	
	//buttons
	JButton cancel, back, close;
		
	//create box-layout
	BoxLayout boxLayout;
	
	BoxLayoutPanelTwo() {
		
		//create box-layout object to arrange components along X_AXIS
		boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		
		//set layout to JPanel
		this.setLayout(boxLayout);
		
		//create buttons and add them to panel using box-layout
		cancel = new JButton("cancel");
		back = new JButton("back");
		close = new JButton("close");
		
		this.add(cancel);
		this.add(back);
		this.add(close);
	}
}
