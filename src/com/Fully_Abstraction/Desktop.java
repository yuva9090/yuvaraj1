package com.Fully_Abstraction;

public class Desktop implements Hardware,Software{
	
	public void desktopmodel() {
System.out.println("intel i 7");
	}

	@Override
	public void softwareResources() {
		System.out.println("java");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		
		
	

	
	
	Desktop sc = new Desktop();
	sc.desktopmodel();
	sc.softwareResources();
	sc.hardwareResources();
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
