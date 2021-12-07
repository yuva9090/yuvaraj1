package com.Abstraction;

public class Server extends Bank {

	@Override
	void Bankid() {
System.out.println("123");		
	}
	

	public static void main(String[] args) {
	
		Server i = new Server();
		
		i.Bankname();
		i.Bankid();
	}
	
}
