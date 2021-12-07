package com.String_Methods;

public class Methods {
	
	
	public static void main(String[] args) {
		String s= "    Welcome to java  ";
String s1 = "welcome to python";
String s2 = "";
String s3 = " ";
String s4 = null;
		
		// length()       
int length = s.length();	
System.out.println(length);


//charAt

char charAt = s.charAt(8);
System.out.println(charAt);


//index()

int indexOf = s.indexOf('t');
System.out.println(indexOf);
		

int indexOf2 = s.indexOf('a');
System.out.println(indexOf2);
		
		
//Lastindex()
int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		
		//equals()
boolean equals = s.equals(s1);		
System.out.println(equals);


//equalignore

boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
System.out.println(equalsIgnoreCase);


//contains
boolean contains = s1.contains("java");
System.out.println(contains);


//upper()
String upperCase = s1.toUpperCase();
System.out.println(upperCase);


//lower case()
String lowerCase = s1.toLowerCase();
System.out.println(lowerCase);


//concat()

String concat = s.concat(s1);
System.out.println(concat);


//isempty()
boolean empty = s.isEmpty();
System.out.println(empty);


System.out.println(s2.isEmpty());
System.out.println(s3.isEmpty());

//startswith()
boolean startsWith = s.startsWith("Welcome");
System.out.println(startsWith);


//ends with()
boolean endsWith = s.endsWith("python");
System.out.println(endsWith);



//replace() 
String replace = s.replace("java", "python");
System.out.println(replace);

System.out.println(s1);


//trim()

int length2 = s.length();
System.out.println(length2);

//sub string()

String substring = s.substring(2);
		System.out.println(substring);
		
		String substring2 = s.substring(3,9);
		System.out.println(substring2);	

}}
