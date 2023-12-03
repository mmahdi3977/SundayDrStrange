package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {

	public static void main(String[] args) {
		int age = 30;
		int[] ageDrStrange = new int[] {21, 25, 30, 35, 28};
		
		// Array Index 				    [0] [1] [2] [3] [4]
		
		System.out.println("Age: " + age);
		System.out.println("Age: " + ageDrStrange[4]);
		System.out.println("Length: " + ageDrStrange.length);

		
		String[] nameDrStrange = new String[] {"Mahdi", "Rasel", "Jisan", "Tarek", "Adnan", "Vlad", "Ishaq"};
		System.out.println("Name: " + nameDrStrange[2]);
		System.out.println("Length: " + nameDrStrange.length);
		
		
		
		// Multi Dimentional Array
		int[][] ageDrStrange2D = { {21, 25, 30, 35, 28},   // [0][0], [0][1], [0][2], [0][3], [0][4]
			
								   {15, 38, 10, 12, 14}};  // [1][0], [1][1], [1][2], [1][3], [1][4]
		
		System.out.println("2D Age: " + ageDrStrange2D [1][2]);
		
		
		// Hashmaps store multiple data using key-value pair, Implementation of Map Interface
		
		HashMap <String, Integer> Student = new HashMap <String, Integer>();
		
		Student.put("Jisan", 25);
		Student.put("Adnan", 26);
		Student.put("Vlad", 28);
		Student.put("Tarek", 23);
		Student.put("Mahdi", 21);
		Student.put("Ishaq", 21);
		
		System.out.println(Student.get("Adnan"));
		
		HashMap <String, String> Region = new HashMap <String, String>();
		
		Region.put("Albany", "New York");
		
		System.out.println("State: " + Region.get("Albany"));
		
		
		// HashSet store unordered collection containing unique value, implementation of set interface
		
		HashSet <String> car = new HashSet<String>();
		
		car.add("Toyota");
		car.add("BMW");
		car.add("Honda");
		car.add("Tesla");
		
		System.out.println(car);
		
		
		// HashTables store multiple data using key-value pair. No duplicate.
		// It is synchronized (only one thread can be modified)
		
		Hashtable <String, String> newRegion = new Hashtable <String, String>();
		newRegion.put("Bangladesh", "Asia");
		newRegion.put("USA", "America");
		
		System.out.println("Region: " + newRegion.get("Bangladesh"));
		
	}
}
