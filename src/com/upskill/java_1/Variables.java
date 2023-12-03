package com.upskill.java_1;

public class Variables {
	
	// variables in Java
	
			// instance / global - variables declared in class level, outside method
			
			// static - variables belong to class and aren't required in creating objects
			
			// local - variables declared in methods
			
			// method parameter - variables used as method parameter, pass data from outside to inside of method
	
	static String country = "USA"; // static variable
	String president = "Joe Biden"; // global variable
	
	public static void newYork(){
		String city = "Queens"; // local variables 
		String cops = "NYPD";
		System.out.println(cops);
	}
	
	public static void texas(String food){
		String city = "Austin"; // local variables
		String cops = "APD";
		System.out.println(food);
	}
	
	public static void main(String[] args){
		Variables newObject = new Variables();
		newObject.newYork(); // local (obj required)
		System.out.println(newObject.president); // global (obj required)
		System.out.println(country); // static (obj not required)
		
		newObject.texas("steak");
	}
}
