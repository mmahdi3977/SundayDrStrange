package com.upskill.assignment_2;

import java.util.Scanner;

public class QuestionTen {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Temp in Fahrenheit: ");
		
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("Temp in Celsius: " + celsius);
		
		scanner.close();
		
	}
	
}
