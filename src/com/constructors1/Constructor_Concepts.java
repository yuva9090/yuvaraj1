package com.constructors1;

public class Constructor_Concepts {
	
	public Constructor_Concepts() {   //non para
		System.out.println("non paramerised constructor");
		
	}
	public Constructor_Concepts(int a) {   // para
		System.out.println(a);
	System.out.println("parameterised constructor ");	
	}
	
	public Constructor_Concepts(int a, int b) {   
		int c =a+b;
		System.out.println(c);
		
	}
	
	private void employee() {
System.out.println("emp name is sathish");
	}
	private void students() {
		// TODO Auto-generated method stub
System.out.println("student num is 890");
	}
	
	public static void main(String[] args) {
		
		Constructor_Concepts c = new Constructor_Concepts();
		Constructor_Concepts c1 = new Constructor_Concepts(9);
		Constructor_Concepts c2 = new Constructor_Concepts(9,9);
		
		c.employee();
		c1.students();
		
	}
	
	
	
	
	
	

}
