package com.upskill.assignment_2;

public class QuestionEight {
	
	public static void main(String args[]) {
		
		int number = 7;
		long factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		
		System.out.println("7! = " + factorial);
	}

}
