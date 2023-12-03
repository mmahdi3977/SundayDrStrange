package com.upskill.java_2;

public class Loops {
/*
	Types of Loops
		For Loop
		While Loop
		Do While Loop
		Infinite Loop
*/
	
	public static void practiceForLoop() { 								// For Loop = Doing something over and over again
		int i; 															// i = iteration, initialize the variable
		for (i = 1; i <= 10; i++) { 									// setting lower limit, upper limit, increment or decrement
			System.out.println("For loop number = " + i);
		}
	}
	
	public static void practiceWhileLoop() { 							// While Loop = Doing something over and over again until condition matches
		int i = 1;														// Initialize the variable
		while (i <= 10) {												// Set the condition
			System.out.println("While loop number = " + i);				// Statement
			i++;														// Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop() {							// Do While Loop = Do action then match condition
		int i = 1;														// Initialize the variable
															
		do {															
			System.out.println("Do while loop number = " + i);			// Statement
			i++;														// Increment or decrement
		} while (i <= 10);												// Checks condition
	}
	
	public static void practiceInfiniteLoop() { 						// Infinite Loop = Never ending loop
		int i; 															// i = iteration, initialize the variable
		for (i = 1; ; i++) { 											// setting upper limit, increment or decrement
			System.out.println("For loop number = " + i);				// Statement
		}
	}
	
	public static void practiceNestedForLoop() {						// Nested Loop = Loop inside another loop
		int i;															// Initialize i for loop 1
		int j;															// Initialize j for loop 2			
		for (i = 1; i <= 10; i++) {										// First loop for i
			for (j = 1; j <= 10; j++) {									// Second loop for j
				int multiplicationTable = i * j;						
				System.out.print(multiplicationTable + " ");			// Statement for loop 2
			}
		System.out.println(" ");										// Statement for loop 1
		}
	}
	
	
	public static void main(String[] args) {
		// practiceForLoop();
		// practiceWhileLoop();
		// practiceDoWhileLoop();
		// practiceInfiniteLoop();
		
		practiceNestedForLoop();
		
	}

}
