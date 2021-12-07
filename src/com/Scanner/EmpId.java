package com.Scanner;

import java.util.Scanner;

public class EmpId {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("emp id no is ");
    int i = sc.nextInt();
	System.out.println(i);

  	System.out.println("emp name is ");
    String o = sc.next();	
	System.out.println(o);
	
	//System.out.println("emp email id is ");  // specl char + number  (( string - nextline we can use it  ))
	//String u = sc.nextLine(); 
	//System.out.println(u);
	
	System.out.println("emp phone num is ");
    long y = sc.nextLong();
	System.out.println(y);
	
	System.out.println("emp salary is");
    long t = sc.nextLong();
	System.out.println(t);
	
	System.out.println("emp gender is ");
	String r = sc.next();
	System.out.println(r);
	
	System.out.println("emp city is");
	String e = sc.next();
	System.out.println(e);
	
	}
	

}
