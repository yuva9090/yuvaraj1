package com.constructors1;

public class Yuva {
	
	public Yuva() {
		System.out.println("non paramatirised ");
	}
	
	public Yuva(int a) {
		System.out.println(a);
	System.out.println("paramatirized");	
	}
	
	public Yuva(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void employe() {

		System.out.println("employe is yuvaraj D");
	}
	private void student() {
System.out.println("student count is 09");
	}
	
	public static void main(String[] args) {
		Yuva c = new Yuva();
		Yuva c1 = new Yuva(2);
		Yuva c2 = new Yuva(1,2);
		c1.student();
		c1.employe();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
