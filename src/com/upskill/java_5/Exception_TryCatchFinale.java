package com.upskill.java_5;

public class Exception_TryCatchFinale {
	
	/* Java Exceptions - Use "try - catch - finally"
	 
	A.	Built-in Exceptions - Built-in exception throws by java which explain certain error situations
		1. ArithmeticException - error has occurred in an arithmetic operation
		2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index
		3. ClassNotFoundException - try to access a class whose definition is not found
		4. FileNotFoundException - a file is not accessible or does not open
		5. IOException - input-output operation failed or interrupted
		6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted
		7. NoSuchFieldException - class does not contain the field or variable specified
		8. NoSuchMethodException - accessing a method which is not found
		9. NullPointerException - referring to the members of a null object
		10. NumberFormatException  -  a method could not convert a string into a numeric format
		11. RuntimeException - any exception which occurs during runtime.
		12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
	B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java

	*/

	public static void main(String[] args) {
		
		
		// Exception Handling done using "Try Catch Finally"
		
		try {
			
			 int[] ageDrStrange = new int[]{25, 30, 35, 40, 45};
			 System.out.println("Student Age: " + ageDrStrange[10]);
			 
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Array Method Complete!");
		}
		
		
		// Specific Built-in Exceptions - NumberFormatException
		
		try {
			
			 int num = Integer.parseInt("five"); 
			 
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			System.out.println("Number Method Test Complete!");
		}
		
		
		// User Defined Exceptions
		
		try {
			 
			throw new MahdiException("Test");
		
		} catch (MahdiException e) {
			
			e.printStackTrace();
			System.out.println("This is a user-defined exception method!");
		}
		
		finally {
			System.out.println("Test Execution Completed!");
		}
	}
}

        // Throw = used inside method body, for throwing only one exception
		// User defined or built in

        // Throws = Used next to method parameter
		// public static void Nayeem () throws exception, ArrayIndexOutOfBoundsException, ArithmeticException {

        //  Used only when assuming a method might throw multiple exceptions
