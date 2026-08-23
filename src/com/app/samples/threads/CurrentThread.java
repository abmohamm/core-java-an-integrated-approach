//To find currently running thread in this program
package com.app.samples.threads;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find current thread!!!");
		Thread thread = Thread.currentThread();
		System.out.println("Current thread : " + thread);
		System.out.println("It's name : " + thread.getName());
	}

}
