package com.upskill.java_6;

public class MultiThreadingRunnable implements Runnable { 	// (Built-in Java class)
	
	public void run () {
		try {
			System.out.println("Thread Number: #" + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught!");
		}
	}
}
