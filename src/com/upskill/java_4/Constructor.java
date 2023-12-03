package com.upskill.java_4;

public class Constructor {
	
	// Constructor is instance of class, method same as class name, java will execute constructor first
	// Constructor cannot be static or override nor void or return
	// Default Constructor: No constructor is initialized
	// Parameterized Constructor: Add different signature
	// Constructor Overloading: Different signature

	String studentName;
	int studentAge;
	
	public Constructor(String name) {
		 studentName = name;
		 
		 
	}
	
	public Constructor(String name, int age) {
		studentName = name;
		studentAge = age;
	}
	
	public static void main(String[] args) {
		Constructor newObject = new Constructor("Adnan");
		Constructor secondObject = new Constructor ("Mahdi", 21);
		
		System.out.println("Student Name: " + newObject.studentName);
		System.out.println("Student name: " + secondObject.studentName + " / Student Age: " + secondObject.studentAge);
		
	}
	
}
