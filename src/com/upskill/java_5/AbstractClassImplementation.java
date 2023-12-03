package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {
	
	// Use "extends" keyword to inherit parent class from Abstract class

	@Override
	public void iDoor() {
		System.out.println("My car has four doors");
	}

	@Override
	public void iWheel() {
		System.out.println("My car has four wheels");		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has a V8 engine");
	}

	@Override
	public String iSail() {
		System.out.println("My boat has a ketch sail");
		return "Ketch sail";
	}

	@Override
	public int iCabin() {
		System.out.println("My boat has 20 cabins");
		return 20;
	}
	
	/*
	 
	(Parent)			(Keyword)			(Child)				(Keyword)				(GrandChild)
	Class				 extends			 Class
	Abstract Class	     extends			 Class
	Interface			 implements		     Class
	Interface            extends  			 Interface			Implements					Class
	
	*/
	
}
