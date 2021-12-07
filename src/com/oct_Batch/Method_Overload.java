package com.oct_Batch;


public class Method_Overload {
	
	
	public void add(int age) {
System.out.println(age);
	}
	
	public  void add(String name){
   System.out.println(name);
 
	}

public void add(char c) {
System.out.println(c);

}
 public static void main(String[] args) {
	Method_Overload M = new Method_Overload();    ///OBJ SYNTAX
	M.add("MY AGE IS : ");
	M.add(9);
	M.add("yuva");
	
}

}
