package com.constructors1;

public class mension {
	
	public mension() {
		System.out.println("id no");
	}

	
	public mension(String name) {
		System.out.println(name);
	}
	
	
	public mension(char id) {
		System.out.println(id);
	}
	
	
	
	public static void main(String[] args) {
		mension iv = new mension();
	mension iv1 = new mension("yuva");
	mension iv2 = new mension("890");
	}
}
