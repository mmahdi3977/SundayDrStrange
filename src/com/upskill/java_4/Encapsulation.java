package com.upskill.java_4;

public class Encapsulation {
	// Encapsulation is used to hide the data using setter and getter method
	
	private String name = "UpSkill";				// write and read
	private int SSN = 123456789;					// write only
	private String username = "mmahdi";				// read only
	
	// Setter Method - ssn							// Set the data, write
	public void setSSN(int value) {
		SSN = value; 
	}
	
	// Getter Method - username						// Get the data, read
	public String getUserName() {
		return username;
	}

	// Setter Method - name							// same
	public void SetName(String newName) {
		name = newName;
	}
	  
	// Getter Method - name							// same
	public String getName() {
		return name;
	}

	public static void main(String[] args) {			// create object to run the code
		Encapsulation object = new Encapsulation();
		object.getName();
		System.out.println(object.getName());
		
		object.SetName("Mahdi");
		object.setSSN(123456789);
		
		
	}

}
