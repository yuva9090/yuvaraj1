package com.Overriding;

public class New2 extends New {
	
	@Override
	public void stuname() {
		super.stuname();
	}
	@Override
	public void stuid() {
		super.stuid();
	}
	
	public static void main(String[] args) {
		
		New2 y = new New2();
		y.stuname();
		y.stuid();
	}
	
	
	
	
	
	

}
