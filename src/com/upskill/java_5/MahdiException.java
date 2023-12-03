package com.upskill.java_5;

public class MahdiException extends Exception {
	
	String a;
	
	public MahdiException(String b) {
		a = b;
	}
}

// Final: When you use the word you can not inherit a class, you can not override a method
	   // For variable you can not reassign value to it

// Finally:  Use to throw block end of try catch statement, after all exceptions have been added
		  // Throw executed "try-catch" statement even if 