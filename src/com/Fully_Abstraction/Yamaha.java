package com.Fully_Abstraction;

public class Yamaha implements Honda {

	@Override
	public void unicorn() {
System.out.println("is nice milage bike");		
	}

public static void main(String[] args) {
	
	Yamaha in = new Yamaha();
	in.unicorn();
}	
	

}
