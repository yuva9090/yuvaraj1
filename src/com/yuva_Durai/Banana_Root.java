package com.yuva_Durai;

public class Banana_Root extends Banana_Flower{
	public void root() {
System.out.println("THIS ROOT IS SMALL :");
	}

	public static void main(String[] args) {
		Banana_Root N = new Banana_Root();
		N.root();
		N.flower();
		N.banana();
	}
}
