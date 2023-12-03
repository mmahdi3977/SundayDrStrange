package com.upskill.java_1;

public class AccessModifier {
	
	// public - Any class can access
	
	// private - Only same class can access
	
	// protected - classes in the same package and subclass
	
	// default - class in the same package can access
	
	public String name = "Mahdi"; //public
	
	private int age = 21; // private
	
	protected int ssn = 123456789; // protected
	
	/*default*/ String address = "Jamaica, New York"; // default (Don't have to mention anything before it)
	
	
	
	
	
	
	public static void main(String[] args){
		System.out.println("Hello world");
	}
	

}


