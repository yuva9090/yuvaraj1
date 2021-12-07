package com.String_Methods;

public class Methods1 {
	public static void main(String[] args) {
		String s= "What is the major";
		String s1= "what is the minor";
		
		
		//LENGTH()                       total length of the inside the "" words oda counts
	int oi = s.length();
	System.out.println(oi);
	
	int oa = s1.length();
		System.out.println(oa);
		
		//charAT()                       input number ah koduthu console la letter ah get panrathu
char ob = s.charAt(6);
System.out.println(ob);
		
char oc = s1.charAt(9);		
System.out.println(oc);


//index()                                input letter ah koduthu - number get panrathu
int od = s.indexOf('j'); 
System.out.println(od);

int oe = s.indexOf('o');
System.out.println(oe);


//last index()                        s,s1 oda last letter ah koduthu output get panarathu

int of = s.lastIndexOf('r');
System.out.println(of);

int og = s1.lastIndexOf('r');
System.out.println(og);

//equals ()                   condition checking true or false ah nu

boolean oh = s.equals(s1);
System.out.println(oh);


}}