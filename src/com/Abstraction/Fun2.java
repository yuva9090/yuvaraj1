package com.Abstraction;

public class Fun2 implements Fun {

	@Override
	public void gobi() {
		System.out.println("its green area");
	}

	@Override
	public void erode() {
		System.out.println("its turmaric area");
		
	}

	@Override
	public void tn() {
		System.out.println("its our state");
	}
	
public static void main(String[] args) {
	Fun2 o = new Fun2();
	o.gobi();
	o.erode();
	o.tn();
}

}
