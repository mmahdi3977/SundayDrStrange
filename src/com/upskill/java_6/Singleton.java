package com.upskill.java_6;

public class Singleton {
	
	// Singleton is a class that can have only one object
	private Singleton() {										 // makes constructor private (constructor always runs first)
	}
	
	private static Singleton singletonObject = new Singleton();  // create object of class and make it private, make object static 
	
	public static Singleton getInstance() {						 // getInstance = get method / return method
		return singletonObject;									 // returns object of the class
	}
	
	protected static void goldFarabi() {
		System.out.println("Farabi is gold");
	}
	
	protected static void silverMahdi() {
		System.out.println("Mahdi is silver");
	}

}
