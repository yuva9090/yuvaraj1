package com.Methodoverloading;

public class Employee {

	public void Empid(int a) {
		System.out.println(a);

	}

	public void Empid(String s, int d, double t) {
		System.out.println(s);
		System.out.println(d);
		System.out.println(t );
	}

	public void Empid(int b, String c) {
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Employee sc = new Employee();
		sc.Empid(123);
		sc.Empid("yuva", 4, 22.5);
        sc.Empid(4, "raj");
	}

}
