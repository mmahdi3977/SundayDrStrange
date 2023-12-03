package com.upskill.assignment_2;

public class QuestionNine {
	
	public static void main(String args[]) {
		
		String firstWord = "Talen";
		String secondWord = "Tech";
		
		String temp = firstWord;
		firstWord = secondWord;
		secondWord = temp;
		
		System.out.println("First word 'Talen' after switch: " + firstWord);
		System.out.println("Second word 'Tech' after switch: " + secondWord);
	}

}
