package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		int user = 75;
		int age = 106;
		
		if (user > 65){
			System.out.println("He should retire");
		}
		
		if (age < 13) {
			System.out.println("You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a teenager");
		} else if (age >= 65) {
			if (age >= 100) {
				System.out.println("You are a champion");
			} else {
				System.out.println("You are a senior");
			}
		} else {
			System.out.println("You are an adult");
		}
	}

}
