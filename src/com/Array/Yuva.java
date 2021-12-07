package com.Array;

public class Yuva {

	public static void main(String[] args) {
		
		//datatype variable name = new datatype
		
		int c[] = new int[6];    // ARRAY SYNTAX 
		
		c[0]=11;
		c[1]=12;
		c[4]=15;
		c[5]=16;	
		c[0]=55;
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
	}
	
}
