package com.upskill.assignment_2;

public class QuestionSeven {
	public static void main(String args[]) {
		int a = 25;
		int b = 30;
		
		int swap = a;
		a = b;
		b = swap;
		
		System.out.println("a after swapping = " + a);
		System.out.println("b after swapping = " + b);
	}
}

// Logic = create a temporary variable that holds the value of 'a' then make 'a' equal to 'b'
// after that make the temporary variable that was holding the value of 'a' equal to 'b' to make the switch