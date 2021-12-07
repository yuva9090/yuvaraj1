package com.constructors1;

public class EmpDetails {

	public EmpDetails() {
		
System.out.println("yuva");

}
	


public EmpDetails(int id) {
	
System.out.println(id);
}
	


public EmpDetails(String name) {
	
System.out.println(name);
}

public static void main(String[] args) {
	EmpDetails ob = new EmpDetails();
	EmpDetails ob1 = new EmpDetails(76);
	EmpDetails ob2 = new EmpDetails("guna");
	
	
}
	
}
