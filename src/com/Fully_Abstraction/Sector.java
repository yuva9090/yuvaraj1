package com.Fully_Abstraction;

public class Sector implements Banking {

	@Override
	public void username() {
		System.out.println("yuva");
	}

	@Override
	public void pw() {
		System.out.println("1234");
	}
	public static void main(String[] args) {
		
		Sector iv = new Sector();
		iv.username();
		iv.pw();
	}

}
