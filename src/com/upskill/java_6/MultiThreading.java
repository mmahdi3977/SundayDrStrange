package com.upskill.java_6;

public class MultiThreading {
/* MultiThreading allows for concurrent execution of two or more parts of a program
		
   Threads can be made using two mechanisms
		1. Extending "Thread" class (Built-in Java class)
		2. Implementing the "Runnable" Interface (Built-in Java class)
	
		3. Thread is a built-in Java class
		4. Runnable is a built-in Java interface */
	
	public static void main (String args[])	 {
		
		int n = 4;
		
		for (int i = 0; i < n; i++) {
			
			MultiThreadingThread newObject = new MultiThreadingThread();
			newObject.start();
			
			Thread secondObject = new Thread(new MultiThreadingRunnable());
			secondObject.start();
		}
	}

}
