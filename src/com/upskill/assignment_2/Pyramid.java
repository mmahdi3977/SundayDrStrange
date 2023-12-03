package com.upskill.assignment_2;

public class Pyramid {

	public static void main(String[] args) {
		int a; // for rows
		int b; // for columns
		int numberOfRows = 10;
		
		for (a = 1; a <= numberOfRows; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
