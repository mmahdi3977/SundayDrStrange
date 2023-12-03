package com.upskill.java_5;

public class InterfaceImplementation implements Interface {
	
	// Use "implements" keyword to inherit parent class from Interface class
	
	@Override
	public void iDoor() {
		System.out.println("My car has 2 doors");
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 3 wheels");
	}

	@Override
	public void iEngine() {
		System.out.println("My car has V6 engine");
	}

	@Override
	public String iSail() {
		System.out.println("My boat has a sloop sail");
		return "Sloop sail";
	}

	@Override
	public int iCabin() {
		return 25;
	}

}
