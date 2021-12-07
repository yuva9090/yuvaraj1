package com.constructors1;

public class Constructor_Exam {
	
	public Constructor_Exam() {
		
	}
	
	public Constructor_Exam(String name) {
	System.out.println(name);
	
}

public Constructor_Exam(int no) {
System.out.println(no);

}

public static void main(String[] args) throws Throwable {
	
	Constructor_Exam w = new Constructor_Exam();
	Constructor_Exam w1 = new Constructor_Exam("yuva");
	Constructor_Exam w2 = new Constructor_Exam(898);
	w2.finalize();
	
}






	
	
	
	

}
