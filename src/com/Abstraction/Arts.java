package com.Abstraction;
public class Arts extends  Education {
	public void bsc() {
System.out.println("psg college");
	}
	public void bEd() {
System.out.println("nandha college");
	}
	private void bA() {
System.out.println("surya college");
	}
	private void bba() {
System.out.println("kathir college");	}
	
	@Override
	public void ug() {
		System.out.println("vcet college");
			}
@Override
	public void pg() {
		System.out.println("velalar college");
	}
	public static void main(String[] args) {
		Arts i = new Arts();
		i.bA();
		i.bba();
		i.bEd();
		i.bsc();
		i.pg();
		i.ug();
		
		
	}
	
	
	
	
	

}
