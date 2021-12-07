package com.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Linked_Hashmap {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<Integer, String>();

		// 1) PUT METHOD

		// (key , value)

		m.put(10, "yuva");
		m.put(20, "raaj"); // it prints random orders only
		m.put(30, "null");
		m.put(40, "yuva");
		m.put(50, "parkavi");
		m.put(60, "null");
		m.put(70, "yuva");
		m.put(80, "sundar");
		System.out.println(m);
		
		
		//2) SIZE METHOD

		int size = m.size();
		System.out.println(size);

		//3) GET METHOD

		String string = m.get(30);
		System.out.println(string);


		//4) KEYSET METHOD

		Set<Integer> Set = m.keySet();
		System.out.println(Set);

		//5) VALUES METHODS:-
		 Collection<String> values = m.values();
		System.out.println(values);

		//CONTAINS

		boolean containsKey = m.containsKey(20);
		System.out.println(containsKey);

		// CONTAINS VALUE 

		boolean containsValue = m.containsValue("yuva");
		System.out.println(containsValue);


		//ENTRY SET:-

		java.util.Set<Entry<Integer, String>> entrySet = m.entrySet();

		System.out.println(entrySet);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
