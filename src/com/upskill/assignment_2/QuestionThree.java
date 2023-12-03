package com.upskill.assignment_2;

public class QuestionThree {
	
	public static int numberOne() {
		return 24;
	}
	
	public static int numberTwo() {
		return 50;
	}
	
	static int x = numberOne();
	static int y = numberTwo();
	
	public static void main(String args[])	{
		
		if (x > y) {
			System.out.println("First number is bigger than second number");
		} else {
			System.out.println("Second number is bigger than first number");
		}
		
	}
	
	
}
