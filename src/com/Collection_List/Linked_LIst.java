package com.Collection_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked_LIst {

	public static void main(String[] args) {
		
		List<Object> li = new LinkedList<Object>();
		
		//add
		li.add(10);
		li.add(20);
		li.add("radha");
		li.add(60.89);
		li.add('s');
		li.add(30);
		System.out.println(li);
		
		//size
		
		int size = li.size();
		System.out.println(size);
		
		//get
		
		Object obj = li.get(2);
		System.out.println(obj);
		
		//set
		li.set(3, 100);                  //no return type  
		System.out.println(li);
		
		
		//indexof
		int indexOf = li.indexOf(30);
		System.out.println(indexOf);
		
		//contains
		boolean contains = li.contains(100);
		System.out.println(contains);
		
		
		
		
		//addall
		
		List<Integer> li1 = new LinkedList<Integer>();
		
		li1.add(55);
		li1.add(65);
		li1.add(75);
		li1.add(85);
		li1.add(95);
	System.out.println(li1);
		
//	li.addAll(li1);
//	System.out.println(li);                     // mixed 
//
//
//	//retain all               // now run pgm means commonad the codings
//	li.retainAll(li1);
//	System.out.println(li);     // to return the common value of  2 list
	
	//removeall
	//li.removeAll(li1);
	//System.out.println(li);          // to remove the common value


	//basically LIST prints in INSERTION Order, SUPPOSE we want ACENDING OR DCENDIND order means  we are going to COLLECTIONS

	//acending order
	Collections.sort(li1);
	System.out.println(li1);

	//decending order

	Collections.sort(li1, Collections.reverseOrder());
	System.out.println(li1);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
