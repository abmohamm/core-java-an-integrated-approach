//JTree demo
package com.app.samples.graphicsprogrammingusingSWING;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTreeDemo extends JFrame implements TreeSelectionListener {

	//vars - to create root node
	DefaultMutableTreeNode rootNode, directoryOne, directoryTwo, fileOne, fileTwo, fileThree;
	
	//JTree
	JTree tree;
	
	//container to hold components
	Container container;
	
	//text to be displayed in text area
	String message = "";
	
	//text area
	JTextArea textArea;
	
	JTreeDemo() {
		
		//create content pane container
		container = this.getContentPane();
		
		//set border layout to container
		container.setLayout(new BorderLayout());
		
		//create root node
		rootNode = new DefaultMutableTreeNode("C:\\");
		
		//create other nodes
		directoryOne = new DefaultMutableTreeNode("Java Programs");
		directoryTwo = new DefaultMutableTreeNode("Other Programs");
		
		fileOne = new DefaultMutableTreeNode("JButtonDemo.java");
		fileTwo = new DefaultMutableTreeNode("JCheckBoxDemo.java");
		fileThree = new DefaultMutableTreeNode("xyz.c");
		
		//add directoryOne to rootNode
		rootNode.add(directoryOne);
		
		//add other nodes to directoryOne
		directoryOne.add(fileOne);
		directoryOne.add(fileTwo);
		directoryOne.add(directoryTwo);
		
		//add fileThree as node in directoryTwo
		directoryTwo.add(fileThree);
		
		//create the tree from root node
		tree = new JTree(rootNode);
		
		//add tree to container
		container.add("North", tree);
		
		//create 3 empty labels and add to container
		textArea = new JTextArea();
		container.add("South",  textArea);
		
		//add tree selection listener to the tree
		tree.addTreeSelectionListener(this);
	}

	//this method belongs  to tree selection listener
	public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
		
		// TODO Auto-generated method stub
		//let us find out the newly selected item path
		TreePath treePath = treeSelectionEvent.getNewLeadSelectionPath();
		message = message + "\nPath of selected component : " + treePath;
		
		Object component = treePath.getLastPathComponent();
		message = message + "\nComponent selected : " + component;
		
		int pathNumber = treePath.getPathCount();
		message = message + "\nLevel of Component : " + pathNumber;
		
		//set the user selection to the label
		textArea.setText(message);
		message = "";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//create frame
		JTreeDemo treeDemo = new JTreeDemo();
		
		//set title and size
		treeDemo.setTitle("My Tree");
		treeDemo.setSize(500, 400);
		
		//to open a maximized frame
		treeDemo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//display the frame
		treeDemo.setVisible(true);
		
		//close the application upon clicking on close button of frame
		treeDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

}
