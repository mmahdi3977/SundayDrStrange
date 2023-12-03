package com.upskill.java_1;

public class MethodType {
	/* Types of methods
	
	1. Void method
	2. Static method
	3. Return type method
	 */
	
	
	static int incomeHourly = 60;
	
	// void method -- no data will be returned
	public static void incomeAnnualVoid(){
		int calculateIncomeAnnual = incomeHourly * 2000;
		System.out.println("My annual income: " + calculateIncomeAnnual);
		
	}
	
	// static method -- object not needed to be created
	public static void incomeWeeklyStatic(){
		int calculateIncomeWeekly = incomeHourly * 40;
		System.out.println("My weekly income: " + calculateIncomeWeekly);
	}
	
	// return type method -- data must return
	public int incomeMonthlyReturn(){
		int calculateIncomeMonthly = incomeHourly * 160;
		return calculateIncomeMonthly;
	}
	
	public String nameReturn(){
		String name = "Mahdi";
		return name;
	}
	
	
	public static void main(String[] args) {
		MethodType newObject = new MethodType();
		newObject.incomeAnnualVoid(); // void method needs object
		
		incomeWeeklyStatic(); // static method does not need object, you can call it directly
		
		System.out.println("My name: " + newObject.nameReturn());
		System.out.println("My monthly income: " + newObject.incomeMonthlyReturn());	
	}
	
}
