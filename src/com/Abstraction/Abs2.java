package com.Abstraction;

public class Abs2 extends Abs1 {

	@Override
	void employeeId() {
System.out.println("60");		
	}
	public static void main(String[] args) {
		Abs2 m = new Abs2();
		m.employeeName();
		m.employeeId();
	}

}
