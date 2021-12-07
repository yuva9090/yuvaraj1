package com.Overriding;

public class Yuva2 extends Yuva {

@Override
public void add() {
	System.out.println(11);
	
}
@Override
	public void multi() {
	System.out.println(22);
	}


public static void main(String[] args) {
	Yuva2 kk = new Yuva2();
	kk.add();
	kk.multi();
	
	
}

}
