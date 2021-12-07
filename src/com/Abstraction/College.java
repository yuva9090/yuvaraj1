package com.Abstraction;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("vcet");
		
	}

	@Override
	public void pg() {
		System.out.println("velalar college");
	}
	
public static void main(String[] args) {
	
	College i = new College();
	i.pg();
	i.ug();
	
}
}
