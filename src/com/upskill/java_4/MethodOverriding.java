package com.upskill.java_4;
import com.upskill.java_1.MethodType;

public class MethodOverriding extends MethodType{

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.incomeWeeklyStatic();
		
	}

	public static void incomeWeeklyStatic() {
		int weeklyIncome = 1500; 
	}
}
