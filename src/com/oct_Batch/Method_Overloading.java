package com.oct_Batch;

public class Method_Overloading 
{
	
	public void sub(int age) {
System.out.println(7);
	}
	public void sub(String boy) {
System.out.println(boy);
	}
	public void sub(char c) {
System.out.println(c);
	}
	public void sub(int a ,int b , char c , int d) {
		
		System.out.println(a);
        System.out.println("boy");
		System.out.println(c);
		System.out.println(8);
		

	}
	
	public static void main(String[] args) {
		Method_Overloading N = new Method_Overloading();
N.sub(7);
N.sub("boy");
N.sub('j');
N.sub(1, 3, 'c', 8);
	}
	
	
	
}