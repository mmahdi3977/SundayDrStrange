package com.upskill.java_4;
import com.upskill.java_1.MethodType;
public class Polymorphism extends MethodType {
	
	// polymorphism is the ability of an object to take on many forms
	// method overloading (Compile time polymorphism/static binding) Same method name with different signature/parameter to overload
	// method overriding (Runtime polymorphism/dynamic binding) Same method name from Parent class to override

	public static void main(String[] args) {
		car("Mahdi", "Shadman");
		
		Polymorphism newObject = new Polymorphism();
		newObject.incomeAnnualVoid();

	}
	
	public static void car() {
		System.out.println("My car is Hynduai");
	}
	
	public static void car(String color) {
		System.out.println("My car is Hynduai. Its color is " + color);
		
	}
	
	public static void car(String color, int seats) {
		System.out.println("My car is Hynduai. Its color is " + color + ". It has " + seats + " seats.");
	}
	
	public static void car(int doors) {
		System.out.println("My car is Hynduai. It has " + doors + " doors");
	}
	
	public static void car(String ownerOne, String ownerTwo) {
		System.out.println("My car is owned by two people, " + ownerOne + " and " + ownerTwo);
	}
	
	public static void incomeAnnualVoid() {
		int pastAnnualIncome = 130000;
		int rentalIncome = 18000;
		int sideIncome = 15000;
		int bonus = 25000;
		int newIncome = pastAnnualIncome + rentalIncome + sideIncome + bonus;
		
		System.out.println("My new annual income is $" + newIncome);
	}
	
}	

