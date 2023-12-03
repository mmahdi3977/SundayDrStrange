package com.upskill.java_5;

public abstract class AbstractClass {
	// Three types of class - Class, Abstract Class and Interface
	// Regular Class - Only regular methods
	// Abstract Class - Abstract methods and regular methods
	// Interface Class - Only abstract method
	
		// Abstract class has both abstract method and regular method
		// Hiding the implementation using abstract class
	
	// Absolute Abstract - When you only have abstract methods in an abstract class
	
	public void car() {
		System.out.println("My car is Tesla");
	}
	
	public abstract void iDoor();
	
	public abstract void iWheel();
	
	public abstract void iEngine();
	
	public String Boat() {
		String transportationType = "sail";
		return transportationType;
	}
	
	public String color() {
		return "Red";
	}
		
	public abstract String iSail();
	
	public abstract int iCabin();
	
	
	
	
}