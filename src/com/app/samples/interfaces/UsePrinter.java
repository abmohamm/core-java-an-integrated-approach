package com.app.samples.interfaces;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.lang.reflect.InvocationTargetException;

//interface Printer to send text to any printer
//creating an interface for printing
interface Printer {
	
	//to print the text sent to printer
	void printit(String text);	//public abstract by default
	//to disconnect from printer
	void disconnect();
}

//implementing interface for IBMPrinter
class IBMPrinter implements Printer {

	public void printit(String text) {
		// TODO Auto-generated method stub
		System.out.println("<===== " + text + " =====>");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("printing completed");
		System.out.println("disconnected from IBMPrinter!!!");
	}
	
}

//implementing interface for EpsonPrinter
class EpsonPrinter implements Printer {

	public void printit(String text) {
		// TODO Auto-generated method stub
		System.out.println("<===== " + text + " =====>");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("printing completed");
		System.out.println("disconnected from EpsonPrinter!!!");
	}
	
}

//using a Printer interface implementation classes
public class UsePrinter {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		// TODO Auto-generated method stub
		//attach FileReader to config.txt file to read data from it
		FileReader fileReader = new FileReader("epson_printer.txt");
		//connect LineNumberReader to FileReader to read one line at a time
		LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
		//read the first line from config.txt file
		String printerName = lineNumberReader.readLine();
		//store printer name in object clazz
		Class<?> clazz = Class.forName(printerName);
		//readLine represents printer name
		System.out.println("loading driver for : " + clazz.getSimpleName());
		//create an object to that class represented by printer name in clazz
		Printer printer = (Printer)clazz.getDeclaredConstructor().newInstance();	
		//send text to printit using Printer interface
		printer.printit("Hello, This is printed on printer!!!");
		//disconnect after printing
		printer.disconnect();
	}

}
