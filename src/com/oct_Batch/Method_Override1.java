package com.oct_Batch;

public class Method_Override1 extends Method_Override {

	@Override
	public void add(int a) {
		
		System.out.println(a);
		
	}
	@Override
	public void sum(int a) {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Method_Override1 M = new Method_Override1();
		M.add(5);
		M.sum(9);
	}
}
 