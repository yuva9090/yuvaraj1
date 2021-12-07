package org.my_October;

public class Dept extends Student {
	
	public void deptname() {
System.out.println("ECE");
	}
	
	
	public static void main(String[] args) {
		
		
		Dept y = new Dept();
		y.name();
		y.id();
		y.deptname();
	}
	

}
