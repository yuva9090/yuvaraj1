package com.your_Method;

public class Bmw_Car extends Audi_Car {

	
	
	public void engine() {
		
System.out.println("THIS ENGINE IS MOST POWERFULL :");
	}
	
	
	public static void main(String[] args) {
		Bmw_Car N = new Bmw_Car();
		N.engine();
		N.car();
	}
}
